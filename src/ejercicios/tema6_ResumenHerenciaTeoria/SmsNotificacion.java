package ejercicios.tema6_ResumenHerenciaTeoria;

public class SmsNotificacion extends Notificacion {
	
	//Atributos
	private String tlfnDestino;
	private String asunto;
	
	//Constructor
	public SmsNotificacion(String destinatario, String mensaje,String asunto, String tlfnDestino) {
		super(destinatario, mensaje);
		// TODO Auto-generated constructor stub
		this.asunto = asunto;
		this.tlfnDestino = tlfnDestino;
	}
	
	
	//Metodo abstracto enviar
	//Metodo abstracto enviar
		@Override
		 public void enviar() {
			if(tlfnDestino != null && asunto != null) {
		        System.out.println("------------------------------------------");
		        System.out.println("ENVIANDO SMS a: " + tlfnDestino);
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
		String mensaje = "Notificacion via sms: " +"telefono de destino: " +tlfnDestino + " asunto: " +asunto;
		mensaje += " " +super.toString();
		return mensaje;
	}
	
	//Metodos de acceso
	public String getTlfnDestino() {
		return tlfnDestino;
	}


	public void setTlfnDestino(String tlfnDestino) {
		if(validarTlfn(tlfnDestino) == true) {
			this.tlfnDestino = tlfnDestino;
		}
	}

	public String getAsunto() {
		return asunto;
	}


	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	//Metodo privado
	private boolean validarTlfn(String tlfn) {
		int contador = 0;
		boolean validado = false;
		
		for(int i = 0;i<tlfnDestino.length();i++) {
			if(Character.isDigit(tlfnDestino.charAt(i))) {
				contador ++;
			}
		
			
		}
		if(contador ==9) {
			validado = true;
		}
		else {
			validado = false;

		}
		
		return validado;
	
	}
	
}
