package ejercicios.tema6_Ejercicio8;

import java.util.Random;

public abstract class Producto {

	//Atrbuto
	private String codigo;
	private String nombre;
	private String fabricante;
	private float precio;
	
	//Constructor
	public Producto(String nombre,String fabricante,float precio) {
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.precio = precio;
		this.codigo = generadorCodigo();	
		}
	
	
	public abstract float calcularPrecioFinal();
	
	//setts y getts
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
	
	//Metodo para generar un codigo
	private String generadorCodigo() {
		//El codigo Empezara con PRD- y se generará aleatoriamente un numero y una letra
		char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','W','X','Y','Z'};
		
		String codigo = "PRD-";
		
		Random generador = new Random();
		
		for(int i=3;i<codigo.length();i++) {
			char letra = letras[generador.nextInt(letras.length)];
			codigo += letra;
			
			int numero = generador.nextInt(10);
			codigo += numero;
			
			break;
			}
		
		
		if(codigo.length()==6) {
			return codigo;
		}
		
		return null;	
	}
		
	
		
	
}
