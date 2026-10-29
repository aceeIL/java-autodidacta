package ejercicios.tema5_SegundaParte;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Alumno {
	//Atributos
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String email;
	private int edad;
	private String curso;
	private float[] notas;
	private float media;
	

	
	//Constructor
	public Alumno() {
		this.dni = null;
		this.curso = null;
		this.edad = 0;
		this.email = null;
		this.fechaNacimiento = null;
		this.media = 0.0f;
		rellenarNotasNegativos(this.notas,10);
		
	}
	//Constructor A
	public Alumno(String dni,String nombre,int año,int mes,int dia,int numeroMaximoNotasPosibles) {
		setDni(dni);
		setFechaNacimiento(año,mes,dia);
		setCurso(this.curso);
		rellenarNotasNegativos(this.notas,numeroMaximoNotasPosibles);
		this.nombre = nombre;
		
		this.edad = 0;
		this.email = null;
		this.media = 0.0f;
		
		
	}
	//Constructor B
	public Alumno(String dni,String nombre,String email,String curso,int año,int mes,int dia) {
		setDni(dni);
		this.nombre = nombre;
		this.email = email;
		setCurso(this.curso);
		setFechaNacimiento(año,mes,dia);
		rellenarNotasNegativos(this.notas,10);
		setEdad(this.edad);
		
		this.media = 0.0f;
		
		
	}
	//Metodos de acceso
	String a;
	
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		validarDni(dni);
		if(dni !=null) {
			this.dni = dni;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int año,int mes,int dia) {
		
		
		this.fechaNacimiento = LocalDate.of(año, mes, dia);
		int edadCalculada = Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
		setEdad(edadCalculada);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad!=Period.between(fechaNacimiento, LocalDate.now()).getYears()) {
			this.edad = 0;
		}
		this.edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();

	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		if(curso != "GMI1" || curso != "GMI2" || curso != "GME1" || curso != "GME2" 
				|| curso != "GSR1" || curso != "GSR2") {
			this.curso = null;
		}
		this.curso = curso;
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float ...m) {
		float suma = 0;
		for(int i=0;i<m.length;i++) {
			suma += m[i];
		}
		this.media = suma/m.length;
	}

	//ToString
	@Override
	public String toString() {
		return "dni: " + dni + " --- "+ "nombre: " + nombre + " --- " +"fechaNacimiento: " + fechaNacimiento + " --- "+ "email: " + email
				+ " --- " +"edad: " + edad + " --- " +"curso: " + curso + " --- " +"notas: " + Arrays.toString(notas) + " --- " +"media: " + media;
	}

	
	
	//Metodos
	public float[] addNota(float nota) {
		
		for(int i=0;i<notas.length;i++) {
			if(notas[i]<0) {
				notas[i]=nota;
				setMedia(notas);
				break;
			}
		}
		
		
		return notas;
	}
	public String modificarNombre(String nombre) {
		this.nombre = nombre;
		
		return nombre;
	}
	public float[] modificarNota(float nota,int posicion) {
		
		notas[posicion] = nota;
		setMedia(notas);
		
		return notas;
	}

	//Metodos aux
	private String validarDni(String dni) {
		if(dni == null || dni.length() != 9) {
			return null;
		}
		for(int i=0;i<dni.length()-1;i++) {
			if(!Character.isDigit(dni.charAt(i))) {
				return null;
			}
		}
		int IndiceletraDNI = dni.length()-1;
		char letraDni = dni.charAt(IndiceletraDNI);
		
		if(!Character.isLetter(letraDni)) {
			return null;
		}
		//Paso el DNI a int y calculo el resto
		String cadDigitosDNI = "";
		for(int i=0;i<dni.length();i++) {
			if(Character.isDigit(dni.charAt(i))){
				cadDigitosDNI += dni.charAt(i);
			}
		}
		
		int digitosDNI = Integer.parseInt(cadDigitosDNI);
		int restoDNI = digitosDNI%23;
			
		//Hago una lista con las letras en los indices correctos
		String listaLetrasDNI= "T,R,W,A,G,M,Y,F,P,D,X,B,N,J,Z,S,Q,V,H,L,C,K,E";
			
		if(letraDni != listaLetrasDNI.charAt(restoDNI)) {
			return null;
		}
		
		
		return dni;
		
	}
	private float[] rellenarNotasNegativos(float[] notas,int numeroMaximoNotasPosibles) {
		notas = new float[numeroMaximoNotasPosibles];
		for(int i=0;i<notas.length;i++) {
			if(notas[i]==0.0f || notas[i]==0) {
				notas[i] = -1;
			}
		}
		
		
		return this.notas = notas;
	}
	
	
}
	

