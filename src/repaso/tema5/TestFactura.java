package repaso.tema5;

import java. time. LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestFactura {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factura facturas[] = new Factura[100];

		try {
			facturas[0] = new Factura("QW34", LocalDate.now(),345.67f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Factura no ha sido creada por que el codigo esta mal");
			System.out.println(e.getMessage());
		}

		try {
			facturas[1] = new Factura("P045",LocalDate.of(2022, 10, 29),200);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Factura no ha sido creada por que el codigo esta mal");
			System.out.println(e.getMessage());
		}

		try {
			facturas[2] = new Factura("ty80",LocalDate.of(2022, 11, 12),980);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Factura no ha sido creada por que el codigo esta mal");
			System.out.println(e.getMessage());
		}

		//Mostrar por pantalla toda la info de las facturas:
		for(Factura f: facturas) {
			if(f != null) {
				System.out.println(f);
			}
		}

		char opcion;
		boolean salir = false;

		do {
			Scanner lector = new Scanner(System.in);
			System.out.println("a. Introducir una nueva factura:");
			System.out.println("b. Buscar una factura.");
			System.out.println("c. Buscar facturas por fecha.");
			System.out.println("d. Eliminar una factura.");
			System.out.println("e. Calcular total facturado.");
			System.out.println("f. Salir");
			opcion = lector.nextLine().charAt(0);

			switch(opcion) {
			case 'a':
				System.out.println("Introduzca el codigo: ");
				String codigo = new Scanner(System.in).nextLine();
				System.out.println("Introduzca fecha en formato dd/mm/aaaa");
				String fecha = new Scanner(System.in).nextLine();
				//Pasar a LocalDate
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate fechaFactura = LocalDate.parse(fecha, formatter);

				System.out.println("introduzca el importe: ");
				float importe = new Scanner(System.in).nextFloat();

				//Creamos objeto Factura
				Factura f = null;
				try {
					f = new Factura(codigo, fechaFactura, importe);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Factura no ha sido creada por que el codigo esta mal");
					System.out.println(e.getMessage());
				}
				//Guardarla en la primera posición vacía
				if(MetodosArraysFacturas.guardarFactura(f, facturas)) {
					System.out.println("La factura fue guardada con exito.");
					MetodosArraysFacturas.mostrarFacturas(facturas);
				}
				else {
					System.out.println("No hay espacio para esta factura");
				}
				break;
				
			case 'b':
				//Buscar una factura a partir del código.
				System.out.println("Intro codigo de la factura ");
				String codigoFactura = new Scanner(System.in).nextLine();
				Factura fBuscada = MetodosArraysFacturas.buscarFactura(codigoFactura, facturas);
					if(fBuscada != null) {
						System.out.println(fBuscada);
					}

				else {
				System.out.println("La factura no esta en la bbdd");
				}
				
				break;
			}
		}
		while(salir == false);
		
		
		
	}
}
