package ejercicios.tema6_Ejercicio4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente[] pacientes = new Paciente[10];
		
		pacientes[0] = new Paciente("54230135E","Joaquin",35);
		pacientes[1] = new Paciente("29342837N","Andre",28);
		pacientes[2] = new Paciente("76765992L","Marta",45);
		pacientes[3] = new SospechosoCoronavirus("22389156J","Carlos",61);
		pacientes[4] = new SospechosoCoronavirus("40162650G","Juan",56);
		pacientes[5] = new SospechosoCoronavirus("77411510L","Mercedes",89);
		pacientes[6] = new SospechosoCoronavirus("73487002R","Alberto",76);
		
		//Diagnosticar a los pacientes sospechosos de coronavirus:
		for(int i=0;i<pacientes.length;i++) {
			if(pacientes[i]!=null && pacientes[i] instanceof SospechosoCoronavirus) {
				((SospechosoCoronavirus)pacientes[i]).realizarTest();
			}
		}
		//Mostrar por pantalla datos de aquellos pacientes que están infectados.
		for(Paciente p : pacientes) {
			if(p!=null) {
				if(p instanceof SospechosoCoronavirus) {
					if(((SospechosoCoronavirus)p).isInfectado()) {
						System.out.println(p);
					}
					
				}
			}
		}
		
		//Curar a aquellos que tengan una edad inferior a 50 años.
		for(int i=0;i<pacientes.length;i++) {
			if(pacientes[i]!=null && pacientes[i] instanceof SospechosoCoronavirus) {
				if(pacientes[i].getEdad()<50 && ((SospechosoCoronavirus)pacientes[i]).isInfectado()) {
					((SospechosoCoronavirus)pacientes[i]).curar();
				}
			}
		}
		
		//Mostrar pacientes
		System.out.println("\n");
		for(Paciente p : pacientes) {
			if(p!=null) {
				System.out.println(p);
			}
		}
		
		
	}

}
