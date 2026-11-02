package ejercicios.tema6_ResumenHerenciaTeoria;

public class PushNotificacion extends Notificacion {

	
	//Contructor

	public PushNotificacion(String destinatario, String mensaje) {
		super(destinatario, mensaje);
		
	}

	//Metodo abstracto enviar
	@Override
	public void enviar() {
		
	        System.out.println("------------------------------------------");
	        System.out.println("ENVIANDO push...");
	        System.out.println("PARA: " + getDestinatario());
	        System.out.println("CONTENIDO: " + getMensaje().substring(0, Math.min(getMensaje().length(), 50)) + "...");
		
		
	}
	
	
}
