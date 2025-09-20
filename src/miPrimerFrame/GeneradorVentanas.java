package miPrimerFrame;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class GeneradorVentanas extends JFrame {
	
	public GeneradorVentanas(String titulo,int posx,int posy,int ancho,int alto) {
	
	//setSize(900, 600); 
	//setLocation(600,350);
	
	//setLocationRelativeTo(null);
	//setResizable(false);
	setBounds(posx, posy, ancho, alto);
	setTitle(titulo);
	setDefaultCloseOperation(GeneradorVentanas.EXIT_ON_CLOSE);
	
	Toolkit miSistema = Toolkit.getDefaultToolkit();
	Image miIcono = miSistema.getImage("C:\\Users\\jorgeT\\OneDrive\\Pictures\\Gato.jpeg");
	setIconImage(miIcono);
	setVisible(true);
	
	
	
	
	
	
	}	
		
	
}
