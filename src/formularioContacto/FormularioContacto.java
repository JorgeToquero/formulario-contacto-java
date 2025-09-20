package formularioContacto;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FormularioContacto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoNombre;
	private JTextField campoEmail;
	private JTextField campoMensaje;

	

	/**
	 * Create the frame.
	 */
	public FormularioContacto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiquetaNombre = new JLabel("Nombre");
		etiquetaNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiquetaNombre.setBounds(71, 61, 80, 44);
		contentPane.add(etiquetaNombre);
		
		JLabel etiquetaEmail = new JLabel("Email");
		etiquetaEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiquetaEmail.setBounds(71, 149, 80, 44);
		contentPane.add(etiquetaEmail);
		
		JLabel etiquetamensaje = new JLabel("Mensaje");
		etiquetamensaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiquetamensaje.setBounds(71, 234, 80, 44);
		contentPane.add(etiquetamensaje);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(200, 70, 223, 30);
		contentPane.add(campoNombre);
		campoNombre.setColumns(10);
		
		campoEmail = new JTextField();
		campoEmail.setBounds(200, 158, 223, 30);
		contentPane.add(campoEmail);
		campoEmail.setColumns(10);
		
		campoMensaje = new JTextField();
		campoMensaje.setBounds(169, 236, 546, 72);
		contentPane.add(campoMensaje);
		campoMensaje.setColumns(10);
		
		JButton btn = new JButton("Enviar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre  = campoNombre.getText().trim();
				String email   = campoEmail.getText().trim();
				String mensaje = campoMensaje.getText().trim();
				
				//validaciones
				
				if (!Validador.validarVacio(nombre)) {
					
					JOptionPane.showMessageDialog(null , "El nombre no puede estar vacío");
					return;
				}
				
				if (!Validador.validarVacio(email)) {
				    JOptionPane.showMessageDialog(null, "El email no puede estar vacío");
				    return;
				}
				
				if (!Validador.validarEmail(email)) {
					
					JOptionPane.showMessageDialog(null , "El email no tiene formato válido");
					return;
				}
				
				
				if (!Validador.validarVacio(mensaje)) {
					
					JOptionPane.showMessageDialog(null , "El mensaje no puede estar vacío");
					return;
				}
				
				//Crear objeto contacto
				Contacto contacto = new Contacto(nombre, email, mensaje);
				 ficheroContacto.guardarFichero(contacto);
				 JOptionPane.showMessageDialog(null, "Guardado en contactos.txt");
				
				//Mostrar por consola
				System.out.println(contacto.toString());
				
				//Mensaje de éxito
				
				JOptionPane.showMessageDialog(null , "Formulario enviado correctamente");
				
				
				 // Limpiar campos
		        campoNombre.setText("");
		        campoEmail.setText("");
		        campoMensaje.setText("");
				
				
				
			}
		});
		btn.setBounds(273, 332, 174, 44);
		contentPane.add(btn);
	}
}
