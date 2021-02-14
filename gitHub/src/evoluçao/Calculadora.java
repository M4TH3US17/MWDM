/* PROJETO CALCULADORA
  @author Matheus Dalvino */
package evoluçao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora extends JFrame {

	public Calculadora(){
		super("Calculadora");
		
		Container c1 = getContentPane();
		Container c2 = new JPanel();
		
		c1.setLayout(new BorderLayout());
		c2.setLayout(new GridLayout(4,4));//4 LINHAS E 4 COLUNAS 
        
		c1.add(BorderLayout.SOUTH, c2);
		
		c2.add(new JButton("7"));
		c2.add(new JButton("8"));
		c2.add(new JButton("9"));
		c2.add(new JButton("X"));
		c2.add(new JButton("4"));
		c2.add(new JButton("5"));
		c2.add(new JButton("6"));
		c2.add(new JButton("-"));
		c2.add(new JButton("1"));
		c2.add(new JButton("2"));
		c2.add(new JButton("3"));
		c2.add(new JButton("+"));
		c2.add(new JButton("."));
		c2.add(new JButton("0"));
		c2.add(new JButton("/"));
		c2.add(new JButton("="));
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
	}

}
