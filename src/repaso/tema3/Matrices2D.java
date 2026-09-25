package repaso.tema3;

public class Matrices2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int[3][3];
		
		int matriz2[][] = {{1,2,3},{4,5,6}};
		
		matriz[0][0] = 2;
		matriz[0][1] = 4;
		matriz[0][2] = 6;
		
		matriz[1][0] = 9;
		matriz[1][1] = 9;
		matriz[1][2] = 9;
		
		matriz[2][0] = 3;
		matriz[2][1] = 4;
		matriz[2][2] = 1;
		
		
		int numeroFilas1 = matriz.length;
		int numeroFilas2 = matriz2.length;
		
		System.out.println("Filas de la matriz1: "+numeroFilas1);
		System.out.println("Filas de la matriz2: "+numeroFilas2);
		
		int numeroColumnas = matriz[0].length;
		
		//como es cuadrada se puede hacer asi
		int elementosTotal1 = matriz.length*matriz.length;
		
		//Si no es cuadra tienes que multiplicar:
		//columnas*longitud de una de las filas
		
		int elementosTotal2 = matriz2.length*matriz2[0].length;
		
		System.out.println("Elementos Matriz1: "+elementosTotal1);
		System.out.println("Elementos Matriz2: "+elementosTotal2);
		
		System.out.println();
		System.out.println("Con for: ");
		//enseñar todos los elemantos de la matriz
		
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			//Salto de linea para separar las columnas
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Con for each: ");
		//For each para matrices 2D
		for(int x[] : matriz) {
			for(int t : x) {
				System.out.print(t + " "); // cada vez que lee una fila, enseñala
			}
			System.out.println(); //Espacio entre filas
		}
		
		//Como romper tanto el bucle de dentro como fuera
		System.out.println();
		System.out.println("Rompiendo el bucle de dentro y fuera: ");
		// solo se ejecutaria 1 vez ya que llega al print y va al break hacia fuera
	outerFor:for(int x[] : matriz) {
			for(int t : x) {
				System.out.print(t + " "); 
				break outerFor; 
				
			}
			System.out.println(); 
		}
	}
}
