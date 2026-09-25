package repaso.tema3;

import java.util.Scanner;

public class BusclesDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Este bucle lo que hace es, primero ejecutarse al menos 1 vez
		Y despues de ejecutar lo que hay en el do comprueba en el while
		si lo tiene que volver a ejecutar
		*/
		
		Scanner lector = new Scanner(System.in);
		
		char continuar;
		
		String opcion = "1" ;
		
		do {
			System.out.println("Escoge una opcion");
			System.out.println("a. Suma dos numeros");
			System.out.println("b. Pasa a binario");
			System.out.println("c. sal del programa");
			 
			opcion = lector.nextLine();
			
			switch(opcion) {
			
				case "a":
				case "A":
					int a = 4, b = 5;
					int suma = a+b;
					System.out.println(suma);
				break;
				
				case "b":
					int numero = 2550;
					String binario = Integer.toBinaryString(numero);
					System.out.println(numero + " en binario: "+ binario);
				break;
				
				case "c":
					System.exit(0);
				break;
				
				default:
					System.out.println("Opcion erronea");
				break;
				
			} // cierra el switch
			
			System.out.println("Desea volver al menu? \t\t s/n");
			continuar = lector.nextLine().charAt(0);
			
		} // Cierra el do
		
		while(continuar == 's');
		
		
	}

}
