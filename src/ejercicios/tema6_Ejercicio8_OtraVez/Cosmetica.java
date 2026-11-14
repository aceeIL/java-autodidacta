package ejercicios.tema6_Ejercicio8_OtraVez;

public class Cosmetica extends Parafarmacia {


	//atributos
	private boolean piel;
	
	//Constructor
	public Cosmetica(String nombre, String fabricante, float precio, float peso,boolean piel) {
		super(nombre, fabricante, precio, peso);
		// TODO Auto-generated constructor stub
		this.piel = piel;
		setCodigo();
	}

	
	//Setters and getters
	public boolean getPiel() {
		return piel;
	}

	public void setPiel(boolean piel) {
		this.piel = piel;
	}

	//Metodo calcularPrecioFinal de producto
	@Override
	public float CalcularPrecioFinal() {
		float IVA = 0.10f;
		float precio = getPrecio();
		
		float precioFinal = precio + (precio * IVA);
		
		float precioRedondeado = Math.round(precioFinal * 100.0f) /100.0f;
		
		return precioRedondeado;
	}
	
	//ToString
	@Override
	public String toString() {
		String mensaje = super.toString();
		mensaje += "Cosmético para la piel: ... "+this.piel+"\n";
		mensaje += "Precio final: ... "+this.CalcularPrecioFinal()+" €"+"\n";
		return mensaje;
	}
	
	
}
