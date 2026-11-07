package ejercicios.tema6_Ejercicio6;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		Password[] contraseñas = new Password[20];
		int contador = 0;
		
		// Creación e inserción directa de objetos PasswordPlus
		contraseñas[contador++] = new PasswordPlus("Segura2026Total"); // Fuerte
		contraseñas[contador++] = new PasswordPlus("abcde6");          // Débil
		contraseñas[contador++] = new PasswordPlus("ClaveMaestra1");   // Fuerte

		// Creación e inserción directa de objetos PasswordFree
		contraseñas[contador++] = new PasswordFree("123");             // Débil
		contraseñas[contador++] = new PasswordFree("HolaMundo");       // Fuerte
		
		// Definimos el Scanner fuera del bucle para optimizar rendimiento
		Scanner lector = new Scanner(System.in);
		boolean salida = true;
		
		do {
			System.out.println();
			System.out.println("1.\tMostrar passwords fuertes");
			System.out.println("2.\tMostrar passwords plus");
			System.out.println("3.\tMostrar passwords free");
			System.out.println("4.\tMostrar ordenados los passwords alfabéticamente");
			System.out.println("5.\tSalir");
			System.out.print("Selecciona una opción: ");
			
			int opcion = lector.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("\n--- PASSWORDS FUERTES ---");
					for(Password p : contraseñas) {
						if(p != null) {
							if(p.getFortaleza().equalsIgnoreCase("Fuerte")) {
								System.out.println(p);
							}
						}
					}
					break;
				case 2:
					System.out.println("\n--- PASSWORDS PLUS ---");
					for(Password p : contraseñas) {
						if(p != null) {
							if(p instanceof PasswordPlus) {
								System.out.println(p);
							}
						}
					}
					break;
				case 3:
					System.out.println("\n--- PASSWORDS FREE ---");
					for(Password p : contraseñas) {
						if(p != null) {
							if(p instanceof PasswordFree) {
								System.out.println(p);
							}
						}
					}
					break;
				case 4:
					System.out.println("\n--- PASSWORDS ORDENADOS ALFABÉTICAMENTE ---");
					// CORRECCIÓN: Pasamos 'contador' en lugar de 'contraseñas.length' para evitar NullPointerException
					Password.ordenarAlfabeticamente(contraseñas, contador);
					
					// Mostramos el resultado del array ya ordenado
					for (int i = 0; i < contador; i++) {
						System.out.println(contraseñas[i]);
					}
					break;
				case 5:
					salida = false;
					System.out.println("Hasta otra!");
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}
			
		} while(salida);
		
		lector.close(); // Cerramos el recurso al terminar
	}
}
