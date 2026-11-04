package ejercicios.tema6_Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class EmpleadosPYME {

	//Atributos
	private String dni;
	private LocalDate fechaNacimiento;
	private String nombre;
	private LocalDate fechaContratacion;
	private float salario;
	private static float salarioBase;
	
	//Constructores
	public EmpleadosPYME(String dni, LocalDate fechaNacimiento,LocalDate fechaContratacion, String nombre) {
		setDni(dni);
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.fechaContratacion = fechaContratacion;
	}
	//ToString
	@Override
	public String toString() {
		return "dni: " + dni + " | " +"fechaNacimiento: " + fechaNacimiento + " | " +"nombre: " + nombre
				+ " | " +"fechaContratacion: " + fechaContratacion + " | " +"salario: " + salario;
	}

	//Metodos de acceso
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if(validarDni(dni) ==  true) {
			this.dni = dni;
		}
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(LocalDate fechaContratacion) {
		if(fechaContratacion.isBefore(LocalDate.now())) {
			this.fechaContratacion = fechaContratacion;
		}
	}

	public float getSalario() {
		return salario;
	}
	protected void setSalario(float salario) {
		this.salario = salario;
		
	}

	public void ActualizarSalario() {
		//this.salario = salarioBase + (años de antiguedad/3)*salarioBase*0,05
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(getFechaContratacion(), fechaActual);
		
		int antiguedad = periodo.getYears();
		
		this.salario = (float) (getSalarioBase() + (antiguedad/3)*getSalarioBase()*0.05);
	}

	public static float getSalarioBase() {
		return salarioBase;
	}

	public static void setSalarioBase(float salarioBase) {
		EmpleadosPYME.salarioBase = salarioBase;
	}
	
	//Metodos privados
	private boolean validarDni(String dni) {
	    boolean digitosYlongitud = false;
	    boolean letra = false;
	    boolean validado = false;
	    int contador = 0;

	    //Compruebo dígitos y longitud
	    if (dni != null && dni.length() == 9) {
	        for (int i = 0; i < 8; i++) {
	            if (Character.isDigit(dni.charAt(i))) {
	                contador++;
	            }
	        }
	        if (contador == 8) {
	            digitosYlongitud = true;
	        }
	    }

	    // Si los números o la longitud están mal, no seguimos para evitar errores
	    if (!digitosYlongitud) {
	        return false;
	    }

	    //Compruebo la letra
	    String numerosDNI = dni.substring(0, 8);
	    int numeroAsignar = Integer.parseInt(numerosDNI);
	    int indice = numeroAsignar % 23;

	    // Array de caracteres ordenados según el algoritmo oficial del DNI
	    char[] listaLetrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	    char letraCorrecta = listaLetrasDNI[indice];

	    // Comparamos la letra del DNI (pasada a mayúscula por seguridad) con la correcta calculada
	    if (Character.toUpperCase(dni.charAt(8)) == letraCorrecta) {
	        letra = true;
	    }

	    // 3. Comprobación final
	    if (digitosYlongitud && letra) {
	        validado = true;
	    }
	    return validado;
	}

	
	
	
	
	
	
	
}
