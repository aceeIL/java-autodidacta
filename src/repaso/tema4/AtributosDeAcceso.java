package repaso.tema4;

public class AtributosDeAcceso {


	//Atributos de acceso : publlic , private , protected , de paquete
	static void buscarCaracter(String cadena , char ...letras) {
		for(int i= 0;i<cadena.length();i++) {
			for(int j = 0;j<letras.length;j++) {
				if(cadena.charAt(i)==letras[j]) {
					System.out.println(letras[j] + " en posicion "+ i);
				}
			
			}
		}
		
	}
	public static void imprime(String cadena){
		System.out.println(cadena);
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadenaPrueba = "Erase una vez un muercielago";
		buscarCaracter(cadenaPrueba,'a','e','i','o','u');
	}

}
