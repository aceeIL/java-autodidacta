package repaso.tema6;

import java.time.LocalDate;

public class Tarea {

	//Atributos
	private String titulo;
	private String descripcion;
	private LocalDate fechaLimite;
	private boolean realizada;
	private boolean importante;
	
	//Constructor
	public Tarea() {
		this.titulo = null;
		this.descripcion = null;
		this.fechaLimite = null;
		this.realizada = false;
		this.importante = false;
	}

	public Tarea(String titulo, String descripcion, LocalDate fechaLimite, boolean importante) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaLimite = fechaLimite;
		this.importante = importante;
	}
	//ToString
	@Override
	public String toString() {
		return "titulo: " + titulo + " --- " +"descripcion: " + descripcion + " --- " +"fechaLimite: " + fechaLimite
				+ " --- " +"realizada: " + realizada + " --- " +"importante: " + importante;
	}

	//Metodos de acceso
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(int año, int mes, int dia) {
		this.fechaLimite = LocalDate.of(año, mes, dia);
	}

	public boolean isRealizada() {
		return realizada;
	}

	public void setRealizada(boolean realizada) {
		this.realizada = realizada;
	}

	public boolean isImportante() {
		return importante;
	}

	public void setImportante(boolean importante) {
		this.importante = importante;
	}
	
	
}
