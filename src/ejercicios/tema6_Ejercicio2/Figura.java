package ejercicios.tema6_Ejercicio2;

public class Figura {

	//Atributos
	private String nombre;
	private double perimetro;

	
	//Constructor
	public Figura(String nombre) {
		this.nombre = nombre;
	}
	//Metodos de acceso
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPerimetro() {
		return perimetro;
	}


	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	
	//toString
	@Override
	public String toString() {
		return "nombre: " + nombre + " | " +"perimetro: " + perimetro;
	}


	
	
}
