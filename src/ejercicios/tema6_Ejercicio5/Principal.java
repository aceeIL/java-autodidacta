package ejercicios.tema6_Ejercicio5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto2D p1 = new Punto2D(2,4);
		Punto2D p2 = new Punto2D(4,4);
		
		
		Linea2D l1 = new Linea2D(2,4,p1,p2);
		Linea2D l2 = new Linea2D(4,6,p1,p2);
		
		Circulo c1 = new Circulo(6.6f);
		Circulo c2 = new Circulo(6.6f);
		
	
		
		System.out.println("Compruebo que funciona el calculador de distancia: "+l1.getDistancia());
		System.out.println("Compruebo que funciona el calculador de area de un circulo: "+c1.calcularAreaCirculo()+"\n");
		
		
		
		//Metodos de interfacz
		boolean esMayor = l1.isMayorQue(l1, l2);
		boolean esIgual = c1.isIgual(c1, c2);
		boolean esMenor = l1.isMenorQue(l1, l2);
		System.out.println("Compruebo es mayor funciona: "+esMayor);
		System.out.println("Compruebo es igual funciona: "+esIgual);
		System.out.println("Compruebo es menor funciona: "+esMenor);
		
		
		
		
		
		
	}

}
