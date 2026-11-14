package ejercicios.tema6_Ejercicio8;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Creamos el gestor de la farmacia (con capacidad para 20 productos, por ejemplo)
        GestorFarmacia farmacia = new GestorFarmacia(20);
        
        //2. Creamos productos de diferentes tipos
        Medicamentos medCaducado = new Medicamentos("Ibuprofeno 600mg", "Cinfa", 10.0f, true, "Oral", 40.0f, LocalDate.of(2024, 5, 10));
        
        // Medicamento VIGENTE (fecha futura -> sin descuento)
        Medicamentos medVigente = new Medicamentos("Paracetamol 1g", "Normon", 8.0f, false, "Oral", 20.0f, LocalDate.of(2028, 12, 31));
        
        // Cosmética (10% IVA -> nunca tiene descuento)
        Cosmetica crema = new Cosmetica("Crema Hidratante", "Nivea", 15.0f, 250.0f, true);
        
        // Alimentación INFANTIL (21% IVA -> tendrá 15% de descuento)
        Alimentacion papilla = new Alimentacion("Papilla Cereales", "Nestlé", 6.0f, 500.0f, true);
        
        // Alimentación INFANTIL (21% IVA -> tendrá 15% de descuento)
        Alimentacion barrita = new Alimentacion("Barrita Energética", "Bicentury", 3.0f, 100.0f, false);
        
        // 3. Añadimos los productos al gestor de la farmacia
        farmacia.addProducto(medCaducado);
        farmacia.addProducto(medVigente);
        farmacia.addProducto(crema);
        farmacia.addProducto(barrita);
        farmacia.addProducto(papilla);
        
        // 4. Creamos una Promoción (ej. Pack Cuidado con un 20% de descuento)
        
        Producto[] productosParaPack = { crema, barrita };
        
        farmacia.crearPromocion("Pack Cuidado Diario", 0.20f, productosParaPack);
        
        
        // 5. Probamos los métodos del gestor
        
        System.out.println("=== PRECIOS FINALES (CON IVA Y SEGURIDAD SOCIAL) ===");
        farmacia.calcularPrecioFinal();
        
        System.out.println("\n=== APLICANDO DESCUENTOS (50% MED. CADUCADOS / 15% ALIM. INFANTIL) ===");
        farmacia.aplicarDescuento();

        System.out.println("\n=== PRODUCTOS ORDENADOS POR PRECIO (MENOR A MAYOR) ===");
        farmacia.mostrarProductosOrdenadosPorPrecio();

        
        
        
        

	}

}
