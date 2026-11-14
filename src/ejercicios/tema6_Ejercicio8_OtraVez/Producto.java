package ejercicios.tema6_Ejercicio8_OtraVez;

import java.util.Random;

public abstract class Producto {

	
	private String codigo;
	private String nombre;
	private String fabricante;
	private float precio;
	
	//Constructor
	public Producto(String nombre,String fabricante,float precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
		setCodigo();
		
	}

	//Setters and getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo() {
		this.codigo = generarCodigo();
	}
	private String generarCodigo() {
		//Un codigo tiene una longitud de 6 caracteres 3 letras del abecedario, un gion y dos letras
		
		//Creo un array de letras para el abecedario
		char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','W','X','Y','Z'};
		
		//Variable del codigo final:
		String codigoID = "";
		
		//Le añado 3 letras
		Random generador = new Random();
		for(int i=0;i<=4;i++) {
			char letraAñadida = letras[generador.nextInt(letras.length)];
			
			codigoID += letraAñadida;
		}
		//ahora le añado un guion
		codigoID += "-";
		
		//por ultimo le añado en las utimas posiciones dos letras entre 0 y 9
		for(int i=0;i<=2;i++) {
			codigoID += generador.nextInt(10);
		}
		
		return codigoID;
	}
	//ToString
	@Override
	public String toString() {
		this.precio = Math.round(this.precio * 100.0f) / 100.0f;
		
		String mensaje = "-------------------------------"+"\n";
		mensaje += "Nombre del producto: ... "+ this.nombre+"\n";
		mensaje += "Fabricante: ... "+ this.fabricante+"\n";
		mensaje += "precio: ... "+this.precio+" €" +"\n";
		mensaje += "-------------------------------"+"\n";
		
		return mensaje;
	}
	
	//Funcionalidades de las clases hijas hay un metodo AplicarDescuento() que se metera en una interfaz
	//Ya que solo es para alimentacion y medicamentos
	
	public abstract float CalcularPrecioFinal();
	
	
}
