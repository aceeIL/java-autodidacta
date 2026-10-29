package ejercicios.tema5_SegundaParte;

import java.util.Scanner;

public class TestCuentaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaBancaria[] mCuentas = new CuentaBancaria[10];
		
		// Persona 1 (DNI: 12345678A) - Tiene una cuenta Corriente y otra de Ahorros
		CuentaBancaria c1 = new CuentaBancaria("ES2112345678901234567890", "54230135E", 1500.0f, CuentaBancaria.Tipo.CORRIENTE);
		CuentaBancaria c2 = new CuentaBancaria("ES2112345678901234567891", "54230135E", 8000.5f, CuentaBancaria.Tipo.AHORROS);

		// Persona 2 (DNI: 87654321B) - Tiene una cuenta Nómina y otra de Ahorros
		CuentaBancaria c3 = new CuentaBancaria("ES2198765432109876543210", "50219474D", 2300.0f, CuentaBancaria.Tipo.NOMINA);
		CuentaBancaria c4 = new CuentaBancaria("ES2198765432109876543211", "50219474D", 450.0f, CuentaBancaria.Tipo.AHORROS);

		// Persona 3 (DNI: 45678912C) - Tiene una cuenta Corriente
		CuentaBancaria c5 = new CuentaBancaria("ES2145678912345678912345", "46120892G", 50.0f, CuentaBancaria.Tipo.CORRIENTE);
	
		mCuentas[0] = c1;
		mCuentas[1] = c2;
		mCuentas[2] = c3;
		mCuentas[3] = c4;
		mCuentas[4] = c5;
		
		
		boolean salida = true;
		//Lector
		Scanner lector = new Scanner(System.in);
		
		do {
			System.out.println("\nBienvenido al gestor de cuentas bancarias.\n");
			
			System.out.println("a.	Mostrar por pantalla toda la información de las cuentas");
			System.out.println("b.	Realizar el traspaso entre varias cuentas");
			System.out.println("c.	Añadir saldo");
			System.out.println("d.	Retirar saldo");
			System.out.println("e.	Salir");
			
			String opcion = lector.nextLine();
			
			switch(opcion) {
				case "a":
					String titular = IO.readln("Introduzca el dni del titular de la cuenta/as que desea ver: ");
					
					for(int i=0;i<mCuentas.length;i++) {
						
						if(mCuentas[i] != null && mCuentas[i].getDni().equalsIgnoreCase(titular)) {
							System.out.println(mCuentas[i] +"\n");
						}
					}
					
					break;
				case "b":
					
					titular = IO.readln("Introduzca el dni del titular de la cuenta/as que desea ver: ");
					
					String iban1 = IO.readln("Introduzca el iban de la cuenta origen: ");
					String iban2 = IO.readln("Introduzca el iban de la cuenta destino: ");
					String cantidad = IO.readln("Introduzca la cantidad a transferir: ");
					
					float cantidadFinal = Float.parseFloat(cantidad);
					
					for(int i=0;i<mCuentas.length;i++) {
						if(mCuentas[i] != null && mCuentas[i].getDni().equalsIgnoreCase(titular) && mCuentas[i].getIban().equalsIgnoreCase(iban1)) {
							for(int j=0;j<mCuentas.length;j++) {
								if(mCuentas[j] != null && mCuentas[j].getDni().equalsIgnoreCase(titular) && mCuentas[j].getIban().equalsIgnoreCase(iban2)) {
									CuentaBancaria.realizarTraspaso(mCuentas[i],mCuentas[j],cantidadFinal);
								}
							}
						}
					}
					

					break;
				case "c":
					titular = IO.readln("Introduzca el dni del titular de la cuenta/as que desea ver: ");
					
					iban1 = IO.readln("Introduzca el iban donde ingresar el dinero: ");
					
					cantidad = IO.readln("Introduzca la cantidad a ingresar: ");
					cantidadFinal = Float.parseFloat(cantidad);
					
					for(int i=0;i<mCuentas.length;i++) {
						if(mCuentas[i] != null && mCuentas[i].getDni().equalsIgnoreCase(titular)  && mCuentas[i].getIban().equalsIgnoreCase(iban1)) {
							mCuentas[i].ingresarDinero(cantidadFinal);
						}
					}
					
					break;
				case "d":
					titular = IO.readln("Introduzca el dni del titular de la cuenta/as que desea ver: ");
					
					iban1 = IO.readln("Introduzca el iban donde retirar el dinero: ");
					
					cantidad = IO.readln("Introduzca la cantidad a retirar: ");
					cantidadFinal = Float.parseFloat(cantidad);
					
					for(int i=0;i<mCuentas.length;i++) {
						if(mCuentas[i] != null && mCuentas[i].getDni().equalsIgnoreCase(titular)  && mCuentas[i].getIban().equalsIgnoreCase(iban1)) {
							mCuentas[i].retirarDinero(cantidadFinal);
						}
					}
					
					break;
				case "e":
					System.out.println("Hasta otra!");
					salida = false;
					break;
				
				default:
					System.out.println("Opcion no valida");
					break;
			}
		}
		while(salida);
		
	}

}
