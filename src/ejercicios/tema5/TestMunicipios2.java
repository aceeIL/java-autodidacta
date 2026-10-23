package ejercicios.tema5;

import java.util.Scanner;

public class TestMunicipios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Municipio m1 = new Municipio("Madrid",28,7);
		Municipio m2 = new Municipio("Guanarteme",1,1);
		Municipio m3 = new Municipio("Granada",18,23);
		Municipio m4 = new Municipio("Trujillo",57,99);
		Municipio m5 = new Municipio("Zaragoza",50,297);
		
		Municipio[] matrizM = new Municipio[10];
		
		matrizM[0] = m1;
		matrizM[1] = m2;
		matrizM[2] = m3;
		matrizM[3] = m4;
		matrizM[4] = m5;
		
		
		boolean salida = true;
		
		//Lector
		Scanner lector = new Scanner(System.in);
		
		
		do {
			System.out.println("Bienvenido al gestor de municipios\n");
			System.out.println("1.	Introducir nuevo municipio");
			System.out.println("2.	Buscar municipio");
			System.out.println("3.	Mostrar todos los municipios cuyo código acabe por un determinado número.");
			System.out.println("4.	Buscar por código");
			System.out.println("5.	Mostrar todos los municipios de una determinada Provincia.");
			System.out.println("6.	Salir del programa");
			
			int opcion = lector.nextInt();
			
			switch(opcion) {
				case 1:
					String nom = IO.readln("Introduzca el nombre del municipio: ");
					String CP = IO.readln("Introduzca el codigo de la provincia: ");
					String CM = IO.readln("Introduzca el codigo del municipio: ");
					
					nom = nom.trim();
					CP = CP.trim();
					CM  =CM.trim();
					
					int CPnum = Integer.parseInt(CP);
					int CMnum = Integer.parseInt(CM);
					
					for(int i=0;i<matrizM.length;i++) {
						if(matrizM[i] == null) {
							Municipio nuevo = new Municipio(nom,CPnum,CMnum);
							matrizM[i] = nuevo;
							break;
						}
						System.out.println("Municipio guardado con exito!");
					}
					break;
				case 2:
					nom = IO.readln("Introduzca el nombre del municipio: ");
					
					for(int i=0;i<matrizM.length;i++) {
						if(matrizM[i]!= null) {
							if(matrizM[i].getNombre().equalsIgnoreCase(nom)) {
								System.out.println(matrizM[i]);
							}
						}
					}
					break;
				case 3:
					String codigo = null;
					
					codigo = IO.readln("Introduzca el codigo del municipio: ");
					
					codigo = codigo.trim();
					codigo = codigo.replace(" ", "");
					
					for(int i=0;i<matrizM.length;i++) {
						if(matrizM[i]!= null) {
							if(matrizM[i].getCodigoMunicipio().equalsIgnoreCase(codigo)) {
								System.out.println(matrizM[i]);
							}
						}
					}
					break;
				case 4:					
					codigo = IO.readln("Introduzca el codigo de control: ");
					
					codigo = codigo.trim();
					codigo = codigo.replace(" ", "");
					
					for(int i=0;i<matrizM.length;i++) {
						if(matrizM[i]!= null) {
							if(matrizM[i].getDC().equalsIgnoreCase(codigo)) {
								System.out.println(matrizM[i]);
							}
						}
					}
					break;
				case 5:
					codigo = IO.readln("Introduzca el codigo de la provincia: ");
					
					codigo = codigo.trim();
					codigo = codigo.replace(" ", "");
					
					for(int i=0;i<matrizM.length;i++) {
						if(matrizM[i]!= null) {
							if(matrizM[i].getCodigoProvincia().equalsIgnoreCase(codigo)) {
								System.out.println(matrizM[i]);
							}
						}
					}
					break;
				case 6:
					System.out.println("Hasta otra!");
					break;
				default:
					System.out.println("Opcion no valida");
					break;
			}
			
			
		}
		while(salida);
		
		
	}

}
