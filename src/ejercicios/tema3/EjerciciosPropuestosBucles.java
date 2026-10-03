package ejercicios.tema3;

import java.util.Random;

public class EjerciciosPropuestosBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que cuente los valores de una matriz que están 
		//por encima de la media. Y la desviación media de la matriz 
		//(la media de las desviaciones).
		
		//Creo un array con valores aleatorios:
		int[] numeros = new int [10];
		
		Random generador = new Random();
		
		for(int i = 0;i<numeros.length;i++) {
			numeros[i] = generador.nextInt(1,21);
		}
		
		
		//Ahora recorro la matriz y calculo la suma de todos los valores
		double suma = 0;
		
		for(int i =0;i<numeros.length;i++) {
			suma += numeros[i]; 
		}

		System.out.println("La suma de numeros de la matriz es: "+suma);
		
		//Hago la media
		
		double media = suma / numeros.length;
		System.out.println("La media de la matriz es de: "+ media);
		
		//Vuelvo a recorrer la matriz y muestro los numeros que estan encima de la
		//media
		System.out.print("\nLos numeros por encima de la media son: \n");
		for(int i =0;i<numeros.length;i++) {
			if(numeros[i]>media) {
				System.out.println(numeros[i]);
			}
		}
		
		
		//Calcular la desviacion de la matriz, cuanto se aleja de la media:
		System.out.println("Desviacion de la media:");
		
		//Calculo la diferencia de valores inferiores y superiores a la media
		double desviacionTotal = 0;
		
		for(int i =0;i<numeros.length;i++) {
			if(numeros[i]<media) {
				double desviacionMenor = media - numeros[i];
				desviacionTotal += desviacionMenor;
			}
			else {
				double desviacionMayor = numeros[i] - media;
				desviacionTotal += desviacionMayor;

			}
			
		}
		
		//Hago la media en las desviaciones
		
		double desviacionesMedia = desviacionTotal / numeros.length;
		
		System.out.println("La media de desviaciones es de: "+desviacionesMedia );
		
		
		
		
		
		
	}

}
