package repaso.tema7_Videos;

import java.io.*;

public class TryConRecursos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ruta = System.getProperty("user.dir") + "/src/repaso/tema7/EjemploVideo.txt";
		
		try(FileReader lector = new FileReader(ruta);BufferedReader bfLector = new BufferedReader(lector);){
			
			String linea ="";
			
			while(linea!=null) {
				linea = bfLector.readLine();
				if(linea!=null) {
					System.out.println(linea);
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
