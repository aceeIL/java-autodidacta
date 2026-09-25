package ejercicios;

import java.util.*;

public class EjerciciosPropuestos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejercicio 1: Buscador y Analizador de Empleados
		
		//Escribe un programa que gestione los datos de una plantilla de 
		//trabajadores directamente a través de la consola
		
		//Array de:
		//Empleados Carlos Gómez, Ana Martínez, Gonzalo alonso,
		//Martin Garrido, Brais Vazquez.
		
		//Array de sus sueldos
		
		// Solicita al usuario mediante Scanner que escriba el nombre 
		//(o parte del nombre) del empleado que desea buscar.
		
		//Sin importar mayusculas y minusculas
		
		//Si encuentra al empleado, muestra su nombre original, su sueldo
		//y cuántos caracteres tiene su nombre completo.
		
		//Además, toma la parte entera de su sueldo (eliminando los decimales)
		//y conviértela de forma explícita en un objeto de la clase envoltorio
		//Integer. Muestra este valor encapsulado por pantalla.
		
		//Si el empleado no existe en el array, muestra un mensaje de error.
		
		String[] empleados = {"Carlos Gomez"," Ana Martinez"," Gonzalo alonso",
				" Martin Garrido"," Brais Vazquez"};
		
		double[] sueldos = {2500.00,2300.00,1500.00,3000.00,1900.00};
		
		//Longitud de la matriz sueldos
		int LMatrizsueldos = sueldos.length;
		//Longitud de la matriz empleados
		int LMatrizEmpleados = empleados.length;
		
		
		

		 
		
		
		//Parte interactiva con el usuario, recoge el nombre
			Scanner lector = new Scanner(System.in);
			System.out.println("Introduce el nombre del empleado: \n");
			String inputUsuario = lector.nextLine();
		
		
		
			//Bucle que recorre el array y separa nombres y apellidos
			for(int i = 0;i<LMatrizEmpleados;i++ ) {  
				String[] partes = empleados[i].trim().split(" ");
				 
				 String nombreSuelto = partes[0];
						
				 String apellidoSuelto = partes[1];
								 
				 if(inputUsuario.contains(nombreSuelto) ) {
					 System.out.println("Se ha encontrado al empleado: " +nombreSuelto+apellidoSuelto);
					 
					 System.out.println();
				 }
				 else {
					 System.out.println("No se ha enocntrado a ningun empleado, intentelo de nuevo!");
				 }
				 
			}
				
//Cierre clase y paquete			

	}

}
