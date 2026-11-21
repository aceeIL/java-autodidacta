package repaso.tema7_Videos;

import java.io.*;

public class LeerFicheroVid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String ruta = System.getProperty("user.dir") + "/src/repaso/tema7/EjemploVideo.txt";
		
		//Crear un lector
		try {
			FileReader lector = new FileReader(ruta);
			
			int c =0;
			
			while(c!=-1) {
				c = lector.read();
				if(c!=-1)
					System.out.print((char)c);
			}
			lector.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("El fichero no se encuentra");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error en el while");
		}
		
		
		
		
		
		
		
	}

}
