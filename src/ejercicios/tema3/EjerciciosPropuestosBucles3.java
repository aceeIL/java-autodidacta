package ejercicios.tema3;

import java.util.Arrays;

public class EjerciciosPropuestosBucles3 {

	public static void main(String[] args) {
	
		
		//Realizar un programa que detecte las posiciones de una cadena 
		//en las que hay vocales.
		
		String cadena = "Buenas Tardes";
		
		String vocales = "aeiouAEIOU";
		
		
		
		for(int i = 0;i<cadena.length();i++) {
			char letra = cadena.charAt(i);
			
			if(vocales.indexOf(letra) == -1) {
				
			}
			else {
				System.out.println("Hay una vocal en la posicion: "+i);
			}
			
		}
		
		
		
		
		//Realizar un programa que detecte cuantas palabras de una cadena 
		//empiezan por Z o por z.
		
		cadena = "Zorro corre feliz en el zoo";
		
		int contador = 0;
		
		String[] array = cadena.split(" ");
		
		for(int i = 0;i<array.length;i++) {
				if(array[i].startsWith("z") || array[i].startsWith("Z")) {
					contador +=1;
				}
			}
		System.out.println("\nEn la cadena hay "+contador +" palabra o palabras que empiezan por z");
		
		
		

		
		//Realizar un programa que compruebe si una matriz de dos dimensiones 
		//es la matriz identidad es decir solo tiene unos en su diagonal principal.
		
		
		int[][] matriz = {{1,0,0},{0,1,0},{0,0,1}};
		
		boolean esIdentidad = true;
		
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				if(i == j) {
					if(matriz[i][j] != 1) {
						esIdentidad = false;
					}
				}
				else {
					if(matriz[i][j] != 0) {
						esIdentidad = false;
					}
				}
			}
		}
		
		
		
		if(esIdentidad == true) {
			System.out.println("\nLa matriz es una matriz identidad");
		}
		else {
			System.out.println("\nLa matriz no es una matriz identidad");

		}
		
		
		
		
	}
}
