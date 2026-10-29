package ejercicios.tema5_SegundaParte;

public class Cliente {
	// Atributos de las características solicitadas
    private String razonSocial;      
    private String nif;              
    private String direccionFacturacion;
    private String email;
    private CodigoPago formaPago;

    public enum CodigoPago { C, T, B, P }
    
    //constructor
    public Cliente() {
    	this.razonSocial = null;
    	this.nif = null;
    	this.direccionFacturacion = null;
    	this.email = null;
    	this.formaPago = CodigoPago.C;
    }
	public Cliente(String razonSocial, String nif, String direccionFacturacion, String email, CodigoPago formaPago) {
		this.razonSocial = razonSocial;
		this.nif = nif;
		this.direccionFacturacion = direccionFacturacion;
		this.email = email;
		this.formaPago = formaPago;
	}
	
	//Metodos de acceso
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getDireccionFacturacion() {
		return direccionFacturacion;
	}
	public void setDireccionFacturacion(String direccionFacturacion) {
		this.direccionFacturacion = direccionFacturacion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CodigoPago getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(CodigoPago formaPago) {
		this.formaPago = formaPago;
	}
	
	//ToString
	@Override
	public String toString() {
		return "razonSocial: " + razonSocial + " --- " +"nif: " + nif + " --- " +"direccionFacturacionL: " + direccionFacturacion
				+ " --- " +"email: " + email + ", formaPago=" + formaPago;
	}
	
	
    

}
