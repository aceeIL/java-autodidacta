package ejercicios.tema7_Ejercicio2;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Metodos {

	//Metodo para Darse de alta
	public static boolean darAlta(String nombreUsuario,String password) {
		String ruta = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio2/Credenciales.txt";
		
		
		if(comprobarNombreUsuario(nombreUsuario)) {
			System.out.println("Usuario registrado, porfavor inicie sesion");
			return false;
		}
		
		try(BufferedWriter bfEscritor = new BufferedWriter(new FileWriter(ruta,true))){
			bfEscritor.write(nombreUsuario+";");
			bfEscritor.write(password);
			bfEscritor.newLine();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Nombre de usuario y contrasela añadida correctamente!");
		return true;
	}
	// Metodo para comprobar credenciales
	public static boolean ComprobarCredencial(String nombreUsuario, String password) {
		String ruta = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio2/Credenciales.txt";

		String linea = "";
		boolean usuarioComprobacion = false;
		boolean contraseñaComprobacion = false;

		try (BufferedReader bfLector = new BufferedReader(new FileReader(ruta))) {

			while ((linea = bfLector.readLine()) != null) {
				int posPuntoComa = linea.indexOf(";");

				String usuario = "";
				String contraseña = "";
				if (posPuntoComa != -1) {
					usuario = linea.substring(0, posPuntoComa);
					contraseña = linea.substring(posPuntoComa + 1);
				}

				if (usuario.equals(nombreUsuario)) {
					usuarioComprobacion = true;
					if (contraseña.equals(password)) {
						contraseñaComprobacion = true;
						
						String rutaLog = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio2/LogInicioSesion.txt";
						
						
						LocalDateTime fechaHora = LocalDateTime.now();
						try(BufferedWriter bfEscritor = new BufferedWriter(new FileWriter(rutaLog,true))){
							//DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd 'a las' HH:mm:ss");
							//String fecha = "El usuario: " + nombreUsuario + " ha iniciado sesion en " + fechaHora.format(formato);

							
							String fecha = "El usuario: "+nombreUsuario+" ha iniciado sesion en ";
							fecha += Integer.toString(fechaHora.getYear())+ "/" + Integer.toString(fechaHora.getMonthValue())+"/" + Integer.toString(fechaHora.getDayOfMonth());
							fecha += " A las "+fechaHora.getHour()+":"+fechaHora.getMinute()+":"+fechaHora.getSecond();
									
							bfEscritor.write(fecha);
							bfEscritor.newLine();
							
						}
						
						return true;
					}
					break; // Encontró al usuario pero falló la contraseña, dejamos de leer el fichero
				}
			} // fin del while

			if (!usuarioComprobacion) {
				System.out.println("El usuario es incorrecto");
				return false;
			} else if (!contraseñaComprobacion) {
				System.out.println("La contraseña es incorrecta");
				return false;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return false;
	}
	
	private static boolean comprobarNombreUsuario(String nombreUsuario) {
		String ruta = System.getProperty("user.dir") + "/src/ejercicios/tema7_Ejercicio2/Credenciales.txt";
		
		try(BufferedReader bfLector = new BufferedReader(new FileReader(ruta))){
			
			String linea ="";
			
			while(linea!=null) {
				linea = bfLector.readLine();
				
				int posPuntoComa = -1;
				String usuario ="";
				
				if(linea!=null) {
					if(posPuntoComa!=-1) {
						posPuntoComa = linea.indexOf(";");
						usuario = linea.substring(0, posPuntoComa);
					}
				}
				if(usuario.equals(nombreUsuario)) {
					return true;
				}
			}
			
			
		} //Fin try
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


}
