package ejercicios.tema7_Ejercicio3;

import java.io.*;
import java.util.*;

public class GestorSerie {

	//Atributos de clase
	private ArrayList<Serie> series = new ArrayList<Serie>();

	//Constructores:

	//constructor por defecto
	public GestorSerie(ArrayList<Serie> series) {
		super();
		this.series = series;
	}


	public void GuardarSerie(Serie s) {
		String ruta = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio3/AlmacenSeries.txt";
		boolean guardado = false;

		try (BufferedWriter bfEscritor = new BufferedWriter(new FileWriter(ruta, true))) {
			String val = Float.toString(0);
			String capitulos = Integer.toString(s.getCapitulos());
			String anho = Integer.toString(s.getAnho());

			if (s.getPlataforma() == Plataforma.Netflix || s.getPlataforma() == Plataforma.HBO
					|| s.getPlataforma() == Plataforma.Amazon || s.getPlataforma() == Plataforma.Prime
					|| s.getPlataforma() == Plataforma.Movistar || s.getPlataforma() == Plataforma.Rakuten) {
				
				bfEscritor.write(s.getTitulo() + ";" + val + ";"
						+ s.getGenero() + ";" + capitulos + ";" + anho + ";"
						+ s.getPlataforma());
				bfEscritor.newLine(); 

				guardado = true;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		if (guardado) {
			this.series.add(s);
		}
	}

	public void PuntuacionSerie(String titulo, float valoracion) {
		String ruta = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio3/Puntuacion.txt";

		for (int i = 0; i < this.series.size(); i++) {
			if (titulo.equalsIgnoreCase(this.series.get(i).getTitulo())) {

				try (BufferedWriter bfEscritor = new BufferedWriter(new FileWriter(ruta, true))) {
					bfEscritor.write(this.series.get(i).getTitulo() + "#" + valoracion);
					bfEscritor.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}

				float media = valoracionMedia(titulo);
				if (media != -1) {
					this.series.get(i).setValoracion(media);
					actualizarFicheroSeries();
				}
				break; 
			}
		}
	}

	public void MostrarSeries(ArrayList<Serie> series) {
		for(Serie a : series) {
			System.out.println(a);
		}
	}
	public void MostrarSeries(String titulo) {
		for(Serie a : series) {
			if(a.getTitulo().equalsIgnoreCase(titulo)) {
				System.out.println(a);
			}
		}
	}
	public ArrayList<Serie> recuperarInformacionSeries() {
		String ruta = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio3/AlmacenSeries.txt";
		ArrayList<Serie> seriesAlmacenadas = new ArrayList<Serie>();
		File fichero = new File(ruta);

		if (!fichero.exists()) {
			return seriesAlmacenadas;
		}

		try (BufferedReader bfLector = new BufferedReader(new FileReader(fichero))) {
			String linea = "";
			while (linea != null) {
				linea = bfLector.readLine();
				if (linea != null) {
					int primero = linea.indexOf(";");

					if (primero != -1) {
						int segundo = linea.indexOf(";", primero + 1);
						int tercero = linea.indexOf(";", segundo + 1);
						int cuarto = linea.indexOf(";", tercero + 1);
						int quinto = linea.indexOf(";", cuarto + 1);

						Serie serieNueva = new Serie(); // <-- DENTRO del bucle
						serieNueva.setTitulo(linea.substring(0, primero));
						serieNueva.setValoracion(Float.parseFloat(linea.substring(primero + 1, segundo)));
						serieNueva.setGenero(linea.substring(segundo + 1, tercero));
						serieNueva.setCapitulos(Integer.parseInt(linea.substring(tercero + 1, cuarto)));
						serieNueva.setAnho(Integer.parseInt(linea.substring(cuarto + 1, quinto)));
						serieNueva.setPlataforma(Plataforma.valueOf(linea.substring(quinto + 1, linea.length()))); // <-- quinto + 1

						seriesAlmacenadas.add(serieNueva);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return seriesAlmacenadas;
	}





	//Metodos privados
	//Metodo para puntuar
	private float valoracionMedia(String titulo) {
		String ruta = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio3/Puntuacion.txt";
		try (BufferedReader bfLector = new BufferedReader(new FileReader(ruta))) {

			int contador = 0;
			float total = 0;
			String linea = "";

			while (linea != null) {
				linea = bfLector.readLine();
				if (linea != null) {
					int longitud = linea.length();
					int posHastag = linea.indexOf("#");
					if (posHastag != -1) {
						// Guardamos cada trozo en su propia variable sin tocar 'linea'
						String tituloFichero = linea.substring(0, posHastag);
						String notaFichero = linea.substring(posHastag + 1, longitud);

						if (tituloFichero.equalsIgnoreCase(titulo)) {
							total += Float.parseFloat(notaFichero);
							contador++;
						}
					}
				}
			}

			if (contador == 0) {
				return -1;
			}

			total = total / contador;
			total = (float) Math.round(total * 10) / 10;

			return total;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return -1;
	}

	private void actualizarFicheroSeries() {
		String ruta = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio3/AlmacenSeries.txt";

		// Al NO poner 'true' (o poner 'false'), sobrescribe el fichero desde cero
		try (BufferedWriter bfEscritor = new BufferedWriter(new FileWriter(ruta, false))) {
			
			for (Serie s : this.series) {
				bfEscritor.write(s.getTitulo() + ";" + s.getValoracion() + ";"
						+ s.getGenero() + ";" + s.getCapitulos() + ";" + s.getAnho() + ";"
						+ s.getPlataforma());
				bfEscritor.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}






}
