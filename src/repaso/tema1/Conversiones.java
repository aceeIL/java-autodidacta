package repaso.tema1;

public class Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Conversiones Implicitas
		
		//byte --> short --> int --> long
		//float --> double
		
		//Se hace la conversion
		float f1 = 9.5f;
		double f2 = f1;
		
		byte b1 = 9;
		short b2 = b1;
		
		//Conversiones explícitas
		//cast : (tipo de dato)expresion
		
		//A veces puedes obligar a convertir el valor en un byte de un int.
		// si el valor al que vas a convertir no entra en su tipo de dato,
		//entonces no te guarda el valor que pusiste si no algo diferente aun que no te da error.
		int x = 1000;
		byte b4 = (byte)x;
		
		System.out.println(b4);
		
		//Me interesa convertir el valor manualmente cuando:
		int x2 =10;
		byte b5 = (byte)x2;
		
		int division = x2 / 3;
		System.out.println(division);
		
		//Esta division no te da un valor exacto ya que 10 / 3 no son divisibles
		//Aqui si me interesa convertirlo:
		int x3 =10;
		byte b6 = (byte)x3;
		
		float division2 = (float)x3 / 3;
		System.out.println(division2);
		
		//Aqui ya me entrega el resultado completo 3.3333333
		

		char a1 = 'a';
		double a2 = a1;
		
		
		String s = "java";
		s.substring(1,3);
		
		System.out.println(s);
		
		
		
		
		
		
	}

}
