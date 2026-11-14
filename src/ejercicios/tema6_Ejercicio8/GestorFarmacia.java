package ejercicios.tema6_Ejercicio8;

public class GestorFarmacia {

	//atrb
	private Producto[] productos;
	
	//Constructor
	public GestorFarmacia() {
		this.productos = new Producto[10];
	}
	public GestorFarmacia(int numeroProductos) {
		this.productos = new Producto[numeroProductos];
	}
	
	//Metodos
	/*addProducto(Producto p)
	 *calcularPrecioFinal()
	 *aplicarDescuento()
	 *mostrarProductosOrdenadosPorPrecio()
	 */
	
	public void addProducto(Producto p) {
		boolean guardado = false;;
		for(int i=0;i<productos.length;i++) {
			if(productos[i]==null) {
				productos[i] = p;
				guardado = true;
				break;
			}
		}
		if(!guardado)
			System.out.println("No se ha podido guardar este producto");
		
	}
	public void calcularPrecioFinal() {
	    for (int i = 0; i < productos.length; i++) {
	        if (productos[i] != null) {
	            System.out.println(productos[i].getNombre() + " - Precio final: " + productos[i].calcularPrecioFinal() + " €");
	        }
	    }
	}

	public void aplicarDescuento() {
	    for (int i = 0; i < productos.length; i++) {
	        if (productos[i] != null) {
	            if (productos[i] instanceof Descuentable) {
	                float precioRebajado = ((Descuentable) productos[i]).aplicarDescuento();
	                System.out.println(productos[i].getNombre() + " - Con descuento: " + precioRebajado + " €");
	            } else {
	                System.out.println(productos[i].getNombre() + " - Sin descuento: " + productos[i].calcularPrecioFinal() + " €");
	            }
	        }
	    }
	}
	public void mostrarProductosOrdenadosPorPrecio() {
	    // 1. Contamos cuántos productos reales (no nulos) hay
	    int numProductos = 0;
	    for (int i = 0; i < productos.length; i++) {
	        if (productos[i] != null) {
	            numProductos++;
	        }
	    }

	    // 2. Creamos una copia exacta solo con los productos existentes
	    Producto[] copia = new Producto[numProductos];
	    int index = 0;
	    for (int i = 0; i < productos.length; i++) {
	        if (productos[i] != null) {
	            copia[index] = productos[i];
	            index++;
	        }
	    }

	    // 3. Ordenamos la copia de menor a mayor (Método de la burbuja)
	    for (int i = 0; i < copia.length - 1; i++) {
	        for (int j = 0; j < copia.length - 1 - i; j++) {
	            if (copia[j].calcularPrecioFinal() > copia[j + 1].calcularPrecioFinal()) {
	                Producto aux = copia[j];
	                copia[j] = copia[j + 1];
	                copia[j + 1] = aux;
	            }
	        }
	    }

	    // 4. Mostramos los productos ya ordenados
	    for (int i = 0; i < copia.length; i++) {
	        System.out.println(copia[i].getNombre() + " - Precio final: " + copia[i].calcularPrecioFinal() + " €");
	    }
	}
	public void crearPromocion(String nombre, float descuento, Producto[] productosPack) {
	    Promocion nuevaPromo = new Promocion(nombre, "Farmacia", descuento, productosPack.length);
	    
	    for (int i = 0; i < productosPack.length; i++) {
	        if (productosPack[i] != null) { // <-- CAMBIAR AQUÍ A != null
	            nuevaPromo.addProductoAlPack(productosPack[i]);
	        }
	    }
	    
	    this.addProducto(nuevaPromo); 
	}

}
