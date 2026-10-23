package ejercicios.tema5;

import java.util.Scanner;

public class PruebaEstadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estadios e1 = new Estadios();
		Estadios e2 = new Estadios("Michigan Stadium", "Ann Arbor", 107601);
		Estadios e3 = new Estadios("Estadio Azteca", "Ciudad de México", 87523);
		Estadios e4 = new Estadios("Camp Nou", "Barcelona", 105000);
		Estadios e5 = new Estadios("River Plate","Buenos Aires", 840000);
		Estadios e6 = new Estadios("Boca Juniors","Buenos Aires", 840000);
		
		//Creo una matriz de estadios
		Estadios[] misEstadios = new Estadios[50];
		misEstadios[0] = e1;
		misEstadios[1] = e2;
		misEstadios[2] = e3;
		misEstadios[3] = e4;
		misEstadios[4] = e5;
		misEstadios[5] = e6;
		
		
		
		
		boolean salida = true;
		int opcion;
		Scanner lector = new Scanner(System.in);
		
		do {
			System.out.println("Bienvenido al gestor de estadios!\n");
			
			System.out.println("1. Guardar un nuevo estadio");
			System.out.println("2. Mostrar todos los estadios con capacidad superior a una capacidad dada");
			System.out.println("3. Mostrar todos los estadios de una determinada ciudad");
			System.out.println("4. Buscar un estadio a partir del nombre");
			System.out.println("5. Salir del menu");
			
			opcion = lector.nextInt();
			
			switch(opcion) {
				case 1:
					String nom = IO.readln("Introduzca el nombre del Estadio: ");
					String ciu = IO.readln("Introduzca el nombre de la ciudad: ");
					String cap = IO.readln("Introduzca la capacidad del Estadio: ");
					int capFinal;
					capFinal = Integer.parseInt(cap);
					
					for(int i=0;i<misEstadios.length;i++) {
						if(misEstadios[i] != null) {
							Estadios nuevoEstadio  = new Estadios(nom,ciu,capFinal);
							misEstadios[i] = nuevoEstadio;
							System.out.println("\nEstadio Integrado con exito!\n");
							break;
						}
					}
					break;
				case 2:
					String capBusqueda = IO.readln("Introduzca una capacidad minima desde la que desee buscar: ");
					capBusqueda = capBusqueda.trim();
					capBusqueda = capBusqueda.replace(" ", "");
					System.out.println();
					int capBusquedaFinal = Integer.parseInt(capBusqueda);
					
					for(int i=0;i<misEstadios.length;i++) {
						if(misEstadios[i] !=null) {
							if(misEstadios[i].getCapacidad() > capBusquedaFinal) {
								System.out.println(misEstadios[i] + "\n");
							}
						}
					}
					break;
				case 3:
					String ciuBusquedaEstadio = IO.readln("Introduzca una ciudad: ");
					ciuBusquedaEstadio = ciuBusquedaEstadio.trim();
										
					
					for(int i=0;i<misEstadios.length;i++) {
						if(misEstadios[i] != null) {
							if(misEstadios[i].getCiudad() != null) {
								if(misEstadios[i].getCiudad().equalsIgnoreCase(ciuBusquedaEstadio)) {
									System.out.println(misEstadios[i] + "\n");
								}
							}
						}
					
					}
					
					break;
				case 4:
					String nomBusquedaEstadio = IO.readln("Introduzca el nombre del Estadio: ");
					nomBusquedaEstadio = nomBusquedaEstadio.trim();
					
					for(int i=0;i<misEstadios.length;i++) {
						if(misEstadios[i] != null) {
							if(misEstadios[i].getNombre() != null) {
								if(misEstadios[i].getNombre().equalsIgnoreCase(nomBusquedaEstadio)) {
									System.out.println(misEstadios[i] + "\n");
								}
							}
						}
					
					}
					break;
				case 5:
					System.out.println("Gracias por elegir este gestor, hasta otra!");
					salida = false;
					break;
				default:
					System.out.println("Opcion no valida");
					break;
				
			}
		}
		while(salida);
		
		
	}

}
