package ejercicios.tema5_SegundaParte;

public class CuentaBancaria {

	//Atributos
	private String iban;
	private String dni;
	private float saldo;
	private Tipo tipoCuenta;
	
	public enum Tipo {
		AHORROS, NOMINA, CORRIENTE
	}
	
	//Constructor
	public CuentaBancaria() {
		this.iban = null;
		this.dni = null;
		this.saldo = 10000;
		this.tipoCuenta = null;
	}
	
	public CuentaBancaria(String iban, String dni, float saldo, Tipo tipoCuenta) {
		this.iban = iban;
		this.dni = validarDni(dni);
		this.saldo = saldo;
		this.tipoCuenta = tipoCuenta;
	}
	public CuentaBancaria(String dni, float saldo, Tipo tipoCuenta) {
		this.dni = validarDni(dni);
		this.saldo = saldo;
		this.tipoCuenta = tipoCuenta;
	}
	
	//Metodos Acceso
	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = validarDni(dni);
		
	}

	public Tipo getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(Tipo tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public float getSaldo() {
		return saldo;
	}
	
	//Metodos
	public float ingresarDinero(float dinero) {
		return this.saldo += dinero;
	}
	public float retirarDinero(float dinero) {
		if(this.tipoCuenta == Tipo.CORRIENTE) {
			if(dinero <=5000 && (this.saldo - dinero) >= -2000) {
				 this.saldo = this.saldo - dinero;
			}
		}
		
		return this.saldo;

	}
	public static void realizarTraspaso(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, float cantidad) {
	    if(cuentaOrigen.getDni().equals(cuentaDestino.getDni())) {
	        // 1. Guardamos el saldo que tenía el origen antes de intentar retirar
	        float saldoAntes = cuentaOrigen.getSaldo();
	        
	        // 2. Intentamos retirar el dinero
	        cuentaOrigen.retirarDinero(cantidad);
	        
	        // 3. Comprobamos si el saldo realmente disminuyó
	        if (cuentaOrigen.getSaldo() < saldoAntes) {
	            // Solo si disminuyó, se lo ingresamos al destino
	            cuentaDestino.ingresarDinero(cantidad);
	        } else {
	            System.out.println("Traspaso cancelado: La cuenta de origen no cumplió las condiciones de retirada.");
	        }
	    }
	}

	//Metodos aux
	private String validarDni(String dni) {
		if(dni == null || dni.length() != 9) {
			return null;
		}
		for(int i=0;i<dni.length()-1;i++) {
			if(!Character.isDigit(dni.charAt(i))) {
				return null;
			}
		}
		int IndiceletraDNI = dni.length()-1;
		char letraDni = dni.charAt(IndiceletraDNI);
		
		if(!Character.isLetter(letraDni)) {
			return null;
		}
		//Paso el DNI a int y calculo el resto
		String cadDigitosDNI = "";
		for(int i=0;i<dni.length();i++) {
			if(Character.isDigit(dni.charAt(i))){
				cadDigitosDNI += dni.charAt(i);
			}
		}
		
		int digitosDNI = Integer.parseInt(cadDigitosDNI);
		int restoDNI = digitosDNI%23;
			
		//Hago una lista con las letras en los indices correctos
		char[] listaLetrasDNI= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		if(letraDni != listaLetrasDNI[restoDNI]) {
			return null;
		}
		
		
		
		
		return dni;
		
	}
	//ToString
	@Override
	public String toString() {
		return "iban: " + iban + " --- " +"dni: " + dni + " --- " +"saldo: " + saldo + " --- " 
				+"tipoCuenta: " + tipoCuenta;
	}
	
	
	
}
