package repaso.tema4;

import java.util.Random;

public class Principal {

	public static int suma1(int ...numeros) {
		int s = 0;
		
		for(int valor : numeros) {
			s+=valor;
		}
		return s;
	}
	
	public static boolean esPrimo(int numero) {
		//Filtros para numero 2 y menores o iguales a 1
		if (numero <= 1) { return false; }
		if (numero == 2) { return true; }
		//Defino la boolean primo
		
		
		//Hago un bucle para comprobar si el numero es primo
		for(int i = 2;i<numero;i++) {
			if(numero%i==0) {
				return false;
				
			}
			
		}
		return true;
	}
	
	public static double suma1(double ...n) {
		double s = 0;
		
		for(double valor : n) {
			s+=valor;
		}
		return s;
	}
	
	
	public static void imprime(String mensaje, int ...numeros) {
		System.out.println(mensaje);
	}
	public static void suma2(int x, int y) {
		int s = x+y;
		System.out.println("La suma es de"+x+" + "+y+" es: "+s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultado = suma1(1,2,2,3,4,5);
		
		System.out.println(resultado);
		
		System.out.println();
		
		
		
		
		
		int matriz[] = new int[50];
		
		Random generador = new Random();
		
		//Genero numeros en la matriz
		for(int i = 0;i<matriz.length;i++) {
			matriz[i] = generador.nextInt(101);
		}
		//Detectar numeros primos

		boolean primo = true;
		for(int n : matriz) {
			
			 if(esPrimo(n)) {
				imprime(n + " es primo.");
			}	
		
		}
		
		//Prueba funcion tipo void suma
		suma2(3,4);
		
		//if(suma2(3,4)>10) {} --> Error -->	No se puede hacer ya que no 
		//genera un valor
		
		//imprime(suma2(34)); --> Error -->	No se puede hacer ya que no genera
		//un valor
		
		//int res = suma2(4,3); --> Error -->	No se puede hacer ya que 
		//no genera un valor
		
		
		

	
			
		
	}
}
