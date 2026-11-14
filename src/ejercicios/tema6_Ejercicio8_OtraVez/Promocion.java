package ejercicios.tema6_Ejercicio8_OtraVez;

public class Promocion extends Producto{
	
	//atributos
	private Producto[] packPromocion;
	private float descuento;

	
	//constructor
	public Promocion(String nombre, String fabricante, float precio,float descuento) {
		super(nombre, fabricante, precio);
		this.descuento = descuento;
		this.packPromocion = new Producto[5];
		setCodigo();
	}
	public Promocion(String nombre, String fabricante, float precio,float descuento,int numeroProductos) {
		super(nombre, fabricante, precio);
		this.descuento = descuento;
		this.packPromocion = new Producto[numeroProductos];
		setCodigo();
	}

	
	//set y get
	public float getDescuento() {
		return descuento;
	}


	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	// Metodo de AddProducto a packPromocion
	public void addProductoToPack(Producto p) {
		for(int i=0;i<packPromocion.length;i++) {
			if(packPromocion[packPromocion.length-1]!=null) {
				System.out.println("El packpromocional no admite mas productos");
				break;
			}
			if(packPromocion[i]==null) {
				packPromocion[i] = p;
				break;
			}
		}
	}
	//Metodo calcularPrecioFinal de producto
	@Override
	public float CalcularPrecioFinal() {
		//Calculo la suma de los productos del pack
		float suma = 0;
		
		for(int i=0;i<packPromocion.length;i++) {
			if(packPromocion[i]!=null) {
				suma += packPromocion[i].getPrecio();
			}
			else {
				break;
			}
		}
		
		float nuevoPrecioFinal = suma - (suma * (descuento / 100));
		
		float precioRedondeado = Math.round(nuevoPrecioFinal * 100.0f) /100.0f;
		
		return precioRedondeado;
	}
	
	
	//ToString
	@Override
	public String toString() {
		String mensaje = super.toString();
		mensaje += "******** Datos de la promocion ********"+"\n";
		mensaje += "Descuento: ..."+ this.descuento +"\n";
		mensaje += "Precio final: ..."+ this.CalcularPrecioFinal()+" €" +"\n";
		mensaje += "********************************";
		
		return mensaje;
	}
	
}
