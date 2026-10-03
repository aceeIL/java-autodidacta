package ejercicios.tema3;

import java.util.*;

public class EjerciciosPropuestos3 {

	public static void main(String[] args) {
		
		//Ejercicio 1
		System.out.println("Ejercicio 1");

		//Realizar un programa que indique si un número es primo o no. 
		//Un número es primo cuando sólo tiene 2 divisores : el 1 y el mismo número.

		
		
		// Lector
		Scanner lector = new Scanner(System.in);
		
		int numero;
		
		System.out.println("\nEscribe un numero");
		numero = lector.nextInt();

		// 1. Descarte inicial: números menores que 2 no son primos
		if (numero < 2) {
			System.out.println(numero + ": No es un numero primo");
		}
		// 2. Los números 2, 3, 5 y 7 son primos puros
		else if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
			System.out.println(numero + ": Es un numero primo");
		}
		// 3. Si se puede dividir exactamente entre 2, 3, 5 o 7... ¡No es primo!
		else if (numero % 2 == 0) {
			System.out.println(numero + ": No es un numero primo");
		}
		else if (numero % 3 == 0) {
			System.out.println(numero + ": No es un numero primo");
		}
		else if (numero % 5 == 0) {
			System.out.println(numero + ": No es un numero primo");
		}
		else if (numero % 7 == 0) {
			System.out.println(numero + ": No es un numero primo");
		}
		// 4. Si superó todas las pruebas anteriores, lo declaramos primo
		else {
			System.out.println(numero + ": Es un numero primo");
		}
		
		lector.close();
		
		
		
		
		//Ejercicio 2
		
		System.out.println("\nEjercicio 2");
		//Realizar un programa que resuelva una ecuación de segundo grado :
		
		//ax(2) + bx + c = 0
		
		double x1,x2,a,b,c;
		a = 0;
		b = 5;
		c = 3;
		
		x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		
		x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

		if(a==0) {
			x1 = x2 = -c/b;
		}
		else if(b==0) {
			x1 = Math.sqrt(-c/a);
			x2 = -Math.sqrt(-c/a);
		}
		
		if (Double.isNaN(x1) || Double.isNaN(x2)) {
		    System.out.println("Esta operación no ha podido ser realizada (no tiene solución real).");
		} else {
		    System.out.println("X1 es igual a: " + x1);
		    System.out.println("X2 es igual a: " + x2);
		}
		
		
		
		
		//Ejercicio 4
		System.out.println();
		System.out.println("Ejercicio 4\n");
		//Se desea calcular el salario neto semanal de los trabajadores de una 
		//empresa de acuerdo a las siguientes normas:
		
		
		
		//a. Si las horas semanales trabajadas son <= 38, el salario bruto 
		//será igual a las horas trabajadas por la tasa a la que se paga la hora.
		
		//b. Horas extras (38 o más), a una tasa 50 por 100 superior a la ordinaria.

		
		//c. Impuestos 0%, si el salario bruto es menor o igual a 300 euros.
		
		
		//d. Impuestos del 10 %, si el salario bruto es mayor a 300 euros.
		
		double salarioBruto;
		double salarioFinal;
		double horasSemanales = 37.00;
		double horasTrabajadas = 40.00;
		double pagaPorHora = 25.00;
		
		if(horasSemanales <= 38) {
			salarioBruto = horasSemanales*pagaPorHora;
			salarioFinal = salarioBruto;
			
			if(salarioBruto<=300) {
			
				salarioBruto = salarioFinal;
				System.out.println("El salario final es de: "+salarioFinal);
			}
			
			else {
				salarioFinal = salarioBruto * 0.90;
				System.out.println("El salario final con un 10% de impuestos es: "+salarioFinal);
			}
			
		} //Cierre If padre
		
		if(horasSemanales >38) {
			salarioBruto = horasTrabajadas*pagaPorHora;
			salarioBruto *= 1.5;
			
			salarioFinal = salarioBruto;
			
			if(salarioBruto<=300) {
				
				salarioBruto = salarioFinal;
				System.out.println("El salario final es de: "+salarioFinal);
			}
			
			else {
				salarioFinal = salarioBruto * 0.90;
				System.out.println("El salario final con un 10% de impuestos es: "+salarioFinal);
			}
			
		} //Cierre IF padre
			
				

		
//cierre de main y clase		
	}
}