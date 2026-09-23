package repaso.tema2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class LecturaPorTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Lectura por teclado
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		
		String nombre = lector.nextLine();
		
		System.out.println("Introduce la edad: ");
		
		int edad = lector.nextInt();
		
		System.out.println("Tu nombre es: "+nombre+" y tu edad es: "+edad);
		lector.close();
		
				
		
	}

}
