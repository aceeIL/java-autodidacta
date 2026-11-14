package ejercicios.tema6_Ejercicio8_OtraVez;

public class GestorFarmacia {

	//atributo
	private Producto[] productos;
	
	//Constructor
	public GestorFarmacia() {
		this.productos = new Producto[10];
	}
	public GestorFarmacia(int numeroProductos) {
		this.productos = new Producto[numeroProductos];
	}
	
	//Metodos del gestor
	public void addProducto(Producto p) {
		for(int i=0;i<productos.length;i++) {
			if(productos[i]==null) {
				productos[i] = p;
				break;
			}
		}
	}
	
	public void calcularPrecioFinal() {
		float total = 0;
		for(Producto p : productos) {
			if(p!=null) {
				total += p.getPrecio();
			}
		}
		
		float totalRedondeado = Math.round(total * 100.0f) /100.0f;
		
		System.out.print("---------------------------------------------------------"+"\n");
		System.out.print("El precio total de los productos es de: ... "+totalRedondeado+" €"+"\n");
		System.out.print("---------------------------------------------------------"+"\n");
		
	}
	
	public void aplicarDescuento() {
		for(Producto p : productos) {
			if(p!=null) {
				
				if(p instanceof Alimentacion) {
					((Alimentacion) p).aplicarDescuento();
				}
				
				else if(p instanceof Medicamento) {
					((Medicamento) p).aplicarDescuento();
				}
			}
		}
	}
	
	public void mostrarProductosOrdenadosPorPrecio() {
		//Veo cuantos productos hay realmente en el array
		int numProductos = 0;
		for(int i=0;i<productos.length;i++) {
			if(productos[i]!=null) {
				numProductos++;
			}
		}
		
		//Creo un array auxiliar y meto los productos existentes ordenados
		Producto[] copia = new Producto[numProductos];
		int contador = 0;
		for(int i=0;i<productos.length;i++) {
			if(productos[i]!=null) {
				copia[contador] = productos[i];
				contador++;
			}
		}
		
		//Ordeno el array de menor a mayor
		for(int i=0;i<copia.length;i++) {
			for(int j=0;j<copia.length-1-i;j++) {
				if(copia[j].CalcularPrecioFinal()>copia[j+1].CalcularPrecioFinal()) {
					Producto aux = copia[j];
					copia[j] = copia[j+1];
					copia[j+1] = aux;
					
				}
			}
		}
		//Muestro los productos ya ordenados
	    for (int i = 0; i < copia.length; i++) {
	        System.out.println(copia[i].getNombre() + " - Precio final: " + copia[i].CalcularPrecioFinal() + " €");
	    }
	}
	
	
	//ToString
	@Override
	public String toString() {
		if (productos == null || productos.length == 0) {
		    return "La farmacia no tiene productos registrados.";
		}

	    StringBuilder sb = new StringBuilder();
	    sb.append("=== LISTADO DE PRODUCTOS DE LA FARMACIA ===\n");

	    for (Producto p : productos) {
	        sb.append(p.toString()).append("\n");
	        sb.append("-------------------------------------------\n");
	    }

	    return sb.toString();
	}
	
}
