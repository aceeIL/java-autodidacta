package ejercicios;

public class EjerciciosPropuestos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vas a crear un programa que simule lanzamientos aleatorios 
		//de un dado de forma automática hasta que consiga acumular 
		//exactamente 21 puntos.
	    System.out.println("Programa de dado");
	    System.out.println();

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
		    
		  //3. Comprobamos si hemos ganado para frenar el juego
		    if (contador == objetivo) {
		        System.out.println("¡Enhorabuena! Has alcanzado los 21 puntos exactos.");
		        break;
		    }
		}
		    System.out.println();
		    System.out.println("Programa de Ascensores");
		    System.out.println();
		    //Vas a programar la lógica del cerebro de un ascensor inteligente. 
		    //El ascensor tiene un límite de peso estricto y un límite de personas.
		    
		    //400KG maximo de peso y 5 personas
		    
		    // Hay una cola de 10 personas esperando para entrar.
		    
		    //Cada persona de la fila pesa exactamente 75 kilos.
		    
		    
		    //El programa debe procesar la fila de 10 personas una por una. 
		    //Para cada persona, debe comprobar si meterla rompería el límite de 
		    //kilos o el límite de personas.
		    
		    int pesoMaximo = 400;
		    int Totalppp = 0; //ppp = peso por persona
		    
		  
		    int limitePersonas = 5;
		    
		    for(int personas = 0;personas <=limitePersonas;personas++) {
			    int pesoFuturo = Totalppp +75;

		    	if(pesoFuturo <= 400 ) {
		    		Totalppp = pesoFuturo;
		    	}
		    	else {
		    		System.out.println("Han accedido: "+personas+" personas al ascensor");
		    		System.out.println("El peso total es de: "+Totalppp+"kg" );
		    		break;
		    	}
		    	
		    	
		    	
		    }

//Cierre de paquete y main
		}

	}
