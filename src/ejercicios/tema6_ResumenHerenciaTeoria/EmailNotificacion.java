package ejercicios.tema6_ResumenHerenciaTeoria;

public class EmailNotificacion extends Notificacion{

	//Atributos
	private String emailDestino;
	private String emailOrigen;
	private String asunto;
	
	
	//Constructor
	public EmailNotificacion(String destinatario,String mensaje,String emailDestino,String emailOrigen,String asunto) {
		super(destinatario,mensaje);
		this.emailDestino = emailDestino;
		this.emailOrigen = emailOrigen;
		this.asunto = asunto;
	}
	
	//Metodo abstracto enviar
	@Override
	 public void enviar() {
		if(emailDestino != null && emailOrigen != null && asunto!= null) {
	        System.out.println("------------------------------------------");
	        System.out.println("ENVIANDO EMAIL a: " + emailDestino + " desde: " + emailOrigen);
	        System.out.println("ASUNTO: " + asunto);
	        System.out.println("PARA: " + getDestinatario());
	        System.out.println("CONTENIDO: " + getMensaje().substring(0, Math.min(getMensaje().length(), 50)) + "...");
		}
		else {
			System.out.println("No se ha podido enviar el mensaje, revisa que esten todos los datos cubiertos");
		}
	}


	//ToString
	@Override
	public String toString() {
		String mensaje = "Notificacion via email: " +"de: " +emailOrigen + "  a: " +emailDestino + " asunto: " +asunto;
		mensaje += " " +super.toString();
		return mensaje;
	}
	
	
	
	
	
	//Metodos de acceso
	public String getEmailDestino() {
		return emailDestino;
	}

	public void setEmailDestino(String emailDestino) {
		this.emailDestino = emailDestino;
	}

	public String getEmailOrigen() {
		return emailOrigen;
	}

	public void setEmailOrigen(String emailOrigen) {
		this.emailOrigen = emailOrigen;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	
	
	
}
