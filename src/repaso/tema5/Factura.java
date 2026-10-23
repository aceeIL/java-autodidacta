package repaso.tema5;
import java.time.LocalDate;

public class Factura {
	
	private String codigo; // 2 letras y 2 digitos
	private LocalDate fecha;
	private float importe;
	
	//Constructores
	public Factura(String codigo, LocalDate fecha, float importe) throws Exception {

		if(validarCodigo(codigo)) {
			this.codigo = codigo;
		}
		else {
			throw new Exception("Códiog erroneo");
		}
		setFecha(fecha);
		this.importe = importe;
	}

	//Métodos de acceso
	public LocalDate getFecha() {
		return fecha;
	}
	
	
	//Verificar que la fecha es anterior al dia de hoy
	public void setFecha(LocalDate fecha) {
		if(fecha.isBefore(LocalDate.now())|| fecha.isEqual(LocalDate.now())) {
			this.fecha = fecha;
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}
		
	
	//Metodos Auxiliares
	private boolean validarCodigo(String codigo) {
//		if(codigo.matches("[A-Z]{2}{0-9}{2}")) {
//			return true;
//		}
//		else {
//			return false;
//		}
//		
		return codigo.matches("[A-Z]{2}{0-9}{2}");
	}
	
	
}
