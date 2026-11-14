package ejercicios.tema6_Ejercicio8;

public abstract class Parafarmacia extends Producto {

	//atrb
	private float peso;
	
	//constructor
	public Parafarmacia(String nombre, String fabricante, float precio,float peso) {
		super(nombre, fabricante, precio);
		// TODO Auto-generated constructor stub
		this.peso = peso;
	}

	
	
	
}
