package ejercicios.tema5;

public class Jugador {
	
	//Atributos
	private String codigo;
	private String nombre;
	private int puntos;
	
	public static String competicion;
	
	//Constructor
	public Jugador() {
		codigo = null;
		nombre = null;
		puntos = 0;
		competicion = "Triatlon";
	}
	public Jugador(String codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	
	//getters and setters / Metodos acceso
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		if(codigo.length()==2) {
				for(int i =0;i<codigo.length();i++) {
					if(Character.isDigit(codigo.charAt(i))) {
						if(Character.isLetter(codigo.charAt(i))){
							this.codigo = codigo;
						}
					}
				}
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	
	//Meotodos
	public int actualizarPuntos(int puntos) {
		return this.puntos += puntos;
	}
	
	
	
	//ToString
	@Override
	public String toString() {
		return "nombre: " + nombre + " --- " +"codigo: " + codigo + " --- " +"puntos = " + puntos + " --- " + "Competicion: " + competicion;
	}
	
}
