package ejercicios.tema6_Ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura f1 = new Cuadrado("Soy un cuadrado",4,2);
		Figura f2 = new Circulo("Soy un círculo",2);
		Figura f3 = new Triangulo("Soy un triángulo",3,3);
		
		System.out.println(f1.getNombre() + " y mi perimetro es: " + f1.getPerimetro() + "m");
		
		System.out.println(f2.getNombre() + " y mi perimetro es: " + f2.getPerimetro() + "m");
		
		System.out.println(f3.getNombre() + " y mi perimetro es: " + f3.getPerimetro() + "m");
		
		
		Circulo cir1 = new Circulo("Soy un círculo",2);
		Circulo cir2 = new Circulo("Soy un círculo",3);
		
		System.out.println(cir1.getNombre() + " y mi radio es: " + cir1.getRadio() + " m, " + "con lo que mi perimetro es " + cir1.getPerimetro() +" m");
	
		System.out.println(cir2.getNombre() + " y mi radio es: " + cir2.getRadio() + " m, " + "con lo que mi perimetro es " + cir2.getPerimetro() +" m");

	}

}
