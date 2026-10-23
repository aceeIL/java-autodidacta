package repaso.tema5;

public class GestorFactura {

	private Factura facturas[];
	
	//Constructores
	
	public GestorFactura(int capacidad) {
		facturas = new Factura[capacidad];
	}
	public GestorFactura(Factura[] facturas) {
		this.facturas = facturas;
	}
	
	//metodo de guardar factura
	public boolean addFactura(Factura f) {
		for(int i=0;i<this.facturas.length;i++) {
			if(facturas[i] == null) {
				facturas[i] = f;
				return true;
			}
		}
		return false;
	}
	//metodo buscar factura
	public Factura getFactura(String codigo) {
		for(int i=0;i<this.facturas.length;i++) {
			if(facturas[i] != null) {
				if(facturas[i].getCodigo().equals(codigo)) {
					return facturas[i];
				}
			}
		}
		return null;
	}
	
	//Metodo que muestre por pantalla la matriz interna de facturas
	public void mostrarFacturasGuardadas() {
		for(Factura f : this.facturas) {
			if(f!=null) {
				System.out.println(f);
			}
		}
	}
	
	public Factura getFacturaByPos(int posicion) {
		if(posicion <this.facturas.length) {
			return this.facturas[posicion];
			
		}
		return null;
	}
	
}
