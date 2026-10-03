package ejercicios.tema3;

import java.util.Arrays;
import java.util.Random;

public class EjerciciosMatricesYbucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Realizar un programa que calcule el porcentaje de valores negativos 
		//que hay en una matriz 2D.
		
		Random generador = new Random();
	
		
		int[][] numeros = new int [4][5];
		
		//Le doy valores aleatorios a las posiciones
		for(int i = 0;i<numeros.length;i++) {
			for(int j = 0;j<numeros[i].length;j++) {
				numeros[i][j] = generador.nextInt(-2,4);
			}
		}
		System.out.println("Matriz generada: ");
		//Enseño la matriz generada
		for(int i = 0;i<numeros.length;i++) {
			for(int j = 0;j<numeros[i].length;j++) {
				System.out.print(numeros[i][j] + "\t ");
			}
			System.out.println();
		}
		
		//Cuento el total de numeros negativos
		int contadorNegativos = 0;
		
		for(int i = 0;i<numeros.length;i++) {
			for(int j = 0;j<numeros[i].length;j++) {
				if(numeros[i][j] < 0) {
					contadorNegativos = contadorNegativos + 1;
				}
	
			}	
		}
		
		System.out.println("\nTotal negativos: " + (contadorNegativos));
		
		//Cuento el total de numeros
		int contador = 0;
		
		for(int i = 0;i<numeros.length;i++) {
			for(int j = 0;j<numeros[i].length;j++) {
				contador++;
				
			}	
		}

		//Calculo el porcentaje
		int porcentajeDeNegativos;
		
		porcentajeDeNegativos = (contadorNegativos * 100)/contador;
		
		System.out.printf("\nTotal negativos: %d%%", porcentajeDeNegativos);	
		
		System.out.println();
		//Realizar un programa que trabaje con una matriz de Strings y realice 
		//los siguientes algoritmos:
		
		//a.	Almacenar un String en la primera posición vacía.
		
		//b.	Contar cuantas palabras contienen el caracter ‘t’.
		
		//c.	Buscar un determinado string en la matriz e indicar la posición 
		//en que se encuentra. Si no lo encuentra debe informar de dicha 
		//circunstancia.
		
		//Creo la matriz 
		String[] ciudades = {"Madrid","París","Tokio","Nueva York",null,"Toledo",null};
		
		//En la primera posicion vacia guardo Vigo
		for(int i = 0;i<ciudades.length;i++) {
			if(ciudades[i] == null) {
				ciudades[i] = "Vigo";
				break;
			}
		}
		//Compruebo que solo se gurada en la primera posicion vacia
		System.out.println("\n"+Arrays.toString(ciudades));
		
		//Contar cuantas palabras contienen el caracter ‘t’.
		contador = 0;
		
		for(int i = 0;i<ciudades.length;i++) {
			if(ciudades[i] != null) {
				for(int j = 0;j<ciudades[i].length();j++) {
					char letra = ciudades[i].charAt(j);
				
					if(letra == 't' || letra == 'T') {
						contador +=1;
						break;
					}
				}
			}
		}
		System.out.println("\n"+contador + " palabras contienen la letra t o T");
		
		
		//Buscar un determinado string en la matriz e indicar la posición en que 
		//se encuentra. Si no lo encuentra debe informar de dicha circunstancia.
		contador = 0;
		boolean encontrada = false;
		
		String ciudadBuscada =  "Vigo";
		
		for (int i = 0; i < ciudades.length; i++) {
		    if (ciudades[i] != null && ciudades[i].equals(ciudadBuscada)) {
		        System.out.println("\nLa ciudad " + ciudadBuscada + " está en la posición: " + i);
		        encontrada = true; 
		        break; 
		    }
		}

		if (!encontrada) {
		    System.out.println("\nLa ciudad " + ciudadBuscada + " no se encuentra en las ciudades registradas.");
		}
		
		
		
		System.out.println();
		System.out.println("Generador de contraseñas:\n");
		//Programa que genera un password de forma aleatoria:
				char[] caracteres = {'a','b','c','d','e','f','g','h','i','j','k','l'};
				
				StringBuilder password = new StringBuilder();
				Random generador1 = new Random();
				//Generar password de n caracteres
				int tamanho = generador1.nextInt(4, 25);
				
				int numeroPasswords = 10;
				
				int j = 0;
				
				while(j<numeroPasswords) {
					int i = 0;
					password.delete(0, password.length());
					while(i<tamanho) {
						//Generar uno de los caracteres permitidos
						password.append(caracteres[generador1.nextInt(12)]);
						i++;
					}
					//Añadir una mayúscula
					
					password.insert(generador1.nextInt(password.length()), Character.toUpperCase(caracteres[generador.nextInt(12)]));
					System.out.println("Password generada: "+ password);
					j++;
				}

		
				
	}

}
