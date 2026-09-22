package ejercicios;

public class EjerciciosPropuestos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Escribir un programa que calcule el área de un triángulo a partir de la base y la altura 
	//cuyos valores se introducen por código. 
	//La salida del programa debe de ser un mensaje informando del valor del área.
		
	int base = 10;
	
	float altura = 9.88f;
	
	float area = (base*altura)/2;
	
	System.out.println("El valor del area del triangulo es de: " + area + " metros cuadrados");
	
	System.out.println();
	//Escribir un programa que calcule la superficie , el volumen y la longitud 
	//de una circunferencia a partir del radio.
	
	//Longitud = 2 * PI * radio
	
	//Volumen = (4/3)*PI*radio3 (radio al cubo)
	
	//Superficie = PI*radio2 (radio al cuadrado)

	int radio = 10;
	
	double longitud = 2*Math.PI*radio;
	
	double Volumen = (4d/3)*Math.PI*Math.pow(radio, 3);
	
	double superficie = Math.PI*Math.pow(radio, 2);
	
	System.out.println("La longitud es de: " + longitud +" metros");
	System.out.println("El volumen es de " + Volumen + " metros cubicos" );
	System.out.println("La superficio es de: " + superficie + " metros cuadrados");
	
	System.out.println();
	//Escribir un programa que nos permita convertir una temperatura en grados fahrenheit 
	//en su equivalente en la escala Celsius. La fórmula para realizar la conversión es : 
	
	//celsius = ((fahrenheit -32)*5)/9
	
	float fahrenheit  = -42.0f;
	
	float celsius = ((fahrenheit -32)*5)/9f;
	
	System.out.println("La conversion de grados fahrenheit a celsius es de: "+ celsius + "ºC" );
	
	System.out.println();
	
	//Intercambiar el valor de dos variables. Es decir si una variable x vale 5 
	//y una variable “y” vale 1 , 
	//el programa debe cambiar estos valores ,esto es , x pasa a valer 1 e y pasa a valer 5.
	
	int x = 10;
	int y = 5;
	
	int temp = x;
	
	x = y;
	y = temp;
	
	System.out.println("El valor de x es: " +x +" y el valor de y es:" +y);
	
	//Calcular un programa que a partir del precio de un producto le aplique un descuento del 15%
	//y muestre por pantalla el precio inicial y el precio rebajado.
	
	float producto = 100.0f;
	
	float rebajas = producto*0.15f;
	
	float productoRebajado = producto - rebajas;
	
	System.out.println("El precio del producto es: "+ producto);
	System.out.println("El precio rabajado un 15% es: "+ productoRebajado + "€");
	
	//Escribir  un programa que permita calcular la media de 5 variables.
	
	float a1=1.8f,a2 = 54,a3 = 98,a4 = 5,a5= 3;
	
	float total = a1+a2+a3+a4+a5;
	
	float media = total/5;
	
	System.out.println("La media es de: "+ media);
	
	System.out.println();
	
	//Escribir un programa que defina una constante llamada IMPUESTOREVAL ,
	//la inicialize a 3.4.   y permita calcular el importe de la venta de un piso a partir 
	//de la siguiente fórmula:

	//precioVenta = importe + CI + (IMPUESTOREVAL *Antiguedad/100)*precioCatastral
	
		//CI : Es la comisión de la inmobiliaria que es de un 3% sobre el importe de la venta.
		
		//Antiguedad: Años que pasaron desde la compra del piso.
		
		//precioCatastral: Es el valor catastral del inmueble.
	
	//Voya a usar Antigüedad 10 años
	
	//Valor fijo
	final float IMPUESTOREVAL = 3.4f;
	
	//Valores predefinidos
	double importe = 150000.0f;
	float Antiguedad = 10f;
	double precioCatastral = 80000.0;
	
	//Obtencion de CI
	double CI = (importe*0.03);
	
	//Precio de venta
	
	double precioVenta = importe + CI + (IMPUESTOREVAL *Antiguedad/100)*precioCatastral;
	
	
	System.out.println("El precio de ventes es de: " + precioVenta + " €");


	
	}
}



	
