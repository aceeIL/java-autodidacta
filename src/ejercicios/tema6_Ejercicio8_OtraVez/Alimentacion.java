package ejercicios.tema6_Ejercicio8_OtraVez;

public class Alimentacion extends Parafarmacia implements Descuentable{


	//atributos
	private boolean infantil;
	
	//Constructor
	public Alimentacion(String nombre, String fabricante, float precio, float peso,boolean infantil) {
		super(nombre, fabricante, precio, peso);
		// TODO Auto-generated constructor stub
		this.infantil = infantil;
		setCodigo();
	}


	
	//setters and getters
	public boolean getInfantil() {
		return infantil;
	}

	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}
	
	//Metodo calcularPrecioFinal de producto
	@Override
	public float CalcularPrecioFinal() {
		float IVA = 0.21f;
		float precio = getPrecio();
		
		float precioFinal = precio + (precio * IVA);
		
		float precioRedondeado = Math.round(precioFinal * 100.0f)/100.0f;
		
		return precioRedondeado;
	}
	//Metodo aplicarDescuento de la interfaz descuentable
	
	//Alimentación infantil con un descuento de 15%
	@Override
	public float aplicarDescuento() {
		float descuento = 0.15f;
		
		if(getInfantil()) {
			float nuevoPrecioBase = getPrecio() - (getPrecio() * descuento);
			setPrecio(nuevoPrecioBase);
		}
		
		return CalcularPrecioFinal();
	}
	
	//ToString
	@Override
	public String toString() {
		String mensaje = super.toString();
		mensaje += "Alimento infantil: ... "+this.infantil+"\n";
		mensaje += this.infantil ? "Precio final: ... "+this.aplicarDescuento() +" €"+"\n" : "Precio final: ... "+this.CalcularPrecioFinal() + " €"+"\n"; 
		return mensaje;
	}
	
}
