package ejercicios.tema7_Ejercicio1;

import java.io.File;
import java.util.Arrays;

public class TestFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Funcion 1
		String ruta = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio1/ContarRegistrosPrueba";
		File archivo = new File(ruta);
		
		int numeroRegistros = Funciones.contarRegistros(ruta);
		
		System.out.println("El numero de registros en el archivo"+archivo.getName()+" es de: "+numeroRegistros +" registros");
		
		//Funcion 2
		//Escribir en un fichero
		ruta = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio1/ContarRegistrosPrueba";
		String mensaje = "Nuevo usuario";
		Funciones.escribeFichero(ruta, mensaje);
		
		//Funcion 3
		System.out.println();
		//Uso la misma ruta de la funcion anterior
		ruta = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio1/ContarRegistrosPrueba";
		
		String[] registros = Funciones.volcarFicheroAMatriz(ruta);
		
		System.out.println(Arrays.toString(registros));
		
		
		//Funcion 4

		ruta = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio1/TestFuncion4";
		//Hago un array
		String[] matriz = {"Ana;20000;TESLA","Marcos;30000;MERCEDES","Joni;3500;OPEL"};
		
		Funciones.volcarMatrizAFichero(matriz, ruta);
		
		//Funcion 5
		System.out.println();
		ruta = System.getProperty("user.dir") + "/src/repaso";
		
		System.out.println();
		Funciones.mostrarDirectorios(ruta);
		
		
		//Funcion 6
		System.out.println();
		System.out.println();
		ruta = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio1/";	
		
		String extension = "txt";
		String extension2 = "java";
		
		Funciones.mostrarFicheros(ruta, extension);
		System.out.println("\n");
		Funciones.mostrarFicheros(ruta, extension2);
		
	}

}
