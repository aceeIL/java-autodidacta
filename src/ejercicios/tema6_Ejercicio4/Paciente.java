package ejercicios.tema6_Ejercicio4;

public class Paciente {

	//Atributos
	private String dni;
	private String nombre;
	private int edad;
	private String enfermedad;
	
	
	//Constructor
	public Paciente() {
		this.dni = null;
		this.nombre = null;
		this.edad = -1;
		this.enfermedad = null;
	}
	public Paciente(String dni, String nombre, int edad) {
		setDni(dni);
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Metodos de acceso
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if(validarDni(dni))
			this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	
	
	
	//Comprobar DNI
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

	
	//ToString
	@Override
	public String toString() {
		if(enfermedad == null) {
			return "dni: " + dni + " | " +"nombre: " + nombre + " | " +"edad: " + edad;

		}
		return "dni: " + dni + " | " +"nombre: " + nombre + " | " +"edad: " + edad + " | " +"enfermedad: " + enfermedad;
	}
	
	
}
