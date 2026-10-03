package ejercicios.tema3;

import java.util.Arrays;
import java.util.Random;

public class EjerciciosPrpuestosBucles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Realizar un programa que encuentre las posiciones de un array");
		//Realizar un programa que encuentre las posiciones de un array 
		//en las que hay ceros.
		
		//Creo el array y relleno con aleatorioes ente 0 3
		int[] numeros = new int[5]; 
		Random generador = new Random();

		for(int i =0;i<numeros.length;i++) {
			numeros[i] = generador.nextInt(0,3);
		}
		System.out.print("Array generado: "+Arrays.toString(numeros)+"\n");
		
		System.out.println();
		//Encuentro la posicion de los 0. para esto ordeno el array
		
		int posicion = 0;
		for(int i =0;i<numeros.length;i++) {
			if(numeros[i] == 0) {
				System.out.println("Has encontrado un 0 en la posicion: "+i);
			}
			
		}
		
		
		
		
		
		
		System.out.println();
		System.out.println("Realizar un programa que encuentre la posición del primer número negativo.");
		//Realizar un programa que encuentre la posición del primer número negativo.
		
		//Hago un array y genero numeros aleatorios entre -2 y 2
		int[] numeros2 = new int[10];
		
		for(int i =0;i<numeros2.length;i++) {
			numeros2[i] = generador.nextInt(-2,2);
		}
		System.out.println("\nArray generado: "+Arrays.toString(numeros2));
		
		for(int i =0;i<numeros2.length;i++) {
			if(numeros2[i]<0) {
				System.out.println("La primera posicion del primer numero negativo es la: "+i);
				break;
			}
		}
		
		
		System.out.println("\n\nRealizar un programa que encuentre el valor más alto de un array");
		//Realizar un programa que encuentre el valor más alto de un array.
		
		// Creo un array y le doy numeros aleatorios entre el 1 y 10
		int[] numeros3 = new int[10];
		
		for(int i =0;i<numeros3.length;i++) {
			numeros3[i] = generador.nextInt(1,11);
		}
		//Enseño el array generado
		System.out.println("\nArray generado: "+Arrays.toString(numeros3));
		
		//Hago una copia del array
		int[] copiaNumeros3 = Arrays.copyOf(numeros3, numeros3.length);
		
		//Ordeno la copia para no modificar el array original y desordenar los datos
		Arrays.sort(copiaNumeros3);
		
		//Recojo la ultima posicion, que ocn el array ordenado, es el mas alto
		int numeroMasAlto = numeros3.length -1;
		
		//Enseño el numero mas alto
		System.out.println("El numero mas alto del array es: "+copiaNumeros3[numeroMasAlto]);

		
		
		
		

		
		
	}

}
