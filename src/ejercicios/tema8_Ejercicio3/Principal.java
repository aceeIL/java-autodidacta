package ejercicios.tema8_Ejercicio3;

import java.util.*;
import ejercicios.tema8_Ejercicio1.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear dos ArrayList de números enteros.

		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		//Llenarlos con 10 números aleatorios entre 0 y 20. 
		//(Podeis utilizar función Ejercicio 1)

		Metodos.rellenar(lista1, 10, 20);
		Metodos.rellenar(lista2, 10, 20);
		
		//Crear una tercera lista con los valores de las 2 listas anteriores.
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		
		lista3.addAll(lista1);
		lista3.addAll(lista2);
		
		
		//Crear una cuarta lista con los valores de la primera lista que no están en la 
		//segunda.
		ArrayList<Integer> lista4 = new ArrayList<Integer>();
		
		lista4.addAll(lista1);

		
		//Mostrar  los valores de las 4 listas.

		System.out.println("Lista 1" + "\n");
		Metodos.mostrarValores(lista1);
				
		System.out.println("\n");
		System.out.println("Lista 2" + "\n");
		Metodos.mostrarValores(lista2);
				
		System.out.println("\n");
		System.out.println("\n"+"Lista 3" + "\n");
		Metodos.mostrarValores(lista3);
		
		System.out.println("\n");
		System.out.println("\n"+"Lista 4" + "\n");
		Metodos.mostrarValores(lista4);

		
		
	}

}
