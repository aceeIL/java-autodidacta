package ejercicios.tema6_Ejercicio8;

public class Cosmetica extends Parafarmacia {


	//atrb
	private boolean piel;
	
	//const
	public Cosmetica(String nombre, String fabricante, float precio, float peso,boolean piel) {
		super(nombre, fabricante, precio, peso);
		// TODO Auto-generated constructor stub
		this.piel = piel;
	}

	//set y get
	public boolean isPiel() {
		return piel;
	}

	public void setPiel(boolean piel) {
		this.piel = piel;
	}
	
	//Metodos de precioCalculable
	@Override
	public float calcularPrecioFinal() {
		// TODO Auto-generated method stub
		float IVA = 0.1f;
		
		float precioFinal = getPrecio() + (getPrecio() * IVA);
		
		return precioFinal;
	}
	
}
