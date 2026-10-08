package ejercicios.tema4.bloqueEjercicios1;

import java.util.*;

public class MTDNumeros {

	//1.Crea un método que reciba un número int y devuelva true si ese número 
	//es perfecto. Un número es perfecto si la suma de sus divisores (sin 
	//contar el propio número) es igual al número. Por ejemplo : 6 es perfecto 
	//porque es igual a 1 + 2 + 3.
	
	static boolean esPerfecto(int x) {
		int divisor = 0;
		
		for(int i = 1;i<x;i++) {
			if(x%i==0) {
				divisor +=i;
			}
		}
		
		if(divisor == x) {
			return true;
		}
		
		
		return false;
	}
	
	//2.Crear un método que reciba 3 números y devuelva su mínimo común múltiplo, 
	//es decir el número más bajo que sea múltiplo de los 3.
	
	//Para probarlo solicitar que el usuario introduzca 3 números. 
	//Estos 3 números deben de ser positivos y menores que 100.
	//Hago una clase para encontrar el valor maximo de tres numeros
	
	//(Lo hago en otro metodo para mas claridad)
	static int numeroMaximo(int x,int y,int z) {
		int maximo;
		
		if(x>y && x>z) {
			maximo = z;
		}
		else if(y>x &&y>z) {
			maximo = y;
		}
		else {
			maximo = z;
		}
		
		return maximo;
	}
	
	//Metodo principal de la logical de minimo comun multiplo
	static int mcm(int x, int y, int z) {
		int divisor = 0;
		
		//Busco cual es el numero maximo entre los 3
		int maximo = numeroMaximo(x, y, z);
		
		//Busco que sean positivos y menores que 100
		if((x<0 || x>100) || (y<0 || y>100) || (z<0 || z>100)) {
			throw new IllegalArgumentException("Valor no valido");
		}
		//Busco el mcm
		for(int i=maximo; ;i++) {	
			if(i%x==0 && i%y==0 && i%z==0) {
				divisor=i;
				break;
			}
		}
		
		return divisor;
	}

	
	
	//3.Crea un método que reciba dos valores de tipo float que representan dos 
	//resistencias(r1 y r2) y un parámetro opcional que va a representar las 
	//unidades. El método debe de devolver la resistencia equivalente según 
	//la siguiente fórmula:
	
	//	Req = (r1*r2)/(r1 + r2)
	
	//El método recibe siempre los valores en ohmnios y el parámetro opcional 
	//indica las unidades en las que se debe devolver la resistencia 
	//equivalente según el siguiente sistema:
	
	//Si vale 1 : En microOhmnios (106 ohmnios)

	//Si vale 2: En Kiloohmnios (10-3 ohmnios)

	//Si no se pasa ningún parámetros es que el resultado se devuelve en 
	//ohmnios.
	
	//Cuando se pruebe esto desde el main se deben probar estas 3 opciones. 

	//Hago una sobrecarga:
	//Si el usuario no introduce el valor de x ejecuta:
	// El x... significa que x funciona como un array que puede tener 0 o 1 elementos
	
	static float Req(float r1, float r2, int... x) {
	    float req = (r1 * r2) / (r1 + r2);
	    
	   //Si se le pasa un valor x va a ser mayor que cero
	    if (x.length > 0) {
	    	//Paso a recoger el valor que haya en x en la primera posicion
	        int unidadX = x[0];
	        
	        //Si vale 1 lo paso a microOhmnios
	        if (unidadX == 1) {
	            req *= 1000000;  
	        } 
	        //Si vale 2 lo paso a kiloOhmnios
	        else if (unidadX == 2) {
	            req /= 1000;
	        }
	    }
	    
	    
	    //Si le paso valor x y es o 0 o mas de 2 el resultado es en Ohmnios
	    return req;
	}
	
	
	//Método que recibe una matriz de números y modifica todas aquellas 
	//posiciones que almacenan un número negativo guardando en ellas el valor 
	//medio(redondeado al siguiente entero más cercano) de los elementos 
	//positivos de la matriz.
	
