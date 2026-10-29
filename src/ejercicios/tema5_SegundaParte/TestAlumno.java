package ejercicios.tema5_SegundaParte;


import java.util.Arrays;
import java.util.Scanner;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno[] grupo1 = new Alumno[10];
		
		
		Alumno a1 = new Alumno("54230135E", "Carlos Garcia",2005, 5, 15, 5);
		Alumno a2 = new Alumno("Z0844791Y", "Ana Lopez", "ana.lopez@email.com", "GMI1", 2006, 9, 20);
		
		grupo1[0] = a1;
		grupo1[1] = a2;
		
		
		
		boolean salida = true;
		//lector
		Scanner lector = new Scanner(System.in);
		do {
			System.out.println("Menu de estadisticas de alumnos");
			System.out.println("1.	Ver datos del alumno");
			System.out.println("2.	Añadir Notas");
			System.out.println("3.	Consultar las notas del alumno");
			System.out.println("4.	Modificar una nota");
			System.out.println("5.	Modificar datos de un alumno");
			System.out.println("6.	Salir");
			
			int opcion = lector.nextInt();
			
			switch(opcion) {
				case 1:					
					String alumno = IO.readln("Introduce el nombre del alumno que desea ver: ");
					alumno = alumno.trim();
					
					for(int i=0;i<grupo1.length;i++) {
						if(grupo1[i] != null && grupo1[i].getNombre().equalsIgnoreCase(alumno)) {
							System.out.println(grupo1[i]);
						}
					}
					
					break;
				case 2:
					alumno = IO.readln("Introduce el nombre del alumno que desea modificar su nota: ");
					String notaCadena = IO.readln("Introduce su nota: ");
					alumno = alumno.trim();
					
					int nota = Integer.parseInt(notaCadena);
					
					for(int i=0;i<grupo1.length;i++) {
						if(grupo1[i] != null && grupo1[i].getNombre().equals(alumno)) {
							grupo1[i].addNota(nota);
						}
					}
					break;
				case 3:
					alumno = IO.readln("Introduce el nombre del alumno que desea buscar sus notas: ");
					alumno = alumno.trim();
					
					for(int i=0;i<grupo1.length;i++) {
						if(grupo1[i] != null && grupo1[i].getNombre().equals(alumno)) {
							System.out.println(Arrays.toString(grupo1[i].getNotas()));
						}
					}
					
					break;
				case 4:
					alumno = IO.readln("Introduce el nombre del alumno que desea buscar sus notas: ");
					String indiceCadena = IO.readln("Introduce el indice de la nota a modificar: ");
					notaCadena = IO.readln("Introduce la nota que desea cambiar: ");
					
					indiceCadena.trim();
					alumno = alumno.trim();
					
					int indice = Integer.parseInt(indiceCadena);
					nota = Integer.parseInt(notaCadena);
					
					for(int i=0;i<grupo1.length;i++) {
						if(grupo1[i] != null && grupo1[i].getNombre().equals(alumno)) {
							grupo1[i].modificarNota(nota, indice);
						}
					}
					
					break;
				case 5:
					

					System.out.println("Datos posibles para cambiar: ");
					System.out.println("Nombre");
					System.out.println("Fecha de nacimiento");
					System.out.println("Correo");
					System.out.println("Curso");
					
					String datoAlumno = IO.readln("Introduzca el dato que desea cambiar: ");
					datoAlumno = datoAlumno.replace(" ", "-");
					
					if(datoAlumno.equalsIgnoreCase("Nombre")) {
						alumno = IO.readln("Introduce el nombre del alumno que desea modificar el nombre: ");
						alumno = alumno.trim();
						String nombreCambiado = IO.readln("Introduce el cambio de nombre: ");
						
						for(int i=0;i<grupo1.length;i++) {
							if(grupo1[i] != null && grupo1[i].getNombre().equals(alumno)) {
								grupo1[i].setNombre(nombreCambiado);
							}
						}
					}
					if(datoAlumno.equalsIgnoreCase("Correo")) {
						alumno = IO.readln("Introduce el nombre del alumno que desea modificar el nombre: ");
						alumno = alumno.trim();
						String correoCambiado = IO.readln("Introduce el cambio de correo: ");
						
						for(int i=0;i<grupo1.length;i++) {
							if(grupo1[i] != null && grupo1[i].getNombre().equals(alumno)) {
								grupo1[i].setEmail(correoCambiado);
							}
						}
					}
					
					if(datoAlumno.equalsIgnoreCase("Curso")) {
						alumno = IO.readln("Introduce el nombre del alumno que desea modificar el nombre: ");
						alumno = alumno.trim();
						String cursoCambiado = IO.readln("Introduce el cambio de curso: ");
						
						for(int i=0;i<grupo1.length;i++) {
							if(grupo1[i] != null && grupo1[i].getNombre().equals(alumno)) {
								grupo1[i].setCurso(cursoCambiado);
							}
						}
					}
					if(datoAlumno.equalsIgnoreCase("Fecha-de-nacimiento")) {
						alumno = IO.readln("Introduce el nombre del alumno que desea modificar el nombre: ");
						alumno = alumno.trim();
						String diaCad = IO.readln("Introduce el dia: ");
						String mesCad = IO.readln("Introduce el mes: ");
						String añoCad = IO.readln("Introduce el año: ");
						int dia = Integer.parseInt(diaCad);
						int mes = Integer.parseInt(mesCad);
						int año = Integer.parseInt(añoCad);
						
						for(int i=0;i<grupo1.length;i++) {
							if(grupo1[i] != null && grupo1[i].getNombre().equals(alumno)) {
								grupo1[i].setFechaNacimiento(año, mes, dia);
							}
						}
					}
					break;
				case 6:
					salida = false;
					break;
				default:
					System.out.println("opcion no valida");
					break;
			}
		}
		while(salida);
	}

}
