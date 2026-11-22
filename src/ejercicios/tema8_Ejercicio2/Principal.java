package ejercicios.tema8_Ejercicio2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear un ArrayList de números decimales.
		ArrayList<Float> numDecimales = new ArrayList<Float>();
		
		//A continuación introducir 10 números aleatorios entre 0 y 10.
		Random r = new Random();
		
		for(int i=0;i<10;i++) {
			numDecimales.add(r.nextFloat(11));
		}
		
		
		//Calcular la media.
		int numeros = numDecimales.size();
		float total = 0;
		for(int i=0;i<numeros;i++) {
			total += numDecimales.get(i);
		}
		total = total/numeros;
		total = (float) Math.round(total*100)/100;
		
		System.out.println("\n"+"Media redondeada: "+total);
		
		
		//Calcular el valor más alto generado.
		float valor = 0;
		for(int i=0;i<numeros;i++) {
			if(numDecimales.get(i)>valor) {
				valor = numDecimales.get(i);
			}
		}
		valor = (float) Math.round(valor*100)/100;
		
		System.out.println("El valor mas alto generado es: "+valor);
		
		
		//Mostrar por pantalla todos los valores almacenados.
		System.out.println("Valores almacenados en la matriz: "+"\n");
		for(Float f : numDecimales) {
			System.out.println(f);
		}
		
		
		
		//Eliminar todos aquellos que sean superiores a 7.
		Iterator<Float> itF = numDecimales.iterator();
		
		while(itF.hasNext()) {
			if(itF.next()>7) {
				itF.remove();
			}
		}
		
		//Volver a mostrar la matriz.
		System.out.println("\n"+"Valores almacenados en la matriz despues del borrado: "+"\n");
		for(Float f : numDecimales) {
			System.out.println(f);
		}

		
		
		
		
		
		
	}

}
