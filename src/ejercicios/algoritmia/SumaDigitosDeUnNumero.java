package ejercicios.algoritmia;

import java.util.Scanner;

public class SumaDigitosDeUnNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		boolean salida = true;
		boolean salida2 = true;
		do {
			
			String cadenaNumeroUsuario = IO.readln("Introduzca un numero: ");
			
			int numeroFinal = 0;
			String caracter;
			for(int i=0;i<cadenaNumeroUsuario.length();i++) {
					caracter = "";
					caracter += cadenaNumeroUsuario.charAt(i);
					numeroFinal += Integer.parseInt(caracter);
			}
			
			
			
			
			
			System.out.println("La suma de los digitos del numero "+cadenaNumeroUsuario+ " es: "+numeroFinal);
			
			
			
			do {
				salida2 = true;
				System.out.println("\nDesea continuar?");
				System.out.println("1.	Si");
				System.out.println("2.	NO");

				//Lector
				Scanner lector = new Scanner(System.in);
				int opcion = lector.nextInt();

				switch(opcion) {
				case 1:
					salida2 = false;
					break;
				case 2:
					salida = false;
					salida2 = false;
					break;
				default:
					System.out.println("Opcion invalida");
					break;
				}
			}
			while(salida2);

		}
		while(salida);
		
		
	
		
		
	}
}


