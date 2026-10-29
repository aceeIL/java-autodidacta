package ejercicios.tema5_Ejercicios10y11;

import java.util.Arrays;

public class Receta {

	//Atributos
	private Ingrediente[] ingredientes;
	private String descripcion;
	private float precioFinal; // suma de los precios de los ingredientes
	
	//Constructores
	public Receta(String descripcion, float precioFinal) {
		this.ingredientes = new Ingrediente[3];
		this.descripcion = descripcion;
		this.precioFinal = precioFinal;
	}
	public Receta (String descripcion, int numeroIngredientes) {
		this.descripcion = descripcion;
		this.ingredientes = new Ingrediente[numeroIngredientes];
	}
	public Receta(Ingrediente[] ingredientes, String descripcion) {
		this.precioFinal = calcularPrecioFinal(ingredientes);
		this.ingredientes = ingredientes;
		this.descripcion = descripcion;	
	}
	
	
	
	//Metodos Acceso
	public Ingrediente getIngredientes(int posicion) {
			if(posicion > ingredientes.length-1) {
				return null;
			}
			else {
				return ingredientes[posicion];
			}
		}
		
	

	public void addIngredientes(Ingrediente ingrediente) {
		for(int i=0;i<ingredientes.length;i++) {
			if(ingredientes[i] == null) {
				ingredientes[i] = ingrediente;
				calcularPrecioFinal(ingredientes);
				break;
			}
		}
	}
	
	public float getAporteCalorico() {
		float total = 0;
		for(int i=0;i<ingredientes.length;i++) {
			total += ingredientes[i].getCalorias();
		}
		return total;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecioFinal() {
		return precioFinal;
	}
	
	//ToString
	@Override
	public String toString() {
		return "ingredientes: " + Arrays.toString(ingredientes) + " --- " +"descripcion: " + descripcion
				+ " --- " +"precioFinal :" + precioFinal + " --- " +"Aporte calorico total: " + getAporteCalorico();
	}
	
	//Metodos 
	private float calcularPrecioFinal(Ingrediente[] ingredientes) {
		float total = 0;
		for(int i=0;i<ingredientes.length;i++) {
			if(ingredientes[i] != null) {
				total += Ingrediente.getPrecioIngrediente(ingredientes[i].getPrecioKilo(),ingredientes[i].getCantidad());
			}
		}
		return this.precioFinal = total;
	}
	
	
	
	
	
}
