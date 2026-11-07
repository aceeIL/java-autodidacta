package ejercicios.tema6_Ejercicio4;

import java.util.Random;

public class SospechosoCoronavirus extends Paciente {

	//Atributos
	private boolean infectado;
	private boolean realizadoTest;
	
	//Constructor
	public SospechosoCoronavirus(String dni,String nombre,int edad) {
		super(dni,nombre,edad);
		this.infectado = false;
		this.realizadoTest = false;
		
	}
	
	//Metodos de acceso
	public void realizarTest() {
	    Random random = new Random(); 
	    
	    // Asigna true o false directamente de forma aleatoria
	    this.infectado = random.nextBoolean(); 
	    
	    if (this.infectado) {
	        setEnfermedad("coronavirus");
	    }
	}
	
	public void curar() {
		this.infectado = false;
		this.setEnfermedad(null);
	}

	public boolean isInfectado() {
		return infectado;
	}
	
	
	//ToString
	@Override
	public String toString() {
		String mensaje = super.toString();
		mensaje += " | " +"Infectado: "+this.infectado;
		return mensaje;
	}
	
	
}
