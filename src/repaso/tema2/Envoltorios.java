package repaso.tema2;

public class Envoltorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Permiten tratar a las variables primitivas como objetos
		//Permiten conversion entre String y variables primitivas
		
		String dni = "12345678E";
		
		String subDni = dni.substring(0,8); // recoge los numeros del DNI
		
		int dniNumero = Integer.parseInt(subDni); //Convierte subDni en primitiva
		
		int resto = dniNumero%23; //Comprobar que el dni es correcto
		
		
		String s = "34.4234";
		float f = Float.parseFloat(s); //Convierte de objeto a float
		
		
		int numero = 234;
		
		String numeroString = Integer.toString(numero);
		String numero2String = Integer.toBinaryString(numero); //enseña: 11101010
		
		//Character --> char
		char letra = '3';
		
		boolean esNumero = Character.isDigit(letra);
		
		boolean esLetra = Character.isLetter(letra);
		
		boolean esMayuscula = Character.isUpperCase(letra);
		
		
		
		
		
	}

}
