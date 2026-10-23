package repaso.tema5;

import java.util.Set;

public class PruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cuenta c = new Cuenta();
		c.setDni("54230125E");
		Cuenta c2 = new Cuenta("123124","E789654GT3424");
		Cuenta c3 = new Cuenta("23432423","E789654GT3424",3000);
		
		//Matriz de Cuentas
		Cuenta[] matrizCuentas = new Cuenta[10];
		matrizCuentas[0] = c;
		matrizCuentas[1] = c2;
		matrizCuentas[2] = c3;
		matrizCuentas[3] = new Cuenta("54230135E","RTY576342784HD",400.50f);
		
		//Mostrar nº cuenta
		for(Cuenta cuenta : matrizCuentas) {
			if(cuenta!=null) {
				System.out.println(cuenta.getNumeroCuenta());
			}
		}
		
		System.out.println();
		System.out.println();
		
		//Mostrar el primer digito del dni
		for(Cuenta cuenta : matrizCuentas) {
			if(cuenta!=null) {
				if(cuenta.getDni() != null) {
					System.out.println("Primer numero dni: "+cuenta.getDni().charAt(0));
				}
			}
		
		}
		
		c2.setSaldo(9000);
		c.setNumeroCuenta("12324EDHJKFH23423523");
		c.setSaldo(650.0f);
		c.interes = 2;
		
		
	}

}
