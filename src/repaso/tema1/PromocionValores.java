package repaso.tema1;

public class PromocionValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. El mas pequeño a mas grande de los dos
		
		short y = 9;
		int x = 5;
		
		int suma = x + y;
		//No puedo guardar un entero de 32bits en un short de 16 por lo que se convierte todo en el mas grande
		
		int a = 5;
		long cb = 10;
		
		long suma2 = a + cb;
		//Aqui se tiene que almacenar igual en el mas grande, osea , long
		
		
		//2. byte, short y char --> int
		
		byte b = 9;
		byte cc = 5;
		int dd = b + cc;
		
		//No me va a dejar si lo quiero almacenar en una variable tipo byte
		//byte dd = b + cc;
		
		//3. Si uno es entero y el otro float --> float
		int entero = 10;
		float flotante = 3;
		float res =  entero*flotante;
		
		

	}

}
