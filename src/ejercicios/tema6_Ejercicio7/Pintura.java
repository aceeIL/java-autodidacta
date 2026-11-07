package ejercicios.tema6_Ejercicio7;

import java.time.LocalDate;

public class Pintura extends Servicio {

	//Atrb
	private double superficie; // Es la superficie a pintar (metros cuadrados). 
	private double precioPintura; //  Es el precio de un litro de pintura.
	
	//constr
	public Pintura(String trabajador, LocalDate fechaInicio, String cliente,double superficie,double precioPintura) {
		super(trabajador, fechaInicio, cliente);
		// TODO Auto-generated constructor stub
		this.superficie = superficie;
		this.precioPintura = precioPintura;
	}

	
	
	//M accceso
	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public double getPrecioPintura() {
		return precioPintura;
	}

	public void setPrecioPintura(double precioPintura) {
		this.precioPintura = precioPintura;
	}

	
	//Metodos sobrescritos de Servicio
	@Override
	public double costeMaterial() {
		//Coste_material = (Superficie / 7.8) * PrecioPintura;
		double costeMaterial = (this.superficie / 7.8)*this.precioPintura;
		double costeRedondeado = Math.round(costeMaterial * 100.0) / 100.0;
		return costeRedondeado;
	}



	@Override
	public double costeManoObra() {
		// Coste_mano_obra = (Superficie / 10) * 9.5;
		double costeManoObra = (this.superficie/10)*9.5;
		double costeRedondeado = Math.round(costeManoObra * 100.0) / 100.0;
		return costeRedondeado;
	}



	@Override
	public double costeTotal() {
		//Coste_total = coste_material + coste_mano_obra;
		double costeTotal = costeMaterial() + costeManoObra();
		if(this.superficie>=50) {
			costeTotal += costeTotal * 1.15;
		}
		double costeRedondeado = Math.round(costeTotal * 100.0) / 100.0;
		return costeRedondeado;
	}
	
	@Override
	public String detalleServicio() {
		String mensaje = "\nTRABAJO DE PINTURA" + "\n";
		mensaje += "Cliente: "+ this.getCliente() + "\n";
		mensaje += "Fecha de inicio: "+this.getFechaInicio() + "\n";
		mensaje += "-  - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - -  " + "\n";
		mensaje += "Pintor: "+this.getTrabajador()+ "\n";
		mensaje += "Coste Material: "+this.costeMaterial()+ "€" + "\n";
		mensaje += "Coste de mano de obra: "+this.costeManoObra()+ "€" + "\n";
		mensaje += "Coste Adicional: "+ (this.superficie>=50 ? "15%" : "0%") + "\n";
		mensaje += "TOTAL: "+ this.costeTotal()+ "€" + "\n";
		mensaje += "-  - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - -  " + "\n";


		return mensaje;
	}



}
