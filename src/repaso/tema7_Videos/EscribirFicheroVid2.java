package repaso.tema7_Videos;

import java.io.*;

public class EscribirFicheroVid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String ruta = System.getProperty("user.dir") + "/src/repaso/tema7/EjemploVideo2.txt";
		
		try {
			FileWriter escritor = new FileWriter(ruta, true);
			
			escritor.write("Voy a escribir otra linea en un fichero" +"\n");
			
			escritor.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
