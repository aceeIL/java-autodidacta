package ejercicios.tema6_Ejercicio2;

public class Poligono extends Figura {

	//Atributos
	private int numeroLados;
	private int longitudLados;
	
	//Constructor
	public Poligono(String nombre, int numeroLados, int longitudLados) {
		super(nombre);
		this.numeroLados = numeroLados;
		this.longitudLados = longitudLados;
		double perimetro = numeroLados*longitudLados;
		setPerimetro(perimetro);
	}

	
	
	//Metodos de acceso
	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int númeroLados) {
		this.numeroLados = númeroLados;
	}

	public int getLongitudLados() {
		return longitudLados;
	}

	public void setLongitudLados(int longitudLados) {
		this.longitudLados = longitudLados;
	}
	//ToString
	@Override
	public String toString() {
		String mensaje = super.toString();
		mensaje += " | " + "Numero de lados: " + this.numeroLados + " | " + "Longitud de los lados: "+ this.longitudLados;
		return mensaje;
	}
	
	
	
}
