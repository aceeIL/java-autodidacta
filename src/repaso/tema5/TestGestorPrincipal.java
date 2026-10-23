package repaso.tema5;

import java.time.LocalDate;

public class TestGestorPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestorFactura gf = new GestorFactura(20);
		//GUardar una factura
		try {
			gf.addFactura(new Factura("AS34",LocalDate.of(2022, 10, 20),450));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Factura no ha sido creada por que el codigo esta mal");
			System.out.println(e.getMessage());
		}
		
		//Mostrar facturas almacenadas
		gf.mostrarFacturasGuardadas();
		
		//Buscar factura 
		Factura f = gf.getFactura("AS34");
		Factura f2 = gf.getFacturaByPos(0);
		
	}

}
