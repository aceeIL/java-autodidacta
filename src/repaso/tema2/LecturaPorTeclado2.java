package repaso.tema2;

import javax.swing.JOptionPane;

public class LecturaPorTeclado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			float salario = Float.parseFloat(JOptionPane.showInputDialog("Introduzca su salario: "));
			System.out.println(salario);

		}
		catch(Exception e) {
			System.out.println("Ha ocurrido un error, intentalo de nuevo.");
		}
		
		final int constante = 12;
		
		
		
	}

}
