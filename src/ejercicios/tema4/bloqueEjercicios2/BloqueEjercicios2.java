package ejercicios.tema4.bloqueEjercicios2;

import java.util.Scanner;

public class BloqueEjercicios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable de control del do, while
		boolean salida = true;
		//Lector
		Scanner lector = new Scanner(System.in);
		
		do {
		System.out.println("Bienvenido al menu prinncipal de ejercicios");
		System.out.println("Elige el numero del ejercicio al que desees acceder:\n");
		System.out.println("1.	Calcular la letra del DNI");
		System.out.println("2.	Formateo de cadena a un caracter visible");
		System.out.println("3.	Sobrecarga del apartado 2 con indefinidos char");
		System.out.println("4.	Validacion de cadena de texto por condiciones");
		System.out.println("5.	Codificacion de un String");
		System.out.println("6.	Salir del menu de usuario");
		
		int opcion = lector.nextInt();
		
		switch(opcion) {
		default:
			System.out.println("Opcion no valida");
			break;
			
			//Apartado 1.	Calcular la letra del DNI
		case 1:
			//Variableas de control del while interno del case 1
			boolean DNIcalculado = false;
			boolean salidaRapida1 = false;
			
			//While para que mientras el usuario no quiera salir o el DNI
			//haya sido calculado no salga 
			while(DNIcalculado == false&& salidaRapida1 == false) {
			System.out.println();
			String DNI = IO.readln("Introduzca su DNI sin letra: ");
			DNI = DNI.trim();
			//Variable para validar si tiene 8 numeros
			String numeros8 = "12345678";
			
			
			//Comparlo la longitud de un String de 8 para que si tiene algo distinto de 8 numeros 
			//de longitud entre al if
			if(DNI.length() != numeros8.length()) {
				System.out.println("El DNI debe contener 8 digitos");
				break;
			}
			
			//Variable de la letra del DNI
			char letraDNI = MTDCadenas.calcularLetraDNI(DNI);
			if(letraDNI == ' ') {
				DNIcalculado = false;
			}
			
			//Enseño el DNI con la letra
			
			System.out.println("El DNI con la letra calculada es: "+DNI+letraDNI+"\n");
			DNIcalculado = true;
			}
			break;
			
			
			//Apartado 2.	Formateo de cadena a un caracter visible
		case 2:
			boolean salidaRapida2 = false;
			
			while(salidaRapida2 == false) {
				
				String cadenaUsuario = IO.readln("Introduzca una cadena de texto: ").trim();
				if(cadenaUsuario.isEmpty()) {
					System.out.println("\nNo debes dejar este espacio vacio, vuelva a intentarlo!\n");
					continue;
				}
				String letraUsuario = IO.readln("Introduzca una letra que desea que sea visible: ").trim();
				if(letraUsuario.isEmpty()) {
					System.out.println("\nNo debes dejar este espacio vacio, vuelva a intentarlo!\n");
					continue;
				}
				
				//Convierto la letra introducida a un char
				char letraFinal = letraUsuario.charAt(0);
				
				//Hago el formateo y lo guardo
				String cadenaFormateada = MTDCadenas.formateoDeChars(cadenaUsuario, letraFinal);
				
				//Enseño la cadena:
				System.out.println(cadenaFormateada+"\n");
				salidaRapida2 = true;
				
			}
			
			break;
			
			//Apartado 3.	Sobrecarga del apartado 2 con indefinidos char
		case 3:
			boolean salidaRapida3 = false;
			
			while(salidaRapida3 == false) {
				//Le pido al usuario una cadena de caracteres y la valido
				String cadenaUsuario = IO.readln("Introduzca una cadena de texto: ").trim();
				if(cadenaUsuario.isEmpty()) {
					System.out.println("\nNo debes dejar este espacio vacio, vuelva a intentarlo!\n");
					continue;
				}
				//Le pido al usuario caracteres que van a ser visibles
				String caractereVisiblesUsuario = IO.readln("\nIntroduce la cadena de caracteres que se van a ver: ").trim();
				if(caractereVisiblesUsuario.isEmpty()) {
					System.out.println("\nNo debes dejar este espacio vacio, vuelva a intentarlo!\n");
					continue;
				}
				//Paso la variable " caractereVisibles " a un char
				char[] caracteresVisiblesFinales = caractereVisiblesUsuario.toCharArray();
				//Hago el formateo
				String cadenaFormateada1 = MTDCadenas.formateoDeChars(cadenaUsuario, caracteresVisiblesFinales);
				
				//Enseño la cadena:
				System.out.println(cadenaFormateada1+"\n");
				salidaRapida3 = true;
			}
			break;
			//Apartado 4.	validacion de una cadena de texto por condiciones
		case 4:
			boolean salidaRapida4 = false;
			
			while(salidaRapida4 == false) {
				System.out.println("La cadena de texto debe cumplir con las siguientes condiciones.");
				System.out.println("1. Minimo 8 caracteres");
				System.out.println("2. Minimo una minuscula");
				System.out.println("3. Minimo una mayuscula");
				System.out.println("4. Minimo un digito numerico");
				
				
				String cadenaUsuario = IO.readln("Introduzca una cadena de texto: ").trim();
				if(cadenaUsuario.isEmpty()) {
					System.out.println("\nNo debes dejar este espacio vacio, vuelva a intentarlo!\n");
					continue;
				}
				boolean valido = MTDCadenas.validacionDeCadena(cadenaUsuario);
				
				System.out.println("\nLa cadena de texto cumple con las condiciones? "+valido+"\n");
				salidaRapida4 = true;
			}
			break;
			
			
			//Apartado 5.	Codificacion de un String segun un algortimo.
		case 5:
			boolean salidaRapida5 = false;
			
			while(salidaRapida5 == false) {
				String cadenaUsuario = IO.readln("Introduzca una cadena de texto: ");
				if(cadenaUsuario.isEmpty()) {
					System.out.println("\nNo debes dejar este espacio vacio, vuelva a intentarlo!\n");
					continue;
				}
				String cadenaFinal = MTDCadenas.codificacionDeAlgoritmo(cadenaUsuario).trim();
				System.out.println("\n"+cadenaFinal+"\n");
				salidaRapida5 = true;
				
			}
			break;
		case 6:
			System.out.println("¡Hasta otra!");
			salida = false;
			break;
		}//fin switch
		
		}//fin do
		while(salida);
		
		
		
	}

}
