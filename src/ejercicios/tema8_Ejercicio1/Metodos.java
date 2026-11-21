package ejercicios.tema8_Ejercicio1;

import java.util.*;

public class Metodos {

	public static Collection<Integer> rellenar(Collection<Integer> coleccion,int tamañoCollection,int limite){
		
		Random generador = new Random();
		
		for(int i=0;i<tamañoCollection;i++) {
			coleccion.add(generador.nextInt(limite + 1));
		}
		
		return coleccion;
	}
	
	
	public static void mostrarValores(Collection<Integer> coleccion) {
		
		boolean primero = true;
		for(Integer i : coleccion) {
			if(!primero) {
				System.out.print(" , ");
			}
			System.out.print(i);
			primero = false;
		}
		
	}
	
	
	public static Set<Double> rellenar(Set<Double> s){
		Random generador = new Random();
		
		for(int i=0;i<100;i++) {
			s.add(generador.nextDouble(101));
		}
		
		
		return s;
	}
	
	
	public static void mostrarValores(Set<Double> s) {
		
		boolean primero = true;
		for(Double d : s) {
			if(!primero) {
				System.out.print(" , ");
			}
			System.out.print(d);
			primero = false;

		}
		
	}
	
	
	
}
