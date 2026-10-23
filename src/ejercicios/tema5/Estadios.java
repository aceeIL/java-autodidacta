package ejercicios.tema5;

public class Estadios {
	
	//Atributos
	private String nombre;
	private int capacidad;
	private String ciudad;
	
	//Constructor
	public Estadios() {
		this.capacidad = 0;
		this.nombre = null;
		this.ciudad = null;
	}
	public Estadios(String nombre, String ciudad,int capacidad) {
		this.capacidad = capacidad;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	
	
	//Metodos acceso / getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "nombre: " + nombre + " --- "+"ciudad: " + ciudad +" --- " +"capacidad: " + capacidad;
	}
	
	
	//
}
