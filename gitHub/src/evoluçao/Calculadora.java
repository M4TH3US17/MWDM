package evoluçao;

import javax.swing.JFrame;

public class Calculadora extends JFrame {

	public Calculadora(){
		super("Calculadora");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,350);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
	}

}
