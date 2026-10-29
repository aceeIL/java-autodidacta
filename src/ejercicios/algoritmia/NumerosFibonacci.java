package ejercicios.algoritmia;

import java.util.Scanner;

public class NumerosFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean salida = true;
		boolean salida2 = true;
		int[] serieFinal;
		do {
			int nTotalSerieFinal = Integer.parseInt(IO.readln("Introduce cuantos numeros de la serie desea ver: "));
			
			serieFinal = new int[nTotalSerieFinal];
			if(nTotalSerieFinal == 0) {
				System.out.println("Debes introducir un numero superior a 0");
			}
			for(int i = 0;i<serieFinal.length;i++) {
				if(serieFinal[serieFinal.length-1] == 0) {
					if(i == 0) {
						serieFinal[i] = 0;
					}
					else if(i==1) {
						serieFinal[i] = 1;
					}
					else if(i==2){
						serieFinal[i] = 1;
					}
					else {
						serieFinal[i] = serieFinal[i-2] + serieFinal[i-1];
					}
					
				} // fin primer if

				
			} // fin for
			
			for(int i=0;i<serieFinal.length;i++) {
				if(serieFinal[i] == serieFinal[serieFinal.length-1]) {
					System.out.print(serieFinal[i]);
					
				}
				else {
					System.out.print(serieFinal[i] + " , " );
				}
			} // fin for
			
			
			do {
				salida2 = true;
				System.out.println("\nDesea continuar?");
				System.out.println("1.	Si");
				System.out.println("2.	NO");
			
				//Lector
				Scanner lector = new Scanner(System.in);
				int opcion = lector.nextInt();
			
				switch(opcion) {
					case 1:
						salida2 = false;
						break;
					case 2:
						salida = false;
						salida2 = false;
						break;
					default:
						System.out.println("Opcion invalida");
						break;
				}
			}
			while(salida2);
			
		}
		while(salida);
	}
}
