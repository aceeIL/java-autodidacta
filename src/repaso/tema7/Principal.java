package repaso.tema7;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Actividad 1
		String ruta = System.getProperty("user.dir") + "/src/repaso/tema7/pruebaDeLectura.txt";
		
		
		AccesoFichero.leerFichero(ruta);
		
		//Actividad 2
		String fileName = System.getProperty("user.dir") + "/src/repaso/tema7/pruebaDeLectura.txt";
		
		String linea = "Esta linea se añadira a mi archivo";
		
		AccesoFichero.escribirFichero(fileName, linea);
		
		//Actividad 3
		
		
	}

}
