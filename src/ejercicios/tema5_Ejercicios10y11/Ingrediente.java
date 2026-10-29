package ejercicios.tema5_Ejercicios10y11;

public class Ingrediente {
	
	//Atributos
	private String nombre;
	private float cantidad;
	private float precioKilo;
	private float calorias;
	
	//Constructor
	public Ingrediente(String nombre, float cantidad, float precioKilo, float calorias) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precioKilo = precioKilo;
		this.calorias = calorias;
	}
	//ToString
	@Override
	public String toString() {
		return "nombre: " + nombre + " --- " +"cantidad: " + cantidad + " --- " +"precioKilo: " + precioKilo + " --- " +"calorias: "
				+ calorias;
	}
	
	//Metodos de acceso
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecioKilo() {
		return precioKilo;
	}
	public void setPrecioKilo(float precioKilo) {
		this.precioKilo = precioKilo;
	}
	public float getCalorias() {
		return calorias;
	}
	public void setCalorias(float calorias) {
		this.calorias = calorias;
	}
	
	//MEtodos
	public static float getPrecioIngrediente(float precioKilo, float cantidad) {
		
		return precioKilo * cantidad;
	}
	
	
	
	
	
}
