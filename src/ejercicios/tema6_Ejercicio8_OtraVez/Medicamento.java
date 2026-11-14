package ejercicios.tema6_Ejercicio8_OtraVez;

import java.time.LocalDate;

public class Medicamento extends Producto implements Descuentable{


	private boolean prescipcion;
	private String formaDeTomar;
	private float porcentajeSeguridadSocial;
	private LocalDate fechaCaducidad;
	
	//Constructor
	public Medicamento(String nombre, String fabricante, float precio,String formaDeTomar,LocalDate fechaCaducidad,boolean prescipcion, float porcentajeSeguridadSocial) {
		super(nombre, fabricante, precio);
		// TODO Auto-generated constructor stub
		this.prescipcion = prescipcion;
		this.formaDeTomar = formaDeTomar;
		this.porcentajeSeguridadSocial = porcentajeSeguridadSocial;
		this.fechaCaducidad = fechaCaducidad;
		setCodigo();
	}

	
	//Setters and getters
	public boolean getPrescipcion() {
		return prescipcion;
	}

	public void setPrescipcion(boolean prescipcion) {
		this.prescipcion = prescipcion;
	}

	public String getFormaDeTomar() {
		return formaDeTomar;
	}

	public void setFormaDeTomar(String formaDeTomar) {
		this.formaDeTomar = formaDeTomar;
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
	
	//Programo el metodo calcularPrecioFinal
	@Override
	public float CalcularPrecioFinal() {
		float IVA = 0.05f;
		float precio = getPrecio();
		
		float precioConIVA = precio + (precio * IVA);
		float precioSS = precioConIVA * (getPorcentajeSeguridadSocial() / 100f);
		
		float precioFinal = precioConIVA - precioSS;
		
		float precioRedondeado = Math.round(precioFinal * 100.0f) /100.0f;
		
		return precioRedondeado;
	}
	
	
	//Programo el metodo de la interfaz descuentable
	//50% de descuento si esta caducado
	@Override
	public float aplicarDescuento() {
		float precio = getPrecio();
		if(getFechaCaducidad().isBefore(LocalDate.now())) {
			float nuevoPrecio = precio - (precio * 0.50f);
			setPrecio(nuevoPrecio);
		}
		return CalcularPrecioFinal();
	}
	
	//ToString
	@Override
	public String toString() {
		String mensaje = super.toString();
		mensaje += "****** Detalles del Medicamento: ******"+"\n";
		mensaje += "Forma de tomarlo: ... "+this.formaDeTomar+"\n";
		mensaje += "Fecha de caducidad: ... "+this.fechaCaducidad+"\n";
		mensaje += "Prescripcion medica: ... "+this.prescipcion+"\n";
		mensaje += getFechaCaducidad().isBefore(LocalDate.now()) ? "Precio final: ..."+this.aplicarDescuento()+" €"+"\n" : "Precio final: ..."+this.CalcularPrecioFinal()+" €"+"\n"; 
		mensaje += "******************************************";
		return mensaje;
	}
	
}
