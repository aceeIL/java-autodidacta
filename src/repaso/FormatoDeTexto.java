package repaso;



public class FormatoDeTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String producto = "Café";
		double precio = 2.50;

		System.out.println("El " + producto + " cuesta " + precio + "€.");
		// Imprime: El Café cuesta 2.5€. (Pierde el cero del formato de dinero)

		
		//Con printf (Escribes una plantilla limpia y usas "comodines"):
		System.out.printf("El %s cuesta %.2f€.%n", producto, precio);
		// Imprime: El Café cuesta 2,50€.
		
		
		//%s --> Para texto (String).
		
		//%d --> Para números enteros (int, byte, short, long).
		//Nota: "d" viene de "decimal integer".
		
		//%f --> Para números con decimales (float, double).
		
		//%n --> Es el salto de línea propio de printf (equivale al "ln" de println),
		//Tambien puede sustituir el \n
		
		//Otros ejemplos de formateo de texto
		//%.2f --> Muestra solo 2 decimales (y redondea si es necesario).
		
		float x = 1.6324f;
		double y = 5.4534f;
		
		double z = x + y;
		
		System.out.printf("El resultado con dos decimales es %.2f",z);
		
		System.out.printf("%nEl resultado con tres decimales es %.3f",z);

	}

}
