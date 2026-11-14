package ejercicios.tema6_Ejercicio8_OtraVez;

import java.time.LocalDate;
import java.util.Scanner;

public class PrincipalFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Añadir productos
		Medicamento m1 = new Medicamento("Amoxicilina 500mg","Cinfa",6.50f,"Oral",LocalDate.of(2030, 1, 1),true,40.0f);
		Producto p1 = new Cosmetica("Sérum Ácido Hialurónico","La Roche-Posay",28.90f,30.0f,true);
		Alimentacion a1 = new Alimentacion("Leche de Continuación 2","Almirón",18.40f,800.0f,true);
		
		
		//Array de productos
		GestorFarmacia gf1 = new GestorFarmacia();
		gf1.addProducto(p1);
		gf1.addProducto(m1);
		gf1.addProducto(a1);
		
		
		//Calcular precio final
		gf1.calcularPrecioFinal();
		
		//Aplicar Descuentos
		gf1.aplicarDescuento();
		
		//Mostrar productos ordenados por precio
		gf1.mostrarProductosOrdenadosPorPrecio();
		
		//Crear promocion
		Promocion promo1 = new Promocion("Pack Mamá y Bebé", "Farmacia Central", 45.00f, 15.0f, 2);
		
		//Añado productos al pack
		promo1.addProductoToPack(p1);
		promo1.addProductoToPack(a1);
		
		//Lo meto en el gestor
		gf1.addProducto(promo1);
		
		//Vuelvo a mostrar productos ordenados por precio
		gf1.mostrarProductosOrdenadosPorPrecio();
		
		//Enseñar los toString
		System.out.println();
		System.out.println("Medicamento 1 : ");
		System.out.println(m1);
		System.out.println();
		System.out.println("Alimento 1: ");
		System.out.println(a1);
		System.out.println();
		System.out.println("Cosmetico 1: ");
		System.out.println(p1);
		System.out.println();
		System.out.println("Promo 1: ");
		System.out.println(promo1);   
	
	}
}
