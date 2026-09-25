package repaso.tema3;

public class SentenciaBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Encontrar primer numero negativo en una matriz 
		
		int matriz[] = {4,1,5,3,-3,-5,-1};
		
		int posicion = -1;
		
		for(int i = 0;i<matriz.length;i++)
			 if(matriz[i]<0) {
				 posicion = i;
				 break;
			 }
		System.out.println("El numero negativo se encuentra en la posicion: "+posicion);
		
		
		
		
		String nombres[] = new String[3];
		String nombre = "Pedro";
		
		for(int i = 0;i<nombres.length;i++) {
			if(nombres[i] == null) {
				nombres[i] = nombre;
				break;
			}
		
		
		}
	}

}
