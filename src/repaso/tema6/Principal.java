package repaso.tema6;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TareaProyecto tp1 = new TareaProyecto();
		
		//Upcasting: clase derivada --> clase base
		Tarea t4 = new TareaProyecto();
		
		tp1.setTitulo("Tarea de prueba con un proyecto");
		tp1.setFechaLimite(2027, 1, 1);
		tp1.setDescripcion("una tarea mas");
		tp1.setImportante(true);
		tp1.setFechaLimiteProyecto(LocalDate.of(2027, 1, 1));
		tp1.setNombreProyecto("Proyecto nuevo");
		
		
		TareaProyecto tp2 = new TareaProyecto("Proyecto 1","Tarea 1",LocalDate.of(2026, 12, 1),LocalDate.of(2027, 1, 1),"esta tarea tiene un proyecto",true);
		
		//Polimorfismo: Con una referenicia (Tarea) puedo apuntar a diferentes objetos (TareaProyecto)
		Tarea t1 = new TareaProyecto();
		t1.setFechaLimite(2027, 1, 1);
		
		//Downcasting: clase base --> clase derivada

		TareaProyecto copia = (TareaProyecto)t1;
		
		//Lo mismo
		((TareaProyecto)t1).setFechaLimiteProyecto(null);
		copia.setFechaLimiteProyecto(null);
		
		
		
		
		Tarea[] tareas = new Tarea[9];
		
		tareas[0] = new TareaProyecto();
		((TareaProyecto)tareas[0]).setFechaLimiteProyecto(LocalDate.of(2027, 8, 1));
		System.out.println("Tareas[0]: "+tareas[0].toString());
		
		for(int i=0;i<tareas.length;i++) {
			if(tareas[i] == null) {
				break;
			}
			if(tareas[i] instanceof TareaProyecto)
			((TareaProyecto)tareas[i]).setFechaLimite(2027,7,1);
		}
		
		System.out.println("TP1: "+tp1);
		
		//comprobacion setfechaLimite
		tp1.setFechaLimiteProyecto(LocalDate.of(2026, 8, 1));
		tp1.setFechaLimite(2026, 7, 1);
		
		System.out.println("TP1: "+tp1);
		
			
		Tarea[] tareas2 = new Tarea[3];
		
		tareas[0] = new Tarea("titulo1","descipcion del titulo 1",LocalDate.of(2026, 12, 1),true);
		tareas[1] = new TareaProyecto("proyecto2","titulo2",LocalDate.of(2026, 12, 1),LocalDate.of(2027, 1, 1),"Tarea 2 con proyecto 1",true);
		tareas[2] = new TareaProyecto("proyecto3","titulo3",LocalDate.of(2026, 11, 5),LocalDate.of(2026, 12, 1),"Tarea 3 con proyecto 2 ",false);
		
		Arrays.sort(tareas2);
		
		//Comparable --> compareTo -1 , 0 , 1
		//-1: uno es menor que otro
		//0: son iguales
		//1: 
		
		
		
	}
}
