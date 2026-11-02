package ejercicios.tema6_ResumenHerenciaTeoria;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Notificacion noti1 = new EmailNotificacion("profesor","La clase de ayer fue muy divertida","profesor@gmail.com","alumno@gmail.com","Clase de ayer");
		((EmailNotificacion)noti1).setEmailDestino("profesor@gmail.com");
		((EmailNotificacion)noti1).setEmailOrigen("alumno@gmail.com");
		((EmailNotificacion)noti1).setAsunto("Clase del dia de ayer");
		noti1.setDestinatario("profe");
		noti1.setMensaje("Me encanto la clase de ayer, fue expectacular");

		noti1.enviar();
		
		
		Notificacion noti2 = new SmsNotificacion("profesora","La clase de ayer me gusto mucho","Clase de ayer","34401123");
		noti2.setDestinatario("profesora");
		noti2.setMensaje("Me encanto la clase de ayer, fue expectacular");
		((SmsNotificacion)noti2).setAsunto("Clase de ayer");
		((SmsNotificacion)noti2).setTlfnDestino("644022791");
		
		noti2.enviar();
		
		
		Notificacion noti3 = new PushNotificacion("profe","La clase de ayer fue muy divertida");
		noti3.setDestinatario("profesor");
		noti3.setMensaje("Me encanto la clase de ayer, fue expectacular");
		
		noti3.enviar();
		
	}

}
