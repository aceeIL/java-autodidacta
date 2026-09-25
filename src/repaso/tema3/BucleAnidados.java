package repaso.tema3;

import java.util.Random;

public class BucleAnidados {

	public static void main(String[] args) {
		// Creo un array (matriz unidimensional) de 10 elementos
		int[] matriz = new int[10];
		
		// Creo una variable para generar números aleatorios
		Random aleatorio = new Random();
		
		// Relleno la matriz con números aleatorios del 0 al 50
		for(int i = 0; i < matriz.length; i++) {
			matriz[i] = aleatorio.nextInt(51);
		}
		
		// Muestro la matriz original
		System.out.print("Matriz completa: ");
		for(int valor : matriz) {
			System.out.print(valor + " ");
		}
		
		System.out.println();
		System.out.print("Números primos: ");
		
		// Lógica para buscar números primos
		for(int i = 0; i < matriz.length; i++) {
			int numero = matriz[i];
			boolean primos = true;
			
			
			//Compruebo que no sea ni 1 ni 0
			if (numero < 2) {
				primos = false;
			} 
			
			// Si no es ni 1 ni 0 ejecuta el bucle
			else {
				for(int j = 2; j < numero; j++) {
					if(numero % j == 0) { 
						primos = false;
						break;
					}
				}
			}
			
			// Siempre que primos sea verdaro, osea, haya un numero primo,
			//imprime los numeros primos
			
			if(primos) {
				System.out.print(numero + " ");
			}
		}
		System.out.println();
		
		
		
		
		//Algo mas sencillo
		System.out.println();
		//Bucle: mientas que "i" sea menor que 6 ejecuta otro bucle
		for(int i= 1;i<6;i++) {
			
			for(int j = 10;j<16;j++) {			//Este bucle lo que haces es:
				System.out.print(j + " ");	    //Mientas q "j" sea menor que 16 
												//enseña el valor de j

			}
			//Salto de linea para separar el las veces que el bucle i,
			//ejecuta el bucle j
			System.out.println();
		}
		
		System.out.println();
		//Con bucle while
		
		int z = 1;
		
		while(z<6) {
			int s = 10;
			while(s<16) {
				System.out.print(s + " ");
				s++;
			}
			z++;
			System.out.println();
		}
		
		
		
		
		
	}
}