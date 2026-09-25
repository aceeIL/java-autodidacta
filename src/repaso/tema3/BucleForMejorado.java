package repaso.tema3;

public class BucleForMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] x = {2,3,4,5,6};
		
		int suma = 0;
		
		//for each: for(int valor : x )
		for(int v : x) {
			suma = suma + v;
		}
		
		// solo lectura
		
		//No se usa para modificar la matriz
		// Por ejemplo
		
		//Si v es menor que 5 modificar el valor a 0
		for(int v : x) {
			if(v < 5) {
				v = 0;
			}
		}
		//HAgo un for each para ver si se ha realizado el cambio
		for(int v : x) {
			System.out.println(v);
		}
		//Pero siguen los mismos valores de la matriz original
		
		
		
	}

}
