package repaso.tema7_Videos;

import java.io.*;

public class EjemploFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File archivo = new File(System.getProperty("user.dir"));
		
		System.out.println("Nombre del archivo: "+archivo.getName());
		System.out.println("Nombre de la carpeta del archivo: "+archivo.getParent());
		
		System.out.println("Ruta completa del archivo "+ archivo.getAbsolutePath());
		
		String archivos[] = archivo.list();
		
		for(String c: archivos) {
			System.out.println(c);
			
			File subArchivo = new File(archivo.getAbsolutePath(),c);
			if(subArchivo.isDirectory()) {
				String[] subArchivos = subArchivo.list();
				
				System.out.println();
				for(String c2 : subArchivos) {
					System.out.println(c2);
				}
			}
		}
		
		
		
	}

}
