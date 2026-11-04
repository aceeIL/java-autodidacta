package ejercicios.tema6_Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Directivos extends EmpleadosPYME {

	//Atributos
	private String telefono;
	
	//Constructor
	public Directivos(String dni, LocalDate fechaNacimiento, LocalDate fechaContratacion, String nombre,
			String telefono) {
		super(dni, fechaNacimiento, fechaContratacion, nombre);
		
		setTelefono(telefono);
	}
	
	//Metodos de acceso
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		if(validarTlfn(telefono)) {
			this.telefono = telefono;
		}
	}
	
	//Override de ActualizarSalario
	@Override
	public void ActualizarSalario() {
		//salario = salarioBase + (años de antiguedad/3)*salarioBase*0,2
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(getFechaContratacion(), fechaActual);
		
		int antiguedad = periodo.getYears();
		
		setSalario((float) (getSalarioBase() + (antiguedad/3)*getSalarioBase()*0.02));
		
	}

	//ToString
	@Override
	public String toString() {
		String mensaje = super.toString();
		mensaje += " | "+ "telefono: " + telefono;
		return mensaje;
	}
	
	//Validar telefono
	private boolean validarTlfn(String telefono) {
		boolean validado = false;
		int contador =0;
		
		if(telefono.length()==9) {
			for(int i=0;i<telefono.length();i++) {
				if(Character.isDigit(telefono.charAt(i))) {
					contador ++;
				}
			}
		}
		if(contador==9) {
			validado =  true;
		}
		return validado;
	}
	
	
}
