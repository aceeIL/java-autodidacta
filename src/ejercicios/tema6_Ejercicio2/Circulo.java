package ejercicios.tema6_Ejercicio2;

public class Circulo extends Figura {

	//Atributos
	private double radio;
	
	//Constructor
	public Circulo(String nombre,double radio) {
		super(nombre);
		this.radio = radio;
		double perimetro = 2 * Math.PI *radio;
		setPerimetro(perimetro);
	}

	
	//Metodos de acceso
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	//toString
	@Override
	public String toString() {
		String mensaje = super.toString();
		mensaje += " | " + "radio: " + this.radio;
		return mensaje;
	}

	
	
}
