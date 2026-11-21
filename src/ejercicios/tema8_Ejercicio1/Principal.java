package ejercicios.tema8_Ejercicio1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear un ArrayList con el método del apartado a. 
		//A partir de este ArrayList cread un HashSet y un TreeSet utilizando el método addAll
		ArrayList<Integer> numeros = new ArrayList<Integer>(10);
		
		Metodos.rellenar(numeros,10,10);
		
		HashSet<Integer> numeros2 = new HashSet<Integer>();
		TreeSet<Integer> numeros3 = new TreeSet<Integer>();
		
		numeros2.addAll(numeros);
		numeros3.addAll(numeros);
		
		//Mostrar por pantalla las colecciones anteriores.
		Metodos.mostrarValores(numeros);
		System.out.println();
		Metodos.mostrarValores(numeros2);
		System.out.println();
		Metodos.mostrarValores(numeros3);
		
		
		//Crear ahora un TreeSet con el método del apartado c , 
		//a partir de este crear un Hashset
		TreeSet<Double> decimales = new TreeSet<Double>();
		
		Metodos.rellenar(decimales);
		
		HashSet<Double> decimales2 = new HashSet<Double>();
		
		decimales2.addAll(decimales);
		
		//mostrar ambas colecciones utilizando el método del apartado d.
		System.out.println();
		Metodos.mostrarValores(decimales);
		System.out.println();
		Metodos.mostrarValores(decimales2);
		
		//Crear ahora un ArrayList de strings y meterle 10 nombres , 
		//alguno de ellos repetidos.
		
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Pedro");
		nombres.add("Juan");
		nombres.add("Marina");
		nombres.add("Jose");
		nombres.add("Pedro");
		nombres.add("Martin");
		nombres.add("Juan");
		nombres.add("Roberto");
		nombres.add("Ana");
		nombres.add("Ana");
		
		//Crear un TreeSet y un HashSet a partir del ArrayList anterior
		
		TreeSet<String> nombres2 = new TreeSet<String>();
		HashSet<String> nombres3 = new HashSet<String>();
		
		nombres2.addAll(nombres);
		nombres3.addAll(nombres);
		
		//Mostrar ambas coleeciones utilizando un Iterator.
		
		Iterator<String> it = nombres2.iterator();
		Iterator<String> it2 = nombres3.iterator();
		System.out.println("\n"+"\n"+"Array de nombres2: "+"\n");
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("\n"+"Array de nombres3: "+"\n");
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		
		
		

		
		
	
		
	}

}
