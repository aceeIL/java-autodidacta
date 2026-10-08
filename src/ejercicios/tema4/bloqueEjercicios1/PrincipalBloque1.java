package ejercicios.tema4.bloqueEjercicios1;

import java.util.Arrays;
import java.util.Scanner;

public class PrincipalBloque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejercicio 1.	Numeros Perfectos:
		int a = 496;
		boolean perfecto = MTDNumeros.esPerfecto(a);
		
		if(perfecto == true) {
			System.out.println("El numero "+a+" es un numero perfecto");
		}
		else {
			System.out.println("El numero "+a+" no es un numero perfecto");

		}
		
		//Ejercicio 2.	Numeros Perfectos:
Scanner lector = new Scanner(System.in);
		
		//Pido los numeros
		System.out.println("Introduce un numero: ");
		int x = lector.nextInt();
		
		System.out.println("Introduce un numero: ");
		int y = lector.nextInt();
		
		System.out.println("Introduce un numero: ");
		int z = lector.nextInt();
		
		//Cierro el scanner
		lector.close();
		//Hago el mcm
		int divisor = MTDNumeros.mcm(x, y, z);
		
		System.out.println("El mcm de "+x+" "+y+" "+z+" es: "+divisor);
		
		
		
		//Ejercicio 3.	Calcular Req:
		
		float r1 = 5.4f;
		float r2 = 4.8f;
		
		//Resultado en microOhmnios
		x = 1;
		float resultado = MTDNumeros.Req(r1, r2, x);
		System.out.println("\nEl resultado de Req en microOhmnios es: "+resultado);
		
		//Resultado en Kiloohmnios 
		x=2;
		resultado = MTDNumeros.Req(r1, r2, x);
		System.out.println("\nEl resultado de Req en Kiloohmnios es: "+resultado);
		
		//Resultado en Ohmnios sin valor x
		resultado = MTDNumeros.Req(r1, r2);
		System.out.println("\nEl resultado de Req en Ohmnios es: "+resultado);
		
		//Resultado en Ohmnios con valor x
		x= 4;
		resultado = MTDNumeros.Req(r1, r2, x);
		System.out.println("\nEl resultado de Req en Ohmnios es: "+resultado);
		
		
		//Ejercicio 4.	Cambair negativos de la matriz por media
		//de los positivos:
		double[] numeros = {4.5, -2.0, 7.0, -5.5, 2.0};
		
		numeros = MTDNumeros.ajustarMatriz(numeros);
		
		System.out.println("\nLa matriz ajustada es: "+Arrays.toString(numeros));
		
		//Caso de solo negativos:
		double[] numeros2 = {-1.0, -4.5, -10.0};
		
		numeros2 = MTDNumeros.ajustarMatriz(numeros2);
		
		System.out.println("\nLa matriz ajustada con solo negativos es: "+Arrays.toString(numeros2));

		
		
		//Ejercicio 4.	Media de una matriz
		float[] matriz1 = {3.5f, 2.1f, 6.8f, 1.2f};
		int[] matriz2 = {10, 5, 6, 2 };
		
		float media;
		
		//Pruebo con una matriz float
		media = MTDNumeros.mediaMatriz(matriz1);
		System.out.println("\nLa media de la matriz1 es: "+media);
		
		//Pruebo con una matriz int
		media = MTDNumeros.mediaMatriz(matriz2);
		System.out.println("\nLa media de la matriz2 es: "+media);


		//Ejercicio 6.	Redondear un array float que devuelve un array int
		
		float[] original = {2.3f,4.6f,8.7f,1.2f};
		int[]redondeada = new int[original.length];
		boolean AbajoArriba = false;
		
		redondeada= MTDNumeros.redondeo(original, AbajoArriba);
		
		System.out.println(Arrays.toString(redondeada));
		
		
		
		//Ejercicio 7.	Modificar matriz 2D
		int[][] matriz2D = new int[3][4];
		//Relleno una matriz 2D
		
		MTDNumeros.llenaMatriz(matriz2D, 0,11);
		
		matriz2D= MTDNumeros.modificarMatriz2D(matriz2D);
		
		MTDNumeros.enseñarMatriz2D(matriz2D);
		
		
	}//Cierre de main

}
