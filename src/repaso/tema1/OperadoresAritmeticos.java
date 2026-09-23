package repaso.tema1;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Asignacion (=)
		int s = 5;
		int r, d,f;
		
		r = d = f = 9;
		
		//Operadores : + - * / %
		s +=1; //Tambien s= s+1
		s -=2;
		s = 900 - 45;
		
		
		int division = 8/2;
		
		int resto = 8%2;
		
		//Incremento y decremento : ++ , --
		
		s++; //s=+1
		++s;
		
		int m=9;
		int g = ++m;
		
		System.out.println(m);
		System.out.println(g);
		
		//Precedencia de los operadores
		
		double resultado = (m + g)*4/ 4;
	}

}
