package ejercicios.tema4.bloqueEjercicios2;

public class MTDCadenas {

	
	//Crear un método que reciba un String que represente un dni sin letra y 
	//devuelva la letra que correspondería a ese número. El algoritmo para 
	//obtener la letra del dni es el siguiente:
	
	public static char calcularLetraDNI(String DNI) {
		char letraDNI = ' ';
		if (DNI == null || DNI.length() != 8) {
			return ' ';
		}
		//Paso el DNI a int y calculo el resto
		int pasarDNI = Integer.parseInt(DNI);
		int restoDNI = pasarDNI%23;
			
		//Hago una lista con las letras en los indices correctos
		String listaLetrasDNI= "T,R,W,A,G,M,Y,F,P,D,X,B,N,J,Z,S,Q,V,H,L,C,K,E";
			
		letraDNI = listaLetrasDNI.charAt(restoDNI);
	
		
		
		return letraDNI;
		
	}
	
	
		
	//Crear un método que reciba un char y un String y devuelva un String formado por guiones 
	//menos en las posiciones en las que encuentre el char , en las que se verá el caracter.
	
	public static String formateoDeChars(String b, char a) {
		String cadenaFinal = "";
		char posA;
		char posB;
		
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i) == a) {
				cadenaFinal += a;
			}
			else {
				cadenaFinal += '-';
			}
		}

		return cadenaFinal;
	}
	
	
	
	
	
	//Sobrecargar el método anterior para que pueda recibir un String y un 
	//número opcional de variables de tipo char. El método devolverá un String
	//formado por los caracteres encontrados n sus posiciones y guiones en 
	//aquellas posiciones donde no están los caracteres que recibe como 
	//parámetro. 

	public static String formateoDeChars(String b,char... a) {
		String cadenaFinal = "";
		for(int i =0;i<b.length();i++) {
			 boolean encontrada = false;
			for(int j=0;j<a.length;j++) {
				if(a[j] == b.charAt(i)) {
					cadenaFinal += b.charAt(i);
					encontrada = true;
				}
			}//fin for j
			if(encontrada == false) {
				cadenaFinal += '-';
			}
		}//fin for i
		
		
		
		return cadenaFinal;
	}
	
	
	
	//Programar un método que reciba un String y devuelva true si contiene al
	//menos 1 dígito , una letra mayúscula , una letra minúscula y como 
	//mínimo 8 caracteres. Devolverá false si no cumple estas características.
	
	
	public static boolean validacionDeCadena(String cadena) {
		boolean valido = false;
		
		boolean digito = false;
		boolean minus = false;
		boolean mayus = false;
		
		if(cadena.length()<8) {
			return false;
		}
		for(int i=0;i<cadena.length();i++) {
			if(Character.isDigit(cadena.charAt(i))) {
				digito = true;
			}
			if(Character.isUpperCase(cadena.charAt(i))) {
				mayus = true;
			}
			if(Character.isLowerCase(cadena.charAt(i))) {
				minus = true;
			}
		}
		if(mayus && minus && digito) {
			valido = true;
		}
		
		return valido;
	}

	/*Crear un método que codifique el String que recibe como parámetro según el 
	siguiente algoritmo:
	
	Las letras “i” las sustituye por un 1
	
	Las letras “o” las sustituye por un cero.
	
	Las letras “a” por un *
	
	Añade al final de cada palabra del String el hashcode de dicha palabra.
	
	Añade al principio de cada palabra el número de caracteres en binario de la palabra
	resultante después de las transformaciones anteriores.
	*/
	
	public static String codificacionDeAlgoritmo(String cadena) {
		//reemplazar i por 1
		cadena = cadena.replace('i', '1');
		//reemplazar o por 0
		cadena = cadena.replace('o', '0');
		//reemplazar a por *
		cadena = cadena.replace('a', '*');
		
		//añadir hash en cada palabra(metodo privado aparte)

		return "";
	}
	private static String añadirHashCode(String cadena) {
		
		
		return "";
	}

}
