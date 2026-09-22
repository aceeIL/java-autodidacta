package ejercicios;

public class EjerciciosAlgoritmia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calcular los números de Amstrong en un determinado rango. 
		//Un número es número de Amstrong o narcisista cuando es igual a
		//la suma de sus dígitos elevados a la potencia de su número de cifras
		
		//Por ejemplo : 371 = 3(3)+7(3)+1(3)
		
		
		//numero de fin del bucle
		int fin = 500;
		
		//este bucle lo que hace es que de un rango de 100 a 500
		//sume: 100,101,102,103,104...
		
		//De esta forma puedo coger y usar todos esos numeros
		//para calcular el numero amstrong
		
		//Para eso debo meter la logica dentro de deste bucle exterior
		
		
		for(int inicio = 100;inicio<=fin;inicio++) {
			
			//Declaro algunas variables
			int ultimoNumero = 0;
			int sumaAmstrong = 0;
			int contador = 0;
			
			//Este bucle es un contrador, cuenta cada digito del numero
			//por ejemplo 100 y almacena: "este numero tiene 3 cifras"
			
			
			for(int i =inicio;i >0;i/=10) {	
				ultimoNumero = i%10;
				contador++;
	
			}
			
			//Este bucle coge el numero de inicio por ejemplo 100
			//saca el ultimo digito "0",eleva ese digito al numero del contador
			//y lo guarda
			
			//Despues de guardarlo en "sumaAmstrong" se sobrescribe con "i/=10"
			
			//Y hace lo mismo con el siguiente ultimo numero "0"
			//asi hasta que ya no quedan numeros
			
			for(int i=inicio;i>0;i/=10) {	
				ultimoNumero = i%10;

				ultimoNumero = (int)Math.pow(ultimoNumero, contador);

				sumaAmstrong += ultimoNumero;
				
				}
			
			//Esta condicion enseña en pantalla si el numero es amstrong o no
			if(sumaAmstrong == inicio) {
				System.out.println(inicio+ " es un numero Amstrong");
			}

			else {
				System.out.println(inicio+ " no es un numero Amstrong");
			}
			

			
		}
		

	
	}
}
		
		
