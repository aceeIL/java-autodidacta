package ejercicios.tema8_Ejercicio5;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creo contactos
		Contacto c1 = new Contacto("Ana","643486411","ana@gamil.com");
		Contacto c2 = new Contacto("Juan","645667123","juan@gamil.com");
		Contacto c3 = new Contacto("Roberto","678446721","roberto@gamil.com");
		Contacto c4 = new Contacto("Conchi","698765432","conchi@gamil.com");
		Contacto c5 = new Contacto("Antonio","623456789","antonio@gamil.com");
		Contacto c6 = new Contacto("Ana","643486411","anton@gamil.com");
		
		//Crear un Set de contactos (ej anterior)
		Set<Contacto> agenda;
		
		//Asociarle una instancia de tipo HashSet.
		agenda = new HashSet<Contacto>();

		//Almacenar 5 contactos. Comprobad que no se almacenan contactos con números 
		//repetidos.
		agenda.add(c1);
		agenda.add(c2);
		agenda.add(c3);
		agenda.add(c4);
		agenda.add(c5);
		agenda.add(c6);
		//Mostrar por pantalla los contactos almacenados.
		System.out.println("\n"+"Contactos almacenados: "+"\n");
		for(Contacto c : agenda) {
			System.out.println(c);
		}
		//Haced que los Contactos sean comparables por el nombre.
		System.out.println("\n"+"Comparables: "+"\n");
		System.out.println("C1 es igual a c2 por el nombre: "+c1.compareTo(c2));
		System.out.println("C1 es igual a c6 por el nombre: "+c1.compareTo(c6));
		
		//Copiar los contactos anteriores en un TreeSet.
		TreeSet<Contacto> agenda2 = new TreeSet<Contacto>();
		agenda2.addAll(agenda);
		
		//Mostrar por pantalla el TreeSet creado.
		System.out.println("\n"+"Contactos almacenados en agenda2: "+"\n");
		for(Contacto c : agenda2) {
			System.out.println(c);
		}

		
		
	}

}
