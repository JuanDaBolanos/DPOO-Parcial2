package presentacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logica.Parcial;

public class FPrincipal extends JFrame{
	private Parcial parcial;
	private JLabel lParametro;

	public FPrincipal() {
		this.parcial = new Parcial();
		
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		this.setTitle("Examen Juan Bolaños");		
		this.setBounds((int)pantalla.getWidth()/2 - 200, (int)pantalla.getHeight()/2 - 150, 400, 300);
		
		JPanel pBotones = new JPanel();
		pBotones.setLayout(new GridLayout(2, 3, 10, 10));
		this.add(pBotones, BorderLayout.CENTER);
		
		for(int i=0; i<3; i++) {
			
		}
		

		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FPrincipal();
	}
}
