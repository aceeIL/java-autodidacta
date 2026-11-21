package repaso.tema8;

import java.util.*;

public class HashSetStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<E>  : Hash  ,  Ordenados (SortedSet) --> TreeSet --> compareTo --> Comparable	
		
		
		HashSet<String> nombres = new HashSet<String>();
				nombres.add("Pedro");
				nombres.add("Luis");
				nombres.add("Juan");
				nombres.add("Pedro");
				
				System.out.println(nombres);
				

				HashSet<Integer> numeros = new HashSet<Integer>();

				Random r = new Random();

				for(int i= 0;i<10;i++) {
				numeros.add(r.nextInt(20));
				}
				System.out.println(numeros);
	}

}
