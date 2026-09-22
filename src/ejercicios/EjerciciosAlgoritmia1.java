package ejercicios;

public class EjerciciosAlgoritmia1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	
	//La expresión matemática C(m, n) en el mundo de la teoría combinatoria de los números, 
	//representa el número de combinaciones de m elementos tomados de n en n elementos.

	//C(m,n) =	 	m!
	//      	n!(m - n)!
	
	
	// Escribir una aplicación en la que se dé entrada a los enteros m, n y se calcule C(m, n) 
	//donde n! es el factorial de n.
	
		//Factorial: 5!= 5×4×3×2×1 = 120
		
		//por convenio: 0! = 1
	
	//Le doy valor a los valores de la formula m,n
	int m = 1;
	int n = 2;
	
	//Creo una variable para el factorial de m y n
	//Los inicializo a 1 para ir multiplicandolo incrementalmente
	int mf = 1;
	int nf = 1;
	
	//Bucle que cuenta de 1 al numero de la variable m
	//cada vez que pasa un bucle se multiplica el numero de la variable m por mf
	if(m <0) {
		System.out.println("El valor de m no puede ser negativo");
	}
	else if(n<0) {
		System.out.println("El valor de n no puede ser negativo");
	}
	else if(n > m) {
		System.out.println("El valor de n no puede ser mayor que m");

	}
	
	else {
		for(int i = 1;i<=m;i++) {
			System.out.println(i);
			mf = mf * i;
		}
	
		System.out.println("El factorial de m es: " + mf);
	
	//Bucle que cuenta de 1 al numero de la variable n
	//cada vez que pasa un bucle se multiplica el numero de la variable n por nf
	
		for(int i = 1;i<=n;i++) {
			nf = nf * i;
		}	
		System.out.println("El factorial de n es: " + nf);
	
	
	
	// Calculo la resta de (m-n)!
		int resta = m - n;
	//Hago la varible para calcular la factorial de la resta
		int Fmn = 1;
	//haciendo la resta y la factorial del resultado
	
	
		for(int i = 1;i<=resta;i++) {
			Fmn = Fmn * i;
		}
		System.out.println("El factorial de m - n es: " + Fmn);
	
	
	//Formula:
	
		int C = mf/ (nf*(Fmn));
	
		System.out.println("El resultado final es: " + C);
	}
	
	
	
	

	
	
	}
}
