package ejercicios.tema6_Ejercicio8;

public class Promocion extends Producto {

	//atrb
	private Producto[] productosPack;
	private int numProductos;
    private float descuento;
	
    public Promocion(String nombre, String fabricante, float descuento, int maxProductos) {
        // Pasamos 0.0f como precio base porque el precio depende de los productos del pack
        super(nombre, fabricante, 0.0f);
        this.productosPack = new Producto[maxProductos];
        this.numProductos = 0;
        this.descuento = descuento;
    }

    // Método para meter productos sueltos dentro de esta promoción
    public void addProductoAlPack(Producto p) {
        if (numProductos < productosPack.length) {
            productosPack[numProductos] = p;
            numProductos++;
        }
    }

    @Override
    public float calcularPrecioFinal() {
        float sumaTotal = 0.0f;
        
        // Sumamos el precio final de cada producto guardado en el array
        for (int i = 0; i < numProductos; i++) {
            sumaTotal += productosPack[i].calcularPrecioFinal();
        }
        
        // Restamos el descuento de la promoción
        return sumaTotal - (sumaTotal * descuento);
    }

}
