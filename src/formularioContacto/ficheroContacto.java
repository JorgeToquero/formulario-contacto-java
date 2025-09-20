package formularioContacto;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ficheroContacto {
	
	
	public static void guardarFichero(Contacto contacto) {
		
		String nombreFichero= "C:\\Users\\jorgeT\\Documents\\contactos.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero,true))){
			
			bw.write(contacto.toString());
			bw.write("--------------------------------------\n"); // Línea de separación
		
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			  System.out.println("Error al guardar el contacto: " + e.getMessage());
		}
	}

	

}
