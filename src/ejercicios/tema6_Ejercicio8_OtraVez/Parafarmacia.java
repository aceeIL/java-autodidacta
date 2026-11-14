package ejercicios.tema6_Ejercicio8_OtraVez;

public abstract class Parafarmacia extends Producto {
	
	//Clase definida como abstracta ya que no se sabe como programar el metodo calcularPrecioFinal

	//Atributos
	private float peso;
	
	//Constructor
	public Parafarmacia(String nombre, String fabricante, float precio,float peso) {
		super(nombre, fabricante, precio);
		// TODO Auto-generated constructor stub
		this.peso = peso;
		setCodigo();
	}

	
	//Setters and getters
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	//ToString
		@Override
		public String toString() {
			String mensaje = super.toString();
			mensaje += "****** Detalles del parafarmaco: ******"+"\n";
			mensaje += "Peso: ... "+this.peso+"\n";
			mensaje += "******************************************"+"\n";
			return mensaje;
		}
	
	
}
