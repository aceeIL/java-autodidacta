package repaso.tema4;

public class Sobrecarga {

	public static int suma(int a, int b) {
		
		return a + b;
	}
	public static double suma(double a, double b) {
		return a+b;
	}
	
	public static int suma(int x[]) {
		int s = 0;
		for(int numero : x) {
			s+=numero;
		}
		return s;
	}
	
	public static double suma(double x[]) {
		double s = 0;
		for(double numero : x) {
			s+=numero;
		}
		return s;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res = suma(6, 2);
		
		
	}
	
}



