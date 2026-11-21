package ejercicios.tema7_Ejercicio1;

import java.io.*;

public class Funciones {

	//Devuelve el número de registros del fichero que recibe como parámetro.
	public static int contarRegistros(String ruta) {
		
		int registros  = 0;
		try(BufferedReader bfLector = new BufferedReader(new FileReader(ruta))){
			String linea = "";
			
			while ((linea = bfLector.readLine()) != null) {
				
				if(!linea.isBlank()) {
					registros  ++;
				}
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return registros;
	}
	
	//Escribe en el fichero el mensaje recibido.
	public static void escribeFichero(String ruta , String mensaje) {
		
		try(BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta,true))){
			
			escritor.write(mensaje);
			escritor.newLine();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//Vuelca a una matriz de Strings el contenido del fichero , 
	//cada registro en una posición de la matriz
	public static String [] volcarFicheroAMatriz(String ruta) {
		
		int total = Funciones.contarRegistros(ruta);
		
		String [] registros = new String[total];
		String linea = "";
		int contador = 0;
		
		try(BufferedReader bfLector = new BufferedReader(new FileReader(ruta))){
			
			while((linea = bfLector.readLine())!=null) {
				if(!linea.isBlank()) {
					registros[contador] = linea;
					contador++;
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return registros;
	}
	
	// Sobrescribe el fichero indicado escribiendo cada elemento de la matriz en una línea 
	//nueva.
	public static void volcarMatrizAFichero(String matriz[] , String ruta) {
		String linea ="";
		try(BufferedWriter bfEscritor = new BufferedWriter(new FileWriter(ruta))){
			
			
			for(int i=0;i<matriz.length;i++) {
				linea = matriz[i];
				bfEscritor.write(linea);
				bfEscritor.newLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Lista por pantalla los directorios existentes en la ruta que recibe como parámetro. 
	public static void mostrarDirectorios(String ruta) {
			File archivo = new File(ruta);
			
			File[] subDirectorios = archivo.listFiles();
			int contador = 0;
			
			String[] directorios = new String[subDirectorios.length];
			
			//Recojo los nombres de los directorios en un array
			for(int i=0;i<subDirectorios.length;i++) {
				if(subDirectorios[i].isDirectory()) {
					directorios[contador] = subDirectorios[i].getName();
					contador ++;
				}
			}
			
			boolean primero = true;
			//Muestro el array con los directorios
			for(int i=0;i<directorios.length;i++) {
				if(directorios[i]!=null) {
					if(!primero) {
						System.out.print(", ");
					}
					System.out.print(directorios[i]);
					primero = false;
				}
			}
			
		
	}
	
	//Muestra el nombre de los fichero cuya extensión coincida con el segundo argumento 
	//recibido.
	public static void mostrarFicheros(String ruta , String extension) {
		File gestor = new File(ruta);
		
		File[] archivos = gestor.listFiles();
		
		boolean primero = true;
		
		for(int i=0;i<archivos.length;i++) {
			if(archivos[i]!=null) {
				if(archivos[i].isFile()) {
					int posPunto = archivos[i].getName().lastIndexOf(".");
					if(archivos[i].getName().substring(posPunto+1, archivos[i].getName().length()).equals(extension)) {
						
						if(!primero) {
							System.out.print(" , ");
						}
						System.out.print(archivos[i].getName());
						primero = false;
					}
				}
			}
		}
	}

	
}
