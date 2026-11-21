package repaso.tema8;

import java.util.*;
import java.util.Map.Entry;

public class Mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mapas --> clave --> Valor -->Busquedas por clave
		
		//Map<K,V> --> HashMap 
		HashMap<Integer,String> alineacion = new HashMap<Integer,String>();
		
		alineacion.put(1, "Sergio Alvarez");
		alineacion.put(2, "Hugo Mallo");
		alineacion.put(3, "Cabral");
		alineacion.put(10, "Iago Aspas");
		
		if(!alineacion.containsKey(10)) {
			alineacion.put(10, "Roncaglia");
		}
		
		//Busquedas por clave
		String jugador = alineacion.get(10);
		
		System.out.println(jugador);
		
		
		System.out.println();
		Set<Entry<Integer,String>> entradas = alineacion.entrySet();
		
		for(Entry<Integer,String> e : entradas) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		
		//Obtener los valores
		Collection<String> valores = alineacion.values();
		System.out.println();
		for(String s : valores) {
			System.out.println(s);
		}
		
		//Obtener las claves
		Set<Integer> claves = alineacion.keySet();
		
		System.out.println();
		System.out.println(claves);
		
		//eliminar entradas
		alineacion.remove(1);
		
		valores = alineacion.values();
		System.out.println();
		for(String s : valores) {
			System.out.println(s);
		}
		
		
	}

}
