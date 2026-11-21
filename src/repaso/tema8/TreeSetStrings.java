package repaso.tema8;

import java.util.*;

public class TreeSetStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> alumnos = new TreeSet<String>();
		
		alumnos.add("Braulio Otero");
		alumnos.add("Alejandro Sánchez");
		alumnos.add("Domingo Duró");
		
		HashSet<String> alumnosDes = new HashSet<String>();
		alumnosDes.addAll(alumnos);

		for(String s : alumnos) {
			System.out.println(s);
		}

		TreeSet<Integer> numeros = new TreeSet<Integer>();
		Random r = new Random();

		for(int i=1;i<10;i++) {
			numeros.add(r.nextInt(10));
		}
		
		
		
		HashSet<Integer> numerosDes = new HashSet<Integer>();
		numerosDes.addAll(numeros);
		
		for(Integer f : numeros) {
			System.out.print(f + "  ");
		}
		System.out.println("\n");
		
		
		for(Integer f : numerosDes) {
			System.out.print(f + "  ");
		}
		
		TreeSet<Integer> numPrueba = new TreeSet<Integer>();
		numPrueba.add(1);
		numPrueba.add(2);
		numPrueba.add(3);
		numPrueba.add(4);
		
		numPrueba.add(4);
		
		System.out.println("\n");
		for(Integer f : numPrueba) {
			System.out.print(f + "  ");
		}
		
	}

}
