package ejercicios.tema6_Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Operarios extends EmpleadosPYME {

	
	//Atributos
	private String seguroAccidente;
	private String resCivil;
	
	//Constructores
	public Operarios(String dni, LocalDate fechaNacimiento, LocalDate fechaContratacion, String nombre,
			String seguroAccidente, String resCivil) {
		super(dni, fechaNacimiento, fechaContratacion, nombre);
		
		setSeguroAccidente(seguroAccidente);
		setResCivil(resCivil);
	}
	
	
	
	//toString
	@Override
	public String toString() {
		String mensaje = super.toString();
		mensaje += " | "+ "seguroAccidente: " + seguroAccidente + " | " + "responsabilidadCivil: "+ resCivil;
		return mensaje;
	}
	
	//Metodos de acceso
	public String getSeguroAccidente() {
		return seguroAccidente;
	}

	public void setSeguroAccidente(String seguroAccidente) {
		if(validarSeguroAccidente(seguroAccidente)) {
			this.seguroAccidente = seguroAccidente;
		}
	}

	public String getCivil() {
		return resCivil;
	}

	public void setResCivil(String resCivil) {
		if(validarResCivil(resCivil)) {
			this.resCivil = resCivil;
		}
	}
	
	
	//Metodos privados
	
	private boolean validarSeguroAccidente(String seguroAccidente) {
		boolean validado = false;
		boolean valPrefijo = false;
		boolean valAño = false;
		boolean valNumero = false;
		
		//Prefijo del seguro + año de contratación + número correlativo
		//ACC-2026-89541
		int PrimerGuion = seguroAccidente.indexOf("-");
		int UltimoGuion = seguroAccidente.lastIndexOf("-");
		
		//Validar Prefijo: solo puede ponerse "ACC"
		if(seguroAccidente.substring(0,PrimerGuion).equals("ACC")) {
			valPrefijo = true;
		}
		else {
			valPrefijo = false;
		}
		
		//Validar año de contratación:
		int añoSeguro = Integer.parseInt(seguroAccidente.substring(PrimerGuion+1,UltimoGuion));
		
		if(añoSeguro == getFechaContratacion().getYear()) {
			valAño = true;
		}
		else {
			valAño = false;
		}
		
		//Validar número correlativo
		int contador = 0;
		for(int i=UltimoGuion+1;i<seguroAccidente.length();i++) {
			if(Character.isDigit(seguroAccidente.charAt(i))) {
				contador++;
			}
		}
		if(contador == 5) {
			valNumero = true;
		}
		
		else valNumero = false;
		
		if(valPrefijo && valNumero && valAño && seguroAccidente.length()==14) {
			validado = true;
		}
		return validado;
	}
	
	private boolean validarResCivil(String resCivil) {
		boolean validado = false;
		boolean valPrefijo = false;
		boolean valNumero = false;
		boolean valLetra = false;
		//Prefijo + numero + letra de control
		
		//RC-7741258-X
		int PrimerGuion = resCivil.indexOf("-");
		int UltimoGuion = resCivil.lastIndexOf("-");
		
		//Validar Prefijo: solo puede ponerse "RC"
		if(resCivil.substring(0,PrimerGuion).equals("RC")) {
			valPrefijo = true;
		}
		else {
			valPrefijo = false;
		}
		
		//Validar numero: 7 digitos despues del primer guion
		int contador = 0;
		for(int i=PrimerGuion+1;i<UltimoGuion;i++) {
			if(Character.isDigit(resCivil.charAt(i))) {
				contador ++; 
			}
			else {
				break;
			}
		}
		
		if(contador == 7) {
			valNumero = true;
		}
		else {
			valNumero = false;
		}
		
		//Validar letra de control:
		if(Character.isLetter(resCivil.charAt(UltimoGuion+1))) {
			resCivil.toUpperCase().charAt(UltimoGuion+1);
			valLetra = true;
		}
		else {
			valLetra = false;
		}
		
		if(valPrefijo && valLetra && valNumero && resCivil.length() == 12) {
			validado = true;
		}
		
		return validado;
	}
	
	
}
