package ejercicios.tema5_Ejercicios10y11;

import java.time.LocalDate;
import java.util.Scanner;

public class TestTarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tarea[] tareas = new Tarea[100];

		boolean salida = true;
		do {
			System.out.println("\nBienvenido al gestor de tareas:");
			System.out.println("1.	Añadir tarea");
			System.out.println("2.	Modificar tarea.");
			System.out.println("3.	Ver tareas.");
			System.out.println("4.	Ver tareas importantes.");
			System.out.println("5.	Completar una tarea.");
			System.out.println("6.	Eliminar tareas realizadas.");
			System.out.println("7.	Ver tareas realizadas.");
			System.out.println("8.	Salir.");

			//Letor
			Scanner lector = new Scanner(System.in);
			int opcion = lector.nextInt();

			//Declaro variables
			int año = 0;
			int mes = 0;
			int dia = 0;
			String titulo = null;
			switch(opcion) {
			case 1:
				titulo = IO.readln("Titulo de la tarea: ");
				String descripcion = IO.readln("Descripcion de la tarea: ");
				System.out.println("Es importante?");
				String esImportante = IO.readln("Escribe \"si\" o \"no\": ");

				boolean importante;

				año = Integer.parseInt(IO.readln("Introduce el año de la fecha limite: "));
				mes = Integer.parseInt(IO.readln("Introduce el mes de la fecha limite: "));
				dia = Integer.parseInt(IO.readln("Introduce el dia de la fecha limite: "));

				LocalDate fechaLimite = LocalDate.of(año, mes, dia);
				if(esImportante.equals("si")) {
					importante = true;
				}
				else {
					importante = false;
				}

				//Compruebo que el nombre de la tarea no exista
				boolean existe = false;
				for(int i=0;i<tareas.length;i++) {
					if(tareas[i] != null && tareas[i].getTitulo().equals(titulo)) {
						System.out.println("\nEl nombre de esta tarea ya existe. Porfavor vuelva a intentarlo");
						existe = true;
					}
				}
				//Añado la tarea
				for(int i=0;i<tareas.length;i++) {
					if(tareas[i] == null) {
						if(!existe) {
							tareas[i] = new Tarea(titulo,descripcion,fechaLimite,importante);
							System.out.println("\nTarea creada con exito");
							break;
						}
					}
				}
				break;
			case 2:
				boolean salidaCase2 = true;
				titulo = IO.readln("Introduce el titulo de la tarea a modificar: ");

				boolean tareaExistente1 = false;
				for(int i=0;i<tareas.length;i++) {
					if(tareas[i]!=null && tareas[i].getTitulo().equals(titulo)) {
						tareaExistente1 = true;
					}
				}
				if(tareaExistente1) {
					do {
						System.out.println("\nPosibles modificaciones:");
						System.out.println("1.	retrasar fecha limite");
						System.out.println("2.	marcar como importante");
						System.out.println("3.	Salir");

						//lector case 2
						Scanner lectorCase2 = new Scanner(System.in);
						int opcionCase2 = lector.nextInt();

						switch(opcionCase2) {
						case 1:
							año = Integer.parseInt(IO.readln("Introduce el año de la fecha limite nueva: "));
							mes = Integer.parseInt(IO.readln("Introduce el mes de la fecha limite nueva: "));
							dia = Integer.parseInt(IO.readln("Introduce el dia de la fecha limite nueva: "));

							boolean tareaEncontrada = false;
							for(int i=0;i<tareas.length;i++) {
								if(tareas[i].getTitulo().equals(titulo) && tareas[i] != null) {
									tareas[i].setFechaLimite(año, mes, dia);
									tareaEncontrada = true;
									System.out.println("\nFecha limite actualizada");
									break;
								}
							}
							if(!tareaEncontrada) {
								System.out.println("\nNo se ha encontrado ninguna tarea con ese nombre");
							}

							break;
						case 2:
							for(int i=0;i<tareas.length;i++) {
								if(tareas[i] != null && tareas[i].getTitulo().equals(titulo) ) {
									tareas[i].setImportante(true);
									System.out.println("\nTarea marcada como importante");
								}
							}
							break;
						case 3:
							System.out.println("\nSaliendo del menu de modificaciones...");
							salidaCase2 = false;
							break;
						default:
							System.out.println("\nOpcion no valida");
							break;

						}
					}
					while(salidaCase2);
				}
				else {
					System.out.println("\nEl titulo de la tarea no se ha encontrado o no existe");
				}

				break;
			case 3:
				for(int i=0;i<tareas.length;i++) {
					if(tareas[i] != null)
						System.out.println(tareas[i]);
				}
				break;
			case 4:
				for(int i=0;i<tareas.length;i++) {
					if(tareas[i] != null && tareas[i].isImportante() == true)
						System.out.println(tareas[i]);
				}
				break;
			case 5:
				titulo = IO.readln("Introduce el titulo de la tarea a que quieres marcar como realizada: ");

				boolean tareaExistente2 = false;
				for(int i=0;i<tareas.length;i++) {
					if(tareas[i]!=null && tareas[i].getTitulo().equals(titulo)) {
						tareaExistente1 = true;
					}
				}
				if(tareaExistente2) {

					for(int i=0;i<tareas.length;i++) {
						if(tareas[i]!=null && tareas[i].getTitulo().equals(titulo)) {
							tareas[i].setRealizada(true);
							System.out.println("Tarea marcada como realizada con exito");
						}
					}
				}
				
				else {
					System.out.println("\nTitulo de tarea no encontrada o no existente");
				}
				break;
			case 6:
				Tarea[] tareasRealizadas = new Tarea[100];


				for(int i=0;i<tareas.length;i++) {
					if(tareas[i] != null && tareas[i].isRealizada() == true) {
						for(int j=0;j<tareasRealizadas.length;j++) {
							if(tareasRealizadas[i] == null) {
								tareasRealizadas[i] = tareas[i];
								break;

							}//fin if interno

						}//fin for interno
						tareas[i] = null;
						System.out.println("\nTareas realiazadas borradas con exito");
					}//fin del primer if

				}//fin del primer for
				break;
			case 7:
				for(int i=0;i<tareas.length;i++) {
					if(tareas[i] != null && tareas[i].isRealizada() == true) {
						System.out.println(tareas[i]);
					}

				}
				break;
			case 8:
				System.out.println("\nHasta otra!");
				salida = false;
				break;
			default:
				System.out.println("\nOpcion invalida");
				break;

			}

		}
		while(salida);

	}

}
