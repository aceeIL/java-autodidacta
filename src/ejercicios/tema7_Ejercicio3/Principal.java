package ejercicios.tema7_Ejercicio3;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		// 1. Creamos el gestor y recuperamos las series guardadas en el fichero al arrancar
		GestorSerie gestor = new GestorSerie(new ArrayList<Serie>());
		ArrayList<Serie> series = gestor.recuperarInformacionSeries();
		gestor = new GestorSerie(series);

		boolean entrada = true;

		do {
			System.out.println("\nBienvenido al gestor de series");
			System.out.println("1. Guardar una serie nueva");
			System.out.println("2. Puntuar una serie");
			System.out.println("3. Mostrar series");
			System.out.println("4. Mostrar series por titulo");
			System.out.println("5. Salir.");

			int opcion = Integer.parseInt(IO.readln("Elige una opcion: "));

			switch (opcion) {
			case 1:
				String titulo = IO.readln("Introduzca el titulo de la serie: ");
				int capitulos = Integer.parseInt(IO.readln("Introduzca el numero de capitulos: "));
				String genero = IO.readln("Introduzca el genero de la serie: ");
				int anho = Integer.parseInt(IO.readln("Introduzca el año de la serie: "));
				String plataforma = IO.readln("Introduzca la plataforma (Netflix, HBO, Amazon, Prime, Rakuten, Movistar): ");
				Plataforma pltforma = Plataforma.valueOf(plataforma);

				gestor.GuardarSerie(new Serie(titulo, capitulos, genero, anho, pltforma));
				break;

			case 2:
				String titulo2 = IO.readln("Introduzca el titulo de la serie: ");
				float val = Float.parseFloat(IO.readln("Introduzca la valoracion: "));

				gestor.PuntuacionSerie(titulo2, val);
				break;

			case 3:
				gestor.MostrarSeries(series);
				break;

			case 4:
				String titulo3 = IO.readln("Introduzca el titulo de la serie: ");

				gestor.MostrarSeries(titulo3);
				break;

			case 5:
				System.out.println("Hasta otra!");
				entrada = false;
				break;

			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (entrada);
	}
}