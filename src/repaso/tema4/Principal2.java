package repaso.tema4;

import java.util.Random;

public class Principal2 {

	public static int suma4(int x,int y) {
		return x+y;
	}
	static double calcularMedia(int ...n) {
      	
      	double suma = 0;
      	
      	for(int m : n) {
      		suma +=m; 
      	}
      	double media = suma/n.length;
      			
      	return media;
 	}

	public static void ponerUnos(int x[]) {
		for(int i =0;i<x.length;i++) {
			x[i] = 1;
		}
	}
	public static void llenaMatriz(int x[], int limite) {
		Random generador = new Random();
		for(int i = 0;i<x.length;i++) {
			x[i] = generador.nextInt(limite);
		}
	}
	
	public static void imprime(int x[]) {
		 for(int n : x) {
			 System.out.print(n + " ");
		 }
		 System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado = suma4(4,3);
		
		int[] matriz = new int[10];
		
		imprime(matriz);
		
		ponerUnos(matriz);
		
		System.out.println();
		imprime(matriz);
		
		llenaMatriz(matriz, 100);
		System.out.println();
		imprime(matriz);
		System.out.println();
		double x = calcularMedia(1,2,4,8,16,32);
		
		System.out.println("La media es: "+x);
		
		
	
		
	}
}
