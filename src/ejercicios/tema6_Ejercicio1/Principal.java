package ejercicios.tema6_Ejercicio1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpleadosPYME[] empelados = new EmpleadosPYME[20];
		//Creo el salario base:
		EmpleadosPYME.setSalarioBase(1000);
		
		
		EmpleadosPYME e1 = new EmpleadosPYME("54230135E",LocalDate.of(2000, 1, 1),LocalDate.of(2020, 1, 1),"Jose");

		EmpleadosPYME e2 = new Directivos("53388567R",LocalDate.of(2003, 1, 1),LocalDate.of(2020, 1, 1),"Daniel","644022791");
	
		EmpleadosPYME e3 = new Administrativos("48788074Z",LocalDate.of(1997, 1, 1),LocalDate.of(2020, 1, 1),"Ana","1h");
		
		EmpleadosPYME e4 = new Operarios("83419450Z",LocalDate.of(2005, 1, 1),LocalDate.of(2021, 1, 1),"Antonio","ACC-2021-89141","RC-1871258-X");
		
	

		e1.ActualizarSalario();
		e2.ActualizarSalario();
		e3.ActualizarSalario();
		e4.ActualizarSalario();
		
		
		empelados[0] = e1;
		empelados[1] = e2;
		empelados[2] = e3;
		empelados[3] = e4;
		
		for(int i=0;i<empelados.length;i++) {
			if(empelados[i]!=null) {
				System.out.println(empelados[i] + "\n");
			}
		}
		
		
		
		
		
	}

}
