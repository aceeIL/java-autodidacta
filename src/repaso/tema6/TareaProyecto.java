package repaso.tema6;

import java.time.LocalDate;

// Usamos 'extends' para heredar de Tarea
public class TareaProyecto extends Tarea {

    // 1. Atributo propio y exclusivo de la subclase
    private String nombreProyecto;
    private LocalDate fechaLimiteProyecto;

    public TareaProyecto() {
    	//Llamar al constructor de la clase base
    	super();
    }
    public TareaProyecto(String nombreProyecto,String titulo,LocalDate fechaLimite ,LocalDate fechaLimiteProyecto,String descripcion,boolean importante) {
    	super(titulo,descripcion,fechaLimite,importante);
    	this.nombreProyecto = nombreProyecto;
    	this.fechaLimiteProyecto = fechaLimiteProyecto;
    }
    
    //Metodos de acceso
	public String getNombreProyecto() {
		return nombreProyecto;
	}
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	public LocalDate getFechaLimiteProyecto() {
		return fechaLimiteProyecto;
	}
	public void setFechaLimiteProyecto(LocalDate fechaLimiteProyecto) {
		this.fechaLimiteProyecto = fechaLimiteProyecto;
	}
    
	//Metodos de la clase tarea
	@Override
	public void setFechaLimite(int año, int mes, int dia) {
		// TODO Auto-generated method stub
		if(super.getFechaLimite() != null && super.getFechaLimite().isAfter(fechaLimiteProyecto)) {
			mes = mes + 2;
			dia = dia +10;
			super.setFechaLimite(año, mes, dia);
		}
		else {
			dia = dia + 3;
			super.setFechaLimite(año, mes, dia);
		}
	}
	
	//toString
	@Override
	public String toString() {
		String mensaje = super.toString();
		mensaje += " --- "+"Fecha limite de proyecto: " +this.fechaLimiteProyecto + " --- " + "Nombre del proyecto: " +this.nombreProyecto;
		return mensaje;
	}
	
	
    
}