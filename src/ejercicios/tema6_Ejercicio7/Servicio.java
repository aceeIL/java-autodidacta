package ejercicios.tema6_Ejercicio7;

import java.time.LocalDate;

public class Servicio {

	//Atrb
	private String trabajador;
	private LocalDate fechaInicio;
	private String cliente;

	
	//Constructor
	public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
		super();
		this.trabajador = trabajador;
		this.fechaInicio = fechaInicio;
		this.cliente = cliente;
	}
	
	//M Acceso
	public String getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(String trabajador) {
		this.trabajador = trabajador;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "trabajador: " + trabajador + " | " +"fechaInicio: " + fechaInicio + " | " +"cliente:" + cliente;
	}
	
	//Metodos publicos sobre servicio
	
	public double costeMaterial() {
		
		return 0;
	}
	public double costeManoObra() {
		
		return 0;
	}
	
	public double costeTotal() {
		
		return 0;
	}
	public String detalleServicio() {
		
		return null;
	}
	
	
	

	


	
	
	
}
