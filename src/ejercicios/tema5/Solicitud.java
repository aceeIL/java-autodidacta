package ejercicios.tema5;

import java.time.LocalDate;

public class Solicitud {
	//Atributos
	private String codigo;
	private String titulo;
	private LocalDate fecha;
	private String estado;
	//constructor
	public Solicitud() {
		codigo = null;
		titulo = null;
		fecha = LocalDate.now();
		estado = "Pendiente";
		
	}
	public Solicitud(String codigo,String titulo,LocalDate fecha,String estado) {
		this.codigo = codigo;
		
		this.titulo = titulo;
		this.estado = estado;
		this.fecha = fecha;
	}
	//Metodos acceso
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		if(codigo.length()<=4 && codigo.length()>0) {
			for(int i=0;i<codigo.length();i++) {
				if(!Character.isLetter(codigo.charAt(i)) && !Character.isDigit(codigo.charAt(i))) {
					return;
				}
			}
		}
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
//	public void setTitulo(String titulo) {
//		this.titulo = titulo;
//	}
	public LocalDate getFecha() {
		return fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		if (estado.equals("Pendiente") || estado.equals("Proceso") || 
			estado.equals("Admitida") || estado.equals("Rechazada")) {
			this.estado = estado;
		}
	}
	//Metodos
	public void setFecha(int año, int mes, int dia) {
		this.fecha = LocalDate.of(año, mes, dia);
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "codigo: " + codigo + " --- "+ "titulo: " + titulo + " --- "+ "fecha: " + fecha
				+ " --- "+ "estado: " + estado;
	}
	
	
	
	
	
}
