package ejercicios.tema5;

import java.time.LocalDate;
import java.util.Scanner;

public class TestSolicitud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a.	Crear una nueva Solicitud
		Solicitud s1 = new Solicitud();
		Solicitud s2 = new Solicitud();
		Solicitud s3 = new Solicitud();
		//b.	Modificar el estado de una Solicitud a partir del código.
		s1.setEstado("Proceso");
		s2.setEstado("Rechazada");
		s3.setEstado("Rechazada");
		//c.	Mostrar todas las solicitudes según el estado.
		Solicitud[] matrizS = new Solicitud[10]; 
		matrizS[0] = s1;
		matrizS[1] = s2;
		matrizS[2] = s3;
		
		
		Scanner lector = new Scanner(System.in);
		
		boolean salida = true;
		
		do {
			System.out.println("\nIntroduzca el estado de las solicitudes que desee listar (Pendiente, Admitida, Proceso, Rechazada). \nSi desea salir, introduzca \"salir\": ");
			String opcion = lector.nextLine();
			
			// CORREGIDO: Eliminado el switch gigante repetitivo por una estructura limpia
			if (opcion.equalsIgnoreCase("salir")) {
				System.out.println("Hasta otra!");
				salida = false;
			} 
			else if (opcion.equals("Pendiente") || opcion.equals("Admitida") || 
					 opcion.equals("Proceso") || opcion.equals("Rechazada")) {
				
				System.out.println("--- Listando solicitudes en estado: " + opcion + " ---");
				for (int i = 0; i < matrizS.length; i++) {
					if (matrizS[i] != null) {
						if (matrizS[i].getEstado().equalsIgnoreCase(opcion)) {
							System.out.println(matrizS[i]);
						}
					}
				}
			} 
			else {
				System.out.println("Opción no válida, por favor introduzca un estado correcto.");
			}
			
		} while (salida);	
		
		
		//d.	Modificar fecha de la solicitud.
		s2.setFecha(2008,5,8);
		//e.	Mostrar todas las solicitudes realizadas en una determinada fecha
			
		String a = IO.readln("Introduzca el año de la solicitud: ");
		String m = IO.readln("Introduzca el mes de la solicitud: ");
		String d = IO.readln("Introduzca el dia de la solicitud: ");
		int año = Integer.parseInt(a);
		int mes = Integer.parseInt(m);
		int dia = Integer.parseInt(d);
		
		
		LocalDate fechaBusqueda = LocalDate.of(año, mes, dia);
		
		for(int i=0;i<matrizS.length;i++) {
			if(matrizS[i]!=null) {
				if(matrizS[i].getFecha().equals(fechaBusqueda)) {
					System.out.println(matrizS[i]);
				}
			}
		}
			
			

		
	}

}
