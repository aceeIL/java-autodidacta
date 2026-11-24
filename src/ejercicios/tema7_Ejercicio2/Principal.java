package ejercicios.tema7_Ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean entrada = true;
		Scanner lector = new Scanner(System.in);
		
		do {
			System.out.println("\nBienvenido al gestor:\n");
			System.out.println("1.Darse de Alta");
			System.out.println("2.Iniciar Sesion");
			System.out.println("3.Salir");
			
			System.out.print("Elege una opcion: ");
			
			//Scanner
			int opcion = lector.nextInt();
			
			switch(opcion) {
			case 1:
				
				String usuario1 = IO.readln("Introduzca un nombre de usuario para su cuenta: ");
				String password1 = IO.readln("Introduzca una contraseña para su cuenta: ");
				
				Metodos.darAlta(usuario1, password1);
				
				break;
			case 2:
				
				String usuario = IO.readln("Introduzca su nombre de usuario: ");
				String password = IO.readln("Introduzca su contraseña: ");
				
				System.out.println("\n");
				if(Metodos.ComprobarCredencial(usuario, password)) {
					System.out.println("Iniciando Sesion...");
					System.out.println("Bienvenido! "+ usuario);
					
				}
				
				break;
			case 3:
				System.out.println("Hasta otra!");
				lector.close();
				entrada = false;
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
			
		}
		while(entrada);
	}

}
