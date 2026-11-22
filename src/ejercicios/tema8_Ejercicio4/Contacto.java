package ejercicios.tema8_Ejercicio4;

public class Contacto {

	private String nombre;
	private String tlfn;
	private String correo;
	
	
	public Contacto(String nombre, String tlfn, String correo) {
		super();
		this.nombre = nombre;
		this.tlfn = tlfn;
		this.correo = correo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTlfn() {
		return tlfn;
	}


	public void setTlfn(String tlfn) {
		this.tlfn = tlfn;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@Override
	public String toString() {
		return "nombre: " + nombre + ", tlfn: " + tlfn + ", correo: " + correo;
	}
	
	
	
	
	
}
