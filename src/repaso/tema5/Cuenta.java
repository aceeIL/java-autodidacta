package repaso.tema5;

public class Cuenta {

	//Atributos
	private String dniTitular;
	private String numeroCuenta;
	private float saldo;
	int interes;
	
	//Constructores
	public Cuenta() {
		saldo = 0.0f;
		numeroCuenta = null;
		dniTitular = null;
		interes =0;
	}
	public Cuenta(String dniTitular, String numeroCuenta) {
		setDni(dniTitular);
		this.numeroCuenta = numeroCuenta;
	}
	public Cuenta(String dniTitular, String numeroCuenta, float saldo) {
		setDni(dniTitular);
		this.numeroCuenta = numeroCuenta;
		setSaldo(saldo);
	}
	
	
	//getters and setters
	
	//dni
	public String getDni() {
		return this.dniTitular;
	}
	public void setDni(String dni) {
		if(validarDNI(dni)) {
			this.dniTitular = dni;
		}
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		if(saldo >0) {
			this.saldo = saldo;
		}
	}
	
	
	
	//Otros metodos
	
	//Metodos aux
	private boolean validarDNI(String dni) {
	    // 1. Validar que no sea nulo y que tenga exactamente 9 caracteres
	    if (dni == null || dni.length() != 9) {
	        return false;
	    }

	    // 2. Comprobar que los primeros 8 caracteres sean dígitos
	    for (int i = 0; i < dni.length()-1; i++) {
	        if (!Character.isDigit(dni.charAt(i))) {
	            return false; // Si uno no es número, el DNI no es válido
	        }
	    }

	    // 3. Calcular y validar la letra correspondiente (posición 8)
	    char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z',
	                     'S','Q','V','H','L','C','K','E'};
	                     
	    String dniNumerico = dni.substring(0, 8);
	    int dniNumero = Integer.parseInt(dniNumerico);
	    int resto = dniNumero % 23;
	    char letraCorrecta = letras[resto];

	    // Comparamos la letra del DNI (forzando mayúscula) con la calculada
	    return Character.toUpperCase(dni.charAt(8)) == letraCorrecta;
	    
	} 
	
	//ToString
	@Override
	public String toString() {
		return "Cuenta dniTitular=" + dniTitular + "\n"+"numeroCuenta=" + numeroCuenta + "\n"+"saldo=" + saldo + "\n"+"interes="
				+ interes;
	}
}
