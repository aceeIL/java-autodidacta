package ejercicios.tema8_Ejercicio5;

public class Contacto implements Comparable<Contacto>{

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
	
	//Modificar la clase Contacto para que dos objetos de tipo Contacto sean considerados 
	//iguales si tienen el mismo teléfono.
	@Override
	public boolean equals(Object obj) {
		Contacto c = (Contacto)obj;
		
		return this.tlfn.equals(c.getTlfn());
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.tlfn.hashCode();
	}


	@Override
	public int compareTo(Contacto o) {
		
		return this.nombre.compareTo(o.getNombre());
	}

	
	
	
	
}
