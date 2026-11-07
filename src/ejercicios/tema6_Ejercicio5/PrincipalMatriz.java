package ejercicios.tema6_Ejercicio5;

import java.util.Scanner;

public class PrincipalMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Relationable[] almacenamiento = new Relationable[10];

		boolean salida = true;
		do {
			System.out.println("\n=== MENÚ DE GESTIÓN ===");
			System.out.println("1. Guardar Línea2D");
			System.out.println("2. Guardar Círculo");
			System.out.println("3. Mostrar todos los objetos almacenados");
			System.out.println("4. Mostrar todos los círculos");
			System.out.println("5. Mostrar todas las líneas2D");
			System.out.println("6. Mostrar el círculo con mayor área");
			System.out.println("7. Mostrar la línea más grande");
			System.out.println("8. Salir");

			//Sacnner:
			Scanner lector = new Scanner(System.in);

			int opcion = lector.nextInt();

			switch(opcion) {
			case 1:
				//Datos del Punto2D

				//Punto 1
				System.out.println("Punto2D - 1:");
				int p1X = Integer.parseInt(IO.readln("Introduce un valor x entero: "));
				int p1Y = Integer.parseInt(IO.readln("Introduce un valor y entero: "));

				Punto2D punto1 = new Punto2D(p1X,p1Y);

				//Punto 2
				System.out.println("Punto2D - 2:");

				int p2X = Integer.parseInt(IO.readln("Introduce un valor x entero: "));
				int p2Y = Integer.parseInt(IO.readln("Introduce un valor y entero: "));
				Punto2D punto2 = new Punto2D(p2X,p2Y);

				//Datos de Linea2D
				int lX = Integer.parseInt(IO.readln("Introduce un valor x entero: "));
				int lY = Integer.parseInt(IO.readln("Introduce un valor y entero: "));

				//Guardo el objeto linea2d
				boolean guardado1 = false;
				for(int i=0;i<almacenamiento.length;i++) {
					if(almacenamiento[i]==null) {
						almacenamiento[i] = new Linea2D(lX,lY,punto1,punto2);
						guardado1 = true;
						break;
					}
				}
				if(guardado1) {
					System.out.println("Guardado con éxito!");
				}
				else {
					System.out.println("No se ha podido guardar");
				}

				break;
			case 2:
				//Datos del radio
				float radio = Float.parseFloat(IO.readln("Introduzca el radio del circulo: "));

				//Guardo el objeto circulo
				boolean guardado2 = false;
				for(int i=0;i<almacenamiento.length;i++) {
					if(almacenamiento[i]==null) {
						almacenamiento[i] = new Circulo(radio);
						guardado2 = true;
						break;
					}
				}
				if(guardado2) {
					System.out.println("Guardado con éxito!");
				}
				else {
					System.out.println("No se ha podido guardar");
				}

				break;
			case 3:
				for(Relationable r : almacenamiento) {
					if(r!=null) {
						System.out.println(r);
					}
				}
				break;
			case 4:
				for(Relationable r : almacenamiento) {
					if(r!=null) {
						if(r instanceof Circulo) {
							System.out.println(r);
						}
					}
				}
				break;
			case 5:
				for(Relationable r : almacenamiento) {
					if(r!=null) {
						if(r instanceof Linea2D) {
							System.out.println(r);
						}
					}
				}
				break;
			case 6:
				boolean entrada = false;
				
				Circulo circuloMayorArea = new Circulo(1);
				
				
				for(int i=0;i<almacenamiento.length;i++) {
					if(almacenamiento[i] !=null) {
						if(almacenamiento[i] instanceof Circulo) {
							entrada = true;
							
							Circulo circuloActual = ((Circulo)almacenamiento[i]);
							
							if(circuloActual.isMayorQue(circuloActual, circuloMayorArea)) {
								circuloMayorArea = circuloActual;
							}
							
							
						}//cierre if (instanceof)
					}//cierre if (!=null)
				}//cierre for

				if(entrada) {
					System.out.println("El circulo con mayor area es: "+circuloMayorArea);
				}
				else {
					System.out.println("NO se han encontrado circulos en la matriz");
				}


				break;
			case 7:
				boolean entrada2 = false;
				
				Linea2D lineaMasGrande = new Linea2D(1,2,new Punto2D(1,2),new Punto2D(1,2));
				
				
				for(int i=0;i<almacenamiento.length;i++) {
					if(almacenamiento[i] !=null) {
						if(almacenamiento[i] instanceof Linea2D) {
							entrada2 = true;
							
							Linea2D lineaActual = ((Linea2D)almacenamiento[i]);

							if(lineaActual.isMayorQue(lineaActual, lineaMasGrande)) {
								lineaMasGrande = lineaActual;

							}//cierre if de contador
							
						}//cierre sif (instanceof)

					}//cierre if (!=null)
				}//ciere for
				if(entrada2) {
					System.out.println("La linea con mas grande es: "+lineaMasGrande);
				}
				else {
					System.out.println("NO se han encontrado lineas en la matriz");
				}
				break;
			case 8:
				salida = false;
				System.out.println("Hasta otra!");
				break;
			default:
				System.out.println("Opcion no valida");
				break;


			}

		}
		while(salida);
	}

}
