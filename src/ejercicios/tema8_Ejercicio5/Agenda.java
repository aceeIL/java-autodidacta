package ejercicios.tema8_Ejercicio5;

import java.util.*;

public class Agenda {

	private ArrayList<Contacto> contactos;

	public Agenda(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	
	//Almacena un contacto nuevo en contactos.
	public void addContacto(Contacto c) {
		this.contactos.add(c);
	}
	
	// Devuelve el contacto que tiene el teléfono que se le pasa como argumento. 
	public Contacto getContacto(String telefono) {
		
		for(int i=0;i<this.contactos.size();i++) {
			if(this.contactos.get(i).getTlfn().equals(telefono)) {
				return this.contactos.get(i);
			}
			
		}
		return null;
	}
	
	//Devuelve la posición del contacto cuyo telefono coincide con el que se le pasa como 
	//parámetro.
	
	public int getPosicionContacto(String telefono) {
		int pos = -1;
		
		for(int i=0;i<this.contactos.size();i++) {
			if(this.contactos.get(i).getTlfn().equals(telefono)) {
				pos=i;
			}
			
		}
		
		return pos;
	}
	
	//Elimina el contacto con el telefono especificado.
	public void eliminarContacto(String telefono) {
		Iterator<Contacto> it = this.contactos.iterator();
		
		while(it.hasNext()) {
			if(it.next().getTlfn().equals(telefono)) {
				it.remove();
			}
		}
	}
	
	//Devuelve una lista con todos los contactos que contienen todo o parte del String que 
	//recibe como parámetro.
	public ArrayList<Contacto> buscarContactos(String nombre){
		ArrayList<Contacto> listadoNombres = new ArrayList<Contacto>();
		
		String buscado = nombre.toLowerCase();
		
		for(int i=0;i<this.contactos.size();i++) {
			if(this.contactos.get(i).getNombre().toLowerCase().contains(buscado)) {
				listadoNombres.add(this.contactos.get(i));
			}
		}
		
		
		return listadoNombres;
		
	}
	
	//Busca un contacto por el teléfono y modifica el nombre y el correo.	
	public void modificarContacto(String telefono , String nombre , String correo) {
		boolean realizado = false;
		for(int i=0;i<this.contactos.size();i++) {
			if(realizado) {
				break;
			}
			if(this.contactos.get(i).getTlfn().equals(telefono)) {
				this.contactos.get(i).setNombre(nombre);
				this.contactos.get(i).setCorreo(correo);
				realizado = true;
			}
		}
	}
	
	//Método que muestra por consola todos los contactos almacenados
	public void imprimeContactos() {
		Iterator<Contacto> it = this.contactos.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
}
