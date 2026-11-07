package ejercicios.tema6_Ejercicio7;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Matriz donde almacenan los datos introducidos por el usuario
		Servicio[] servicios = new Servicio[30];
		
		boolean salida = true;
		do {
			System.out.println("Bienvenido al gestor de servicios!"+"\n");
			System.out.println("1.	Añadir un servicio de pintura.");
			System.out.println("2.	Añadir un servicio de revisión de alarmas.");
			System.out.println("3.	Mostrar el total facturado.");
			System.out.println("4.	Mostrar total ingresados por Tipo de Servicio.");
			System.out.println("5.	Eliminar un Servicio");
			System.out.println("6.	Salir.");
			
			System.out.print("Introduzca una opcion del 1-6: ");
			//Lector
			Scanner lector = new Scanner(System.in);
			int opcion = lector.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Introduzca los datos relativos al servicio de pintura: ");
				String trabajadorC1 = IO.readln("Nombre del trabajador: ");
				String clienteC1 = IO.readln("Nombre del cliente: ");
				double superficieC1 = Double.parseDouble(IO.readln("Introduzca la supericie a pintar en metros cuadrados: "));
				double precioPinturaC1 = Double.parseDouble(IO.readln("Introduzca el precio final de la pintura: "));
				
				//Introduzco el servicio
				boolean añadido1 = false;
				for(int i=0;i<servicios.length;i++) {
					if(servicios[i]==null) {
						servicios[i] = new Pintura(trabajadorC1,LocalDate.now(),clienteC1,superficieC1,precioPinturaC1);
						añadido1 = true;
						break;
					}
				}
				if(añadido1) {
					System.out.println("Servicio añadido correctamente al sistema");
				}
				else System.out.println("Ha habido un error al añadir el servicio.Intentelo de nuevo!");
				break;
			case 2:
				System.out.println("Introduzca los datos relativos al servicio de alarmas: ");
				String trabajadorC2 = IO.readln("Nombre del trabajador: ");
				String clienteC2 = IO.readln("Nombre del cliente: ");
				int numeroAlarmasC2 = Integer.parseInt(IO.readln("Introduzca el nº de alarmas a revisar: "));
				
				//Fecha de revision
				System.out.println("Datos relacionados con la fecha de revision: ");
				int añoC2 = Integer.parseInt(IO.readln("Introduzca el año: "));
				int mesC2 = Integer.parseInt(IO.readln("Introduzca el mes: "));
				int diaC2 = Integer.parseInt(IO.readln("Introduzca el dia: "));
				
				//Introduzco el servicio
				boolean añadido2 = false;
				for(int i=0;i<servicios.length;i++) {
					if(servicios[i]==null) {
						servicios[i] = new AlarmasContraIncendios(trabajadorC2,LocalDate.now(),clienteC2,añoC2,mesC2,diaC2,numeroAlarmasC2);
						añadido2 = true;
						break;
					}
				}
				if(añadido2) {
					System.out.println("Servicio añadido correctamente al sistema");
				}
				else System.out.println("Ha habido un error al añadir el servicio.Intentelo de nuevo!");
				break;
			case 3:
				String cadenaFinal = "";
				for(Servicio s : servicios) {
					if(s!=null) {
						cadenaFinal += s.detalleServicio();
					}
				}
				System.out.println(cadenaFinal);
				
				break;
			case 4:
				
				boolean salidaC4 = true;
				
				do {
				System.out.println("Que servicio desea ver su total facturado:");
				System.out.println("1. Pintura");
				System.out.println("2. Alarmas");
				System.out.println("3. Salir");
				System.out.print("Introduzca una opcion del 1-3: ");
				
				Scanner lector2 = new Scanner(System.in);
				int opcionesCase4 = lector2.nextInt();
				
				switch(opcionesCase4) {
				case 1:
					String cadenaFinalPintura = "";
					double totalFacturadoPintura =0;
					for(Servicio s : servicios) {
						if(s!=null) {
							if(s instanceof Pintura) {
								cadenaFinalPintura += s.detalleServicio();
								totalFacturadoPintura += s.costeTotal();
							}
						}
					}
					System.out.println(cadenaFinalPintura);
					
					double costeRedondeadoPintura = Math.round(totalFacturadoPintura * 100.0) / 100.0;
					System.out.println("----------------------");
					System.out.println("TOTAL FACTURADO: " +costeRedondeadoPintura + "€");
					System.out.println("----------------------");
					break;
				case 2:
					String cadenaFinalAlarmas = "";
					double totalFacturadoAlarmas =0;
					for(Servicio s : servicios) {
						if(s!=null) {
							if(s instanceof AlarmasContraIncendios) {
								cadenaFinalAlarmas += s.detalleServicio();
								totalFacturadoAlarmas += s.costeTotal();
							}
						}
					}
					System.out.println(cadenaFinalAlarmas);
					
					double costeRedondeadoAlarmas = Math.round(totalFacturadoAlarmas * 100.0) / 100.0;

					
					System.out.println("----------------------");
					System.out.println("TOTAL FACTURADO: " +costeRedondeadoAlarmas +"€");
					System.out.println("----------------------");
					break;
				case 3:
					salidaC4 = false;
					System.out.println("saliendo...");
					break;
				default: 
					System.out.println("Opcion no valida");
					break;
				}
				
				
				}
				while(salidaC4);
				
				
				break;
			case 5:
				boolean salidaC5 = true;
				
				do {
				System.out.println("Que tipo de servicio desea eliminar:");
				System.out.println("1. Pintura");
				System.out.println("2. Alarmas");
				System.out.println("3. Salir");
				System.out.print("Introduzca una opcion del 1-3: ");
				
				Scanner lector3 = new Scanner(System.in);
				int opcionesCase5 = lector3.nextInt();
				
				switch(opcionesCase5) {
				case 1:
					System.out.println("Introduzca los siguientes datos del servicio a eliminar: ");
					String clienteC5 = IO.readln("Introduce el nombre del cliente: ");
					int superficieC5 = Integer.parseInt(IO.readln("Introduce la superficie pintada"));
					
					//Fecha de inicio
					System.out.println("Introduzca los datos sobre la fecha de inicio:");
					int añoC5P = Integer.parseInt(IO.readln("Introduce el año de la fecha: "));
					int mesC5P = Integer.parseInt(IO.readln("Introduce el mes de la fecha: "));
					int diaC5P = Integer.parseInt(IO.readln("Introduce el dia de la fecha: "));
					LocalDate fechaInicioPintura = LocalDate.of(añoC5P, mesC5P, diaC5P);
					
					//Busco que servicio se desea eliminar
					for(int i=0;i<servicios.length;i++) {
						if(servicios[i]!=null) {
							if(servicios[i].getCliente().equals(clienteC5) && ((Pintura)servicios[i]).getSuperficie() == superficieC5 && ((Pintura)servicios[i]).getFechaInicio().equals(fechaInicioPintura)) {
								servicios[i] = null;
							}
						}
					}
					
					//Reescribo con una copia
					Servicio[] copiaP = new Servicio[servicios.length];
					int contadorP = 0;
					for(int i=0;i<servicios.length;i++) {
						if(servicios[i]!=null) {
							copiaP[contadorP] = servicios[i];
							contadorP++;
						}
						
					}
					servicios = copiaP;
					
					
					break;
				case 2:
					String clienteC5Alarmas = IO.readln("Introduce el nombre del cliente: ");
					int numeroAlarmasC5 = Integer.parseInt(IO.readln("Introduce el numero de alarmas revisadas"));
					
					System.out.println("Introduzca los datos sobre la fecha de revision:");
					int añoC5R = Integer.parseInt(IO.readln("Introduce el año de la fecha: "));
					int mesC5R = Integer.parseInt(IO.readln("Introduce el mes de la fecha: "));
					int diaC5R = Integer.parseInt(IO.readln("Introduce el dia de la fecha: "));
					LocalDate fechaRevisionAlarmas = LocalDate.of(añoC5R, mesC5R, diaC5R);

					
					System.out.println("Introduzca los datos sobre la fecha de inicio:");
					int añoC5I = Integer.parseInt(IO.readln("Introduce el año de la fecha: "));
					int mesC5I = Integer.parseInt(IO.readln("Introduce el mes de la fecha: "));
					int diaC5I = Integer.parseInt(IO.readln("Introduce el dia de la fecha: "));
					LocalDate fechaInicioAlarmas = LocalDate.of(añoC5I, mesC5I, diaC5I);
					
					
					//Busco que servicio se desea eliminar
					for(int i=0;i<servicios.length;i++) {
						if(servicios[i]!=null) {
							if(servicios[i].getCliente().equals(clienteC5Alarmas) && ((AlarmasContraIncendios)servicios[i]).getFechaRevision().equals(fechaRevisionAlarmas) && ((AlarmasContraIncendios)servicios[i]).getFechaInicio().equals(fechaInicioAlarmas)) {
								servicios[i] = null;
							}
						}
					}
					
					//Reescribo con una copia
					Servicio[] copiaAlarmas = new Servicio[servicios.length];
					int contadorAlarmas = 0;
					for(int i=0;i<servicios.length;i++) {
						if(servicios[i]!=null) {
							copiaAlarmas[contadorAlarmas] = servicios[i];
							contadorAlarmas++;
						}
						
					}
					servicios = copiaAlarmas;
					break;
				case 3:
					salidaC5 = false;
					System.out.println("saliendo...");
					break;
				default: 
					System.out.println("Opcion no valida");
					break;
				}
				
				
				
				
				}
				while(salidaC5);
				break;
			case 6:
				salida = false;
				System.out.println("Hasta otra!");
				break;
			default:
				System.out.println("\nOpcion no valida");
				break;

			}
			
		}
		while(salida);
	}

}
