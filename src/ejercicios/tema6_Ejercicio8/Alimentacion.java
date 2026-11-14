package ejercicios.tema6_Ejercicio8;


public class Alimentacion extends Parafarmacia implements Descuentable{
	
	//atrb
	private boolean infantil;
	
	//const
	public Alimentacion(String nombre, String fabricante, float precio, float peso, boolean infantil) {
		super(nombre, fabricante, precio, peso);
		// TODO Auto-generated constructor stub
		this.infantil = infantil;
	}

	
	//set y get
	public boolean isInfantil() {
		return infantil;
	}

	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}
	
	//Metodos interfaces
	@Override
	public float calcularPrecioFinal() {
		// TODO Auto-generated method stub
		float IVA = 0.21f;
		
		float precioFinal = getPrecio() + (getPrecio() * IVA);
		
		return precioFinal;
	}
	@Override
	public float aplicarDescuento() {
		float precioFinal = calcularPrecioFinal() * 0.80f;
		
		return precioFinal;
	}
	
}
