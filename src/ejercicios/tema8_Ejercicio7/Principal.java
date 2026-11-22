package ejercicios.tema8_Ejercicio7;

import java.util.*;
import java.util.Map.Entry;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear un HashMap en el que la clave sea el DNI y esté asociado a un ArrayList de 
		//números decimales:
		
		HashMap<String,ArrayList<Float>> mapa = new HashMap<String,ArrayList<Float>>();
		
		//Crear un ArrayList llamado notas1 y llenarlo con 10 notas.

		ArrayList<Float> notas1 = new ArrayList<Float>();
		
		Random r = new Random();
		
		for(int i=0;i<10;i++) {
			float notaAañadir = r.nextFloat(11);
			notaAañadir = (float) Math.round(notaAañadir*10)/10;
			notas1.add(notaAañadir);
		}
		
		//Crear otro ArrayList llamado notas2 y llenarlo con 10 notas.
		ArrayList<Float> notas2 = new ArrayList<Float>();
		
		for(int i=0;i<10;i++) {
			float notaAañadir = r.nextFloat(11);
			notaAañadir = (float) Math.round(notaAañadir*10)/10;
			notas2.add(notaAañadir);
		}
		
		//Meted en el mapa dos entradas asociando las notas anteriores a un dni.
		mapa.put("17465195F", notas1);
		mapa.put("22093748V", notas2);
		
		//A continuación mostrad las notas de un determinado dni.
		String dni ="17465195F";
		
		Set<Entry<String,ArrayList<Float>>> entradaNotas1 = mapa.entrySet();
		
		for(Entry<String,ArrayList<Float>> e : entradaNotas1) {
			if(e.getKey().equals(dni)) {
				System.out.println(e);
			}
		}
		for(Entry<String,ArrayList<Float>> e : entradaNotas1) {
			if(e.getKey().equals("22093748V")) {
				System.out.println(e);
			}
		}
		
		//Calcular la nota media de las dos entradas del mapa.
		ArrayList<Float> notasFinal = new ArrayList<Float>();
		notasFinal.addAll(notas1);
		notasFinal.addAll(notas2);
		float suma =0;
		for(Float f : notasFinal) {
			suma += f;
		}
		
		suma = suma/notasFinal.size();
		
		System.out.println("La media de las dos entradas es: "+suma);
		
		
	}

}