	static double[] ajustarMatriz(double[]x) {
		int contador = 0;
		double sumaNegativos =0;
		double sumaPositivos = 0;
		//Recorro la matriz buscando numeros positivos
		for(double i : x) {
			if(i>0) {
				sumaPositivos +=i;
				contador +=1;
			}
		}
		//Calculo la media de los positivos
		double mediaPositivos;
		if(contador !=0) {
			mediaPositivos = sumaPositivos/contador;
		}
		else {
			mediaPositivos = 0;
		}
		mediaPositivos = Math.ceil(mediaPositivos);
		
		//Ahora otro bucle buscando negativos
		for(int i = 0;i<x.length;i++) {
			if(x[i]<0) {
				x[i] = mediaPositivos;	
			}
		}
		return x;
	}



	//Programar un método que devuelva la media de una matriz de 
	//tipo float que recibe como parámetro. Debe de devolver 
	//siempre un valor con 2 decimales. 
	
	
	//Sobrecargarlo para que pueda recibir también una matriz de 
	//enteros.
	
	//Metodo con float
	static float mediaMatriz(float[]x) {
		float media = 0;
		float sumaMatriz = 0;
		int contador=0;
		
		for(float i : x) {
			sumaMatriz +=i;
			contador +=1;
		}
		media = sumaMatriz/contador;
		
		
		return Math.round(media * 100.0f) / 100.0f;
	}
	//Sobrecarga con int
	static float mediaMatriz(int[]x) {
		float media = 0;
		float sumaMatriz = 0;
		int contador=0;
		
		for(int i : x) {
			sumaMatriz +=i;
			contador +=1;
		}
		media = sumaMatriz/contador;
		
		
		return Math.round(media * 100.0f) / 100.0f;
	}
	
	
	
	//Método que recibe una matriz de tipo float y un boolean  y 
	//devuelve una matriz de int con los valores de la original 
	//redondeados al entero más cercano por debajo si el boolean 
	//es true o redondeados al entero más cercano por arriba si el 
	//boolean es false.
	
	//Probar este método desde el main con las dos opciones y mostrar por 
	//pantalla la media de la matriz devuelta en cada caso.

	static int[] redondeo(float[]original, boolean ArribaAbajo) {
		
		int[] resultado =new int [original.length];
		
		for(int i=0;i<original.length;i++) {
			if(ArribaAbajo) {
				resultado[i] = (int) Math.floor(original[i]);
			}
			else {
				resultado[i] = (int) Math.ceil(original[i]);
			}
		}
		return resultado;
	}
	
	
	//Programar un método que reciba una matriz 2D y modifique todas sus 
	//posiciones de forma que cada posición almacene el valor según la 
	//siguiente expresión:

	//valor = (i* j)3 /2*(i + j)
	
	//Siendo i el índice de fila y j el índice de columna. Si i y j son cero 
	//no se modifica el valor original.
	
	static int[][] modificarMatriz2D(int matriz[][]){
	    
	    for(int i = 0; i < matriz.length; i++) {
	        for(int j = 0; j < matriz[i].length; j++) {
	        
	            if (i != 0 || j != 0) {
	               
	                double numerador = Math.pow((i * j), 3);
	                double denominador = 2.0 * (i + j);
	                
	                matriz[i][j] = (int) (numerador / denominador);
	            }
	        }
	    }
	    
	    return matriz;
	}

	//Añado un bloque para llenar matrices de forma aleatoria
	public static void llenaMatriz(int x[], int valorInicial,int valorLimite) {
		Random generador = new Random();
		for(int i = 0;i<x.length;i++) {
			x[i] = generador.nextInt(valorInicial,valorLimite);
		}
	}
	//Lo añado para matrices 2D
	public static void llenaMatriz(int x[][], int valorInicial,int valorLimite) {
		Random generador = new Random();
		for(int i = 0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				x[i][j] = generador.nextInt(valorInicial,valorLimite);
			}
		}
	}
	//Metodo para enseñar matrices 2D
	public static void enseñarMatriz2D(int x[][]) {
		for(int i = 0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	//Programar un método que reciba una matriz 2D de tipo int y devuelva el 
	//siguiente String:
		//“La media de la fila 1 es: “ …
		//“La media de la fila 2 es: “ …
		//“La fila con la media más alta es la”...
	
	static void mediaMatriz2D(int x[][]) {
		double suma =0;
		double longitud =0;
		for(int i = 0;i<x.length;i++) {
			for(int j = 0;j<x[i].length;i++) {
				
			}
			
		}
	}



	
	


	
	
	

	
}
