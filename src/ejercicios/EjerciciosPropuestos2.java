package ejercicios;

public class EjerciciosPropuestos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vas a crear un programa que simule lanzamientos aleatorios 
		//de un dado de forma automática hasta que consiga acumular 
		//exactamente 21 puntos.
		
		int objetivo = 21;
		
		int contador = 0;
		
		for (int i = 0; i <= 500; i++) {
			int dado = (int) (Math.random() * 6) + 1;
			
			// 1. Calculamos cuánto sumaría el dado SIN guardarlo todavía en el 
			//contador
			
			int total = contador + dado; 
			 
		    // 2. Si ese total es seguro, lo guardamos oficialmente en el contador
			
		    if (total <= 21) {
		    	 contador = total; 
		    	 System.out.println("Tirada exitosa. Salió un " + dado + ". Puntuación: " + contador + "/21");
		    
		    }
		    else {
		        System.out.println("Salió un " + dado + ". ¡Te pasas de 21! Tirada descartada. Puntuación: " + contador + "/21");
		    }
		    
		 // 3. Comprobamos si hemos ganado para frenar el juego
		    if (contador == objetivo) {
		        System.out.println("¡Enhorabuena! Has alcanzado los 21 puntos exactos.");
		        break;
		    }
		    

//Cierre de paquete y main
		}

	}

}
