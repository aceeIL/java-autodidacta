package repaso.tema8;

import java.util.*;

public class EqualsVsHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = new String("Pedro");
		String cadena2 = new String("Pedro");

		//Equals
		System.out.println("cadena.equals(cadena2) : "+ cadena.equals(cadena2));


		// ==
		boolean iguales = cadena == cadena2;

		System.out.println("cadena == cadena2 " + iguales);
		System.out.println("p1 == p2 " + iguales);
		//hashcode

		System.out.println("cadena.hashcode() : "+ cadena. hashCode());
		System.out.println("cadena2.hashcode() : "+ cadena2.hashCode());
		
		
		Pelicula p1 = new Pelicula("AQW");
		
		Pelicula p2 = new Pelicula("AQW");
		
		System.out.println();
		
		
		//Equals
		System.out.println("p1.equals(p2) : "+ p1.equals(p2));
	
		//hashcode
		System.out.println("p1.hashcode() : "+ p1.hashCode());
		System.out.println("p2.hashcode() : "+ p2.hashCode());
		
		
		HashSet<Pelicula> conjunto = new HashSet<Pelicula>();
		
		conjunto.add(p1);
		conjunto.add(p2);
		
		System.out.println(conjunto);
		System.out.println();
		TreeSet<Pelicula> conjuntoOrdenado = new TreeSet<Pelicula>();
		conjuntoOrdenado.addAll(conjunto);
		conjuntoOrdenado.add(new Pelicula("AAW"));
		
		System.out.println(conjuntoOrdenado);

		
		
	}

}
