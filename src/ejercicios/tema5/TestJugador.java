package ejercicios.tema5;

public class TestJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jugador j1 = new Jugador();
		Jugador j2 = new Jugador("A7","Pepe");
		j2.actualizarPuntos(10);
		
		System.out.println(j2);
		
	}

}
