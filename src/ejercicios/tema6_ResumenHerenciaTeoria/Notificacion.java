package ejercicios.tema6_ResumenHerenciaTeoria;

public abstract class Notificacion  {

	//Atributos
	private String destinatario;
	private String mensaje;
	
	//Constructores
	
	public Notificacion(String destinatario, String mensaje) {
		super();
		this.destinatario = destinatario;
		this.mensaje = mensaje;
	}
	//Metodos de acceso
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "destinatario: " + destinatario + "\n" +"mensaje: " + mensaje;
	}

	//Metodo enviar
	public abstract void enviar();

	
}
