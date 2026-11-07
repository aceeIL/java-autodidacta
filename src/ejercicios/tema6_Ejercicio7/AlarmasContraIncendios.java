package ejercicios.tema6_Ejercicio7;

import java.time.LocalDate;

public class AlarmasContraIncendios extends Servicio{

	//atrb
	private int numeroAlarmas;
	private LocalDate fechaRevision;
	
	//Const
	public AlarmasContraIncendios(String trabajador, LocalDate fechaInicio, String cliente,int año,int mes,int dia,int numeroAlarmas) {
		super(trabajador, fechaInicio, cliente);
		// TODO Auto-generated constructor stub
		this.numeroAlarmas = numeroAlarmas;
		this.fechaRevision = LocalDate.of(año, mes, dia);
		setTrabajador("Revisor Especialista Contraincendios");
	}
	
	//M acceso
	public int getNumeroAlarmas() {
		return numeroAlarmas;
	}

	public void setNumeroAlarmas(int numeroAlarmas) {
		this.numeroAlarmas = numeroAlarmas;
	}

	public LocalDate getFechaRevision() {
		return fechaRevision;
	}

	public void setFechaRevision(LocalDate fechaRevision) {
		this.fechaRevision = fechaRevision;
	}
	
	//sobrescritos de Servicio
	@Override
	public double costeMaterial() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double costeManoObra() {
		// Coste_mano_obra = (número_alarmas / 3) * 40;
		double costeManoObra = (this.getNumeroAlarmas()/3)*40;
		double costeRedondeado = Math.round(costeManoObra * 100.0) / 100.0;
		return costeRedondeado;
	}

	@Override
	public double costeTotal() {
		//Coste_total = coste_material + coste_mano_obra;
				double costeTotal = costeMaterial() + costeManoObra();
				double costeRedondeado = Math.round(costeTotal * 100.0) / 100.0;
				return costeRedondeado;
	}

	@Override
	public String detalleServicio() {
		String mensaje = "\nREVISIÓN PERIÓDICA ALARMAS CONTRA INCENDIOS" +"\n";
		mensaje += "Cliente: "+ this.getCliente() + "\n";
		mensaje += "Fecha revisión: "+ this.getFechaRevision() + "\n";
		mensaje += "-  - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - -  " + "\n";
		mensaje += "TOTAL: "+ this.costeTotal()+ "€" + "\n";
		mensaje += "-  - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - -  " + "\n";
		
		
		return mensaje;
	}
	
	
	
}
