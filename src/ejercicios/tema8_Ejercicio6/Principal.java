package ejercicios.tema8_Ejercicio6;

import java.util.*;
import java.util.Map.Entry;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear un HashMap que permita almacenar el dni y la nota (float) de un alumno.
		HashMap<Float,String> alumno = new HashMap<Float,String>();
		
		//Añadir 5 entradas a la colección.
		alumno.put(5.5f,"28215171J");
		alumno.put(7.5f,"71698858S");
		alumno.put(10f,"63446015D");
		alumno.put(8.3f,"97832895A");
		alumno.put(0.1f,"18424430G");
		
		//Realizar una búsqueda por el dni.
		String dni = "71698858S";
		
		Set<Entry<Float,String>> busqueda = alumno.entrySet();
		
		System.out.println("Busqueda por dni: "+"\n");
		for(Entry<Float,String> e : busqueda) {
			if(e.getValue().equals(dni)) {
				System.out.println(e);
			}
		}
		
		//Eliminar una entrada de la colección.
		alumno.remove(5.5f);
		
		//Mostrar todos los datos almacenados.
		System.out.println("\n"+"Datos almacenados:"+"\n");
		for(Entry<Float,String> e : busqueda) {
				System.out.println(e);
			
		}
		
	}

}
