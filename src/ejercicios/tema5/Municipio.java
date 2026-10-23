package ejercicios.tema5;

public class Municipio {

	// Atributos
	private String nombre;
	private String codigoProvincia;
	private String codigoMunicipio;
	private String DC;

	// Constructor
	public Municipio() {
		this.nombre = null;
		this.codigoMunicipio = null;
		this.codigoProvincia = null;
		this.DC = calcularDC();
	}

	public Municipio(String nombre,int codigoProvincia,int codigoMunicipio){
		this.nombre = nombre;
		
		setCodigoMunicipio(codigoMunicipio);
		setCodigoProvincia(codigoProvincia);
		
		
		this.DC = calcularDC();
	}

	// Getters and setters / Metodos de acceso
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public String getCodigoProvincia() {
		return codigoProvincia;
	}

	public String getDC() {
		return DC;
	}

	// Metodos
	public void setCodigoMunicipio(int codigoMunicipio) {
		String CM = String.valueOf(codigoMunicipio);

		if (CM.length() > 0 && CM.length() < 4) {
			if (codigoMunicipio >= 1 && codigoMunicipio <= 999) {
				this.codigoMunicipio = String.format("%03d", codigoMunicipio);
				
			}
		}
	}

	public void setCodigoProvincia(int codigoProvincia) {
		String CP = String.valueOf(codigoProvincia);
		
		if (CP.length() > 0 && CP.length() < 4) {
			if (codigoProvincia >= 1 && codigoProvincia <= 999) {
				this.codigoProvincia = String.format("%02d", codigoProvincia);
				
			}
		}
	}

	// Metodos aux
	private String calcularDC() {
		int[][] magicos = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 0, 3, 8, 2, 7, 4, 1, 5, 9, 6 },
				{ 0, 2, 4, 6, 8, 1, 3, 5, 7, 9 } };
		String codigo = codigoMunicipio + codigoProvincia;
		byte[] bytes = codigo.getBytes();

		int sum = 0, i = 0;
		for (Byte v : bytes) {
			sum += magicos[2 - i % 3][v - 48];
			i++;
		}

		int res = sum == 0 ? 0 : 10 - sum % 10;
		return DC = Integer.toString(res);
	}
	
	// ToString
	@Override
	public String toString() {
		return "nombre: " + nombre + " --- " +"codigoProvincia: " + codigoProvincia + " --- "+ "codigoMunicipio: "
				+ codigoMunicipio + " --- " +"DC: " + DC;
	}
	

}
