package ejercicios.tema7_Ejercicio3;

public class Serie {

	//Atributos de clase
	private String titulo;
	private float valoracion;
	private int capitulos;
	private String genero;
	private int anho;
	private Plataforma plataforma;
	
	//Constructores:
	
	//constructor por defecto
	public Serie() {
		this.titulo = null;
		this.valoracion = 0;
		this.capitulos = -1;
		this.genero = null;
		this.anho = 0;
		this.plataforma = null;
	}
	//constructor que inicializa todo menos valoracion
	public Serie(String titulo, int capitulos, String genero, int anho, Plataforma plataforma) {
		super();
		this.titulo = titulo;
		this.valoracion = 0;
		this.capitulos = capitulos;
		this.genero = genero;
		this.anho = anho;
		this.plataforma = plataforma;
	}
	
	//Setters and Getters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getValoracion() {
		return valoracion;
	}
	public void setValoracion(float valoracion) {
		this.valoracion = valoracion;
	}
	public int getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAnho() {
		return anho;
	}
	public void setAnho(int anho) {
		this.anho = anho;
	}
	public Plataforma getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}
	
	
	//ToString
	@Override
	public String toString() {
		String mensaje = "**********" +"\n";
		mensaje += "Serie: "+"\n";
		mensaje += "**********"+"\n";
		mensaje += "---"+"\n";
		mensaje += "Titulo: "+this.titulo+"\n";
		mensaje += "Valoracion: "+this.valoracion+"\n";
		mensaje += "Numero de capitulos: "+this.capitulos+"\n";
		mensaje += "Plataforma: "+this.plataforma+"\n";
		mensaje += "Año: "+this.anho+"\n";
		mensaje += "Genero: "+this.genero+"\n";
		mensaje += "---"+"\n";
		
		return mensaje;
	}
	
	
	
	
	
}
