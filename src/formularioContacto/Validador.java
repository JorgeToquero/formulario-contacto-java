package formularioContacto;


public class Validador {
	
		public static boolean validarVacio(String s) {
	    return s != null && !s.trim().isEmpty();
	}
	
		public static boolean validarEmail ( String s) {
		
			if (s == null || s.trim().isEmpty()) return false; 
		    String regex = "^[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$";
		    return s.trim().matches(regex);
	}
		
		
	

}
