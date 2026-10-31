package repaso.tema6;

public class Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArithmeticException
		int numero = 10;
		int n2 =  0;
		
		try {
		double resultado = numero/n2;
		}
		
		catch(ArithmeticException e) {
			System.out.println("No se puede realizar esta operacion");
		}
		
		//NumberFormatException
		String valor = "34,48";
		try {
		float valorFloat = Float.parseFloat(valor);
		}
		
		catch(NumberFormatException e) {
			System.out.println("No se puede transformar el valor indicado");
		}
		
		//IndexOutOfBounds
		int matriz[] = new int[10];
		try {
		matriz[9] = 1;
		double res = matriz[0]/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("NO se pudo almacenar el valor en la matriz");
		}
		
		catch(ArithmeticException e) {
			System.out.println("No se puede realizar esta operacion");
		}
		
		//las excepciones generales siempre las ultimas por que si no siempre entra en las excepciones
		//genrales, sin entrar en ArithmeticException o ArrayIndexOutOfBoundsException
		catch(Exception e) {
			System.out.println("Algo fallo");
		}
	}

}
