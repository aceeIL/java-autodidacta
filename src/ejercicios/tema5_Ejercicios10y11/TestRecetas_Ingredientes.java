package ejercicios.tema5_Ejercicios10y11;

public class TestRecetas_Ingredientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Receta:  ensalada mediterránea
		
		//Creo los ingredientes
		Ingrediente iEnsalda1 = new Ingrediente("Tomate",0.5f,2.0f,18.0f);
		Ingrediente iEnsalada2 = new Ingrediente("Lechuga",0.2f,1.5f,15.0f);
		Ingrediente iEnsalada3 = new Ingrediente("Queso Feta",0.15f,10.0f,260.0f);
		Ingrediente iEnsalada4 = new Ingrediente("Aceitunas",0.1f,5.0f,115.0f);
		
		//Creo la receta
		Receta ensaladaMediterránea = new Receta("Ensalada fresca de verano con queso feta y aceitunas",4);
		
		//Añado los ingredientes
		ensaladaMediterránea.addIngredientes(iEnsalda1);
		ensaladaMediterránea.addIngredientes(iEnsalada2);
		ensaladaMediterránea.addIngredientes(iEnsalada3);
		ensaladaMediterránea.addIngredientes(iEnsalada4);
		
		//Receta:  Una tarta de manzana
		
		//Creo los ingredientes
		Ingrediente iTartaManzana1 = new Ingrediente("Manzana",1.2f,2.5f,52.0f);
		Ingrediente iTartaManzana2 = new Ingrediente("Harina",0.4f,1.2f,364.0f);
		Ingrediente iTartaManzana3 = new Ingrediente("Azucar",0.25f,1.6f,387.0f);
		Ingrediente iTartaManzana4 = new Ingrediente("Mantequilla",0.2f,8.0f,717.0f);
		
		//Creo la receta
		Receta tartaManzana = new Receta("Tarta de manzana casera tradicional con base de hojaldre",4);
		
		//Añado los ingredientes
		tartaManzana.addIngredientes(iTartaManzana1);
		tartaManzana.addIngredientes(iTartaManzana2);
		tartaManzana.addIngredientes(iTartaManzana3);
		tartaManzana.addIngredientes(iTartaManzana4);
		
		//Receta:  Una tarta de manzana
		
		//Creo los ingredientes
		Ingrediente iPastaBoloñesa1 = new Ingrediente("Pasta Macarrones",0.5f,1.8f,350.0f);
		Ingrediente iPastaBoloñesa2 = new Ingrediente("Carne Picada",0.4f,7.5f,250.0f);
		Ingrediente iPastaBoloñesa3 = new Ingrediente("Tomate frito",0.3f,2.2f,80.0f);
		Ingrediente iPastaBoloñesa4 = new Ingrediente("Queso Rallado",0.1f,12.0f,400.0f);
		
		//Creo la receta
		Receta pastaBoloñesa = new Receta("Pasta boloñesa gratinada al horno con extra de queso",4);
		
		//Añado los ingredientes
		pastaBoloñesa.addIngredientes(iPastaBoloñesa1);
		pastaBoloñesa.addIngredientes(iPastaBoloñesa2);
		pastaBoloñesa.addIngredientes(iPastaBoloñesa3);
		pastaBoloñesa.addIngredientes(iPastaBoloñesa4);
		
		
		//Enseño informacion por pantalla
		
		System.out.println("Pasta boloñesa: "+pastaBoloñesa);

		
	}

}
