package ejercicios.tema6_Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Administrativos extends EmpleadosPYME {

	//Atributos
	private String codigo;
	
	//Constructor
	public Administrativos(String dni, LocalDate fechaNacimiento, LocalDate fechaContratacion, String nombre,
			String codigo) {
		super(dni, fechaNacimiento, fechaContratacion, nombre);
		
		setCodigo(codigo);
	}
	
	//Metodos de acceso
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		if(validarCodigo(codigo)) {
			codigo = codigo.toUpperCase();
			this.codigo = codigo;
		}
	}
	
	//Override de ActualizarSalario
	@Override
	public void ActualizarSalario() {
		//salario = salarioBase + (años de antiguedad/3)*salarioBase*0,09

		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(getFechaContratacion(), fechaActual);
		
		int antiguedad = periodo.getYears();
		
		setSalario((float) (getSalarioBase() + (antiguedad/3)*getSalarioBase()*0.09));
		
	}
	
	//toString
	@Override
	public String toString() {
		String mensaje = super.toString();
		mensaje += " | "+ "codigo: " + codigo;
		return mensaje;
	}
	
	//Metodo privado
	
	private boolean validarCodigo(String codigo) {
		boolean validado = false;
		
		if(codigo.length()==2) {
			if(Character.isDigit(codigo.charAt(0))) {
				if(!Character.isDigit(codigo.charAt(1))) {
					validado = true;
				}
			}
		}
		
		return validado;
	}
	
}
