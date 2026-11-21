package repaso.tema7_Videos;

import java.io.*;

public class BufferLector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ruta = System.getProperty("user.dir") + "/src/repaso/tema7/EjemploVideo.txt";
		
		FileReader lector;
		try {
			lector = new FileReader(ruta);
			BufferedReader bfLector = new BufferedReader(lector);
			
			String linea ="";
			
			while(linea!=null) {
				linea = bfLector.readLine();
				if(linea!=null)
					System.out.println(linea);
			}
			
			lector.close();
			bfLector.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			FileWriter escritor = new FileWriter(ruta,true);
			BufferedWriter bfEscritor = new BufferedWriter(escritor);
			
			String registro = "Marcos Dominguez#101010101R#marcosdom@gmail.com";
			bfEscritor.write(registro);
			bfEscritor.newLine();
			
			bfEscritor.close();
			escritor.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
