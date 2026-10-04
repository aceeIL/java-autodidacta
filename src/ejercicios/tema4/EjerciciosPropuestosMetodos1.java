package ejercicios.tema4;

import java.util.Random;

public class EjerciciosPropuestosMetodos1 {

	//1.Programar un método llamado printar que reciba un String y 
	//lo muestre por consola.
	
	static void printar(String mensaje) {
		System.out.println(mensaje);
	}
	//sobrecarga de printar para arrays
	static void printar(int x[]) {
		for(int i : x) {
			System.out.print(i + " ");
		}
	}
		
	//2.	Programar un método que devuelva el valor más alto 
	//de los que recibe como argumentos (una cantidad variable de 
	//argumentos) Sobrecargar el método para que trabaje con enteros 
	//y con double.
					
		
	//Con enteros
	public static int valorMaximo(int ...n) {
		int calculado = n[0];
		for(int x : n) {
			if(x > calculado) {
				calculado =x;
			}
		}
		
		int maximo = calculado;
		return maximo;
	}
	//Sobrecarga con double
	static double valorMaximo(double ...n) {
		double calculado = n[0];
		for(double x : n) {
			if(x > calculado) {
				calculado =x;
			}
		}
		
		double maximo = calculado;
		return maximo;
	}
	
	//3.	Programar un método que reciba una matriz y la rellene con 
	//números aleatorios. Sobrecargarlo para que funcione con variables 
	//de tipo int y con float.
	
	static void aleatoriosMatriz (int x[],int minimo, int limite) {
		Random generador = new Random();
		
		
		for(int i = 0;i<x.length;i++) {
			x[i] = generador.nextInt(minimo,limite);
		}
		
	}
	
	//Programar una función que indique si un número es primo o no . 
	//Utilizando esta función indicar los números primos que hay en un 
	//array 2D.
		
	//Parte 1: 
	static boolean esPrimo(int x) {
		
		
			if(x <= 1) {
				return false;
			}
			if(x == 2) {
				return true;
			}
			if(x%2==0) {
				return false;
			}
			for(int i = 2;i<x;i++) {
				if(x%i==0) {
					return false;
				}
			}
			return true;
	}
	
	//Parte 2:
	static void mostrarPrimosMatriz2D (int[][] x) {
		for(int i = 0;i<x.length;i++) {
			for(int j = 0;j<x[i].length;j++) {
				if (esPrimo(x[i][j])) {
					System.out.println(x[i][j]+" es primo");
				}
				else {
					System.out.println(x[i][j]+" no es primo");
				}
			}
		}
	}
	
	
	
	
	//5.	Programar un método que reciba un String y devuelva el 
	//número de palabras de dicho String.
	
		
		
	//6.	Programar un método que reciba una matriz y devuelva otra 
	//matriz con los mismos valores pero el doble de capacidad.


}//Cierre de clase
	

