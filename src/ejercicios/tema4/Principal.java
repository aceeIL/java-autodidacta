package ejercicios.tema4;

import java.util.Arrays;

public class Principal {

	
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	//Aqui se muestra el resultado de los ejercicios
		
	//1.	Programar un método llamado printar que reciba un String y 
	//lo muestre por consola.
	System.out.println("1.	Enseño un mensaje por pantalla:\n");
	EjerciciosPropuestosMetodos1.printar("HOLA\n");
		
		
		
	//2.	Programar un método que devuelva el valor más alto 
	//de los que recibe como argumentos (una cantidad variable de 
	//argumentos) Sobrecargar el método para que trabaje con enteros 
	//y con double.
		
	//enseño el resultado del ejercicio2
	System.out.println("2.	Enseño el valor maximo:\n");
	System.out.println(EjerciciosPropuestosMetodos1.valorMaximo(1.6,2.4,3.1,4,5,6,8.5,5));
	
	//3.	Programar un método que reciba una matriz y la rellene con 
	//números aleatorios. Sobrecargarlo para que funcione con variables 
	//de tipo int y con float.
	
	int[] numeros = new int[10];
	
	EjerciciosPropuestosMetodos1.aleatoriosMatriz(numeros,1,11);
	System.out.println();
	System.out.println("3.	Enseño la matriz:\n");
	
	EjerciciosPropuestosMetodos1.printar(numeros); //Hice una sobre carga en 
													//printar para arrays
	
	System.out.println();
	//4.	Programar una función que indique si un número es primo o no. 
	//Utilizando esta función indicar los números primos que hay en un 
	//array 2D.
	System.out.println();
	System.out.println("4.1.	Identifico numeros primos: \n");
	//Parte 1:
	
	boolean esPrimo = EjerciciosPropuestosMetodos1.esPrimo(7);
	System.out.println("Es primo? "+esPrimo);
	
	//Parte 2:
	System.out.println();
	System.out.println("4.2.	Muestro los numeros primos de la matriz: \n");
	int[][] x = {{1,3,5,6},{2,4,7,9}};
	
	EjerciciosPropuestosMetodos1.mostrarPrimosMatriz2D(x);
	
	
	//5.	Programar un método que reciba un String y devuelva el 
	//número de palabras de dicho String.
	System.out.println();
	System.out.println("5.	Muestro cuantas palabras tiene el texto introducido:\n");
	int palabras = EjerciciosPropuestosMetodos1.contadorPalabras("Buenas tardes a todos");
	
	System.out.println("El texto contiene un total de: "+palabras+" palabras.");
	//6.	Programar un método que reciba una matriz y devuelva otra 
	//matriz con los mismos valores pero el doble de capacidad.
	System.out.println();
	System.out.println("6.\tMuestro la matriz con el doble de capacidad:\n");
	int[] a = {1,4,3,5,4};
	
	int[] b = EjerciciosPropuestosMetodos1.matrizDuplicada(a);
	
	System.out.println(Arrays.toString(b));
	
	

	
	
	
	}

}
