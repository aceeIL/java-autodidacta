package ejercicios.tema6_Ejercicio5;

public class Circulo implements Relationable{

	//atr
	private float radio;

	//Const
	public Circulo(float radio) {
		super();
		this.radio = radio;
	}
	//Metodos de acceso
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	//Metodos
	public float calcularAreaCirculo() {
		float area = (float) (Math.PI*Math.pow(radio, 2));
		return area;
	}
	
	
	
	//Metodos de la interfaz
	@Override
	public boolean isIgual(Object a, Object b) {
		if(a instanceof Circulo && b instanceof Circulo) {
			if(((Circulo)a).getRadio() == ((Circulo)b).getRadio()) {
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean isMayorQue(Object a, Object b) {
		// TODO Auto-generated method stub
		if(a instanceof Circulo && b instanceof Circulo) {
			if(((Circulo)a).getRadio() > ((Circulo)b).getRadio()) {
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean isMenorQue(Object a, Object b) {
		// TODO Auto-generated method stub
		if(a instanceof Circulo && b instanceof Circulo) {
			if(((Circulo)a).getRadio() < ((Circulo)b).getRadio()) {
				return true;
			}
		}
		return false;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "radio: " + radio + " | " + "Area del circulo: " + calcularAreaCirculo();
	}



	
}
