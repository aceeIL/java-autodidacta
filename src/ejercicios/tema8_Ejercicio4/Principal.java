package ejercicios.tema8_Ejercicio4;

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
		Contacto c6 = new Contacto("Anton","656443789","anton@gamil.com");
		
		//Creo un array list de contactos
		ArrayList<Contacto> contactos = new ArrayList<Contacto>();
		//Creo una agenda
		Agenda ag1 = new Agenda(contactos);
		
		//Pruebo los metodos:
		
		//addContacto:
		ag1.addContacto(c1);
		ag1.addContacto(c2);
		ag1.addContacto(c3);
		ag1.addContacto(c4);
		ag1.addContacto(c5);
		ag1.addContacto(c6);
		
		//getContacto
		Contacto ultimoC = ag1.getContacto("623456789");
		
		System.out.println(ultimoC);
		
		//getPosicionContacto
		int pos = ag1.getPosicionContacto("643486411");
		
		System.out.println("El contacto con el numero 643486411 esta en la pos: "+pos);
		
		//eliminarContacto
		ag1.eliminarContacto("698765432");
		
		//buscarContactos
		ArrayList<Contacto> buscados = new ArrayList<Contacto>();
		buscados = ag1.buscarContactos("Ana");
		
		System.out.println("El contacto buscado es: ");
		System.out.println(buscados);
		
		buscados = ag1.buscarContactos("A");
		
		System.out.println("contactos buscados: ");
		System.out.println(buscados);

		//modificarContacto
		ag1.modificarContacto("678446721","Robert","robert@gamil.com");
		
		//imprimeContactos
		System.out.println("\n"+"Contactos enlla agenda:"+"\n");
		ag1.imprimeContactos();
		
		
	}

}
