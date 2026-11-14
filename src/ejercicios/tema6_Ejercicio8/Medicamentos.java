package ejercicios.tema6_Ejercicio8;

import java.time.LocalDate;

public class Medicamentos extends Producto implements Descuentable{

	//atrb
	private boolean prescripcion;
	private String formaTomarMedicamento;
	private float porcentajeSeguridadSocial;
	private LocalDate fechaCaducidad;
	

	
	//constructor
	public Medicamentos(String nombre, String fabricante, float precio, boolean prescripcion,
			String formaTomarMedicamento, float porcentajeSeguridadSocial, LocalDate fechaCaducidad) {
		
		super(nombre, fabricante, precio);
		
		this.prescripcion = prescripcion;
		this.formaTomarMedicamento = formaTomarMedicamento;
		this.porcentajeSeguridadSocial = porcentajeSeguridadSocial;
		this.fechaCaducidad = fechaCaducidad;
	}

	//Metodos de interfaz
	@Override
	public float calcularPrecioFinal() {
	    float precioConIva = getPrecio() + (getPrecio() * 0.05f);
	    float descuentoSS = precioConIva * (getPorcentajeSeguridadSocial() / 100.0f);
	    return precioConIva - descuentoSS;
	}
	@Override
	public float aplicarDescuento() {
		if(getFechaCaducidad().isBefore(LocalDate.now())) {
			float precioFinal = calcularPrecioFinal() * 0.70f;
			return precioFinal;
		}
		return calcularPrecioFinal();
	}
	
	
	//sett y getters
	public boolean isPrescripcion() {
		return prescripcion;
	}



	public void setPrescripcion(boolean prescripcion) {
		this.prescripcion = prescripcion;
	}



	public String getFormaTomarMedicamento() {
		return formaTomarMedicamento;
	}



	public void setFormaTomarMedicamento(String formaTomarMedicamento) {
		this.formaTomarMedicamento = formaTomarMedicamento;
	}



	public float getPorcentajeSeguridadSocial() {
		return porcentajeSeguridadSocial;
	}



	public void setPorcentajeSeguridadSocial(float porcentajeSeguridadSocial) {
		this.porcentajeSeguridadSocial = porcentajeSeguridadSocial;
	}



	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}



	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	
	

}
