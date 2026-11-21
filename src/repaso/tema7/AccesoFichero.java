package repaso.tema7;

import java.io.*;

public class AccesoFichero {

	
	//Actividad 1
	public static void leerFichero(String ruta) {
		
		try(FileReader lector = new FileReader(ruta);){
			
			int c = 0;
			while(c!=-1) {
				c = lector.read();
				
				System.out.print((char)c);
				
			}
			
			lector.close();
			
		}
		catch(FileNotFoundException e) {
			System.out.println("NO se ha podido encontrar el archivo que desea leer");
		}
		catch(IOException e) {
			System.out.println("Error durante la lectura de datos");
		}
		
	}
	
	
	//Actividad 2
	
	public static void escribirFichero(String fileName, String linea) {
		
		try(BufferedWriter bfescritor = new BufferedWriter(new FileWriter(fileName,true))){
			
			bfescritor.write(linea);
			bfescritor.newLine();
			
			bfescritor.close();
			
		}
		catch(FileNotFoundException e) {
			System.out.println("NO se ha podido encontrar el archivo que desea leer");
		}
		catch(IOException e) {
			System.out.println("Error durante la lectura de datos");
		}
		
	}
	
	
	
}
