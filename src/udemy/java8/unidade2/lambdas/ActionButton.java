package udemy.java8.unidade2.lambdas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionButton extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public static void main(String[] args) {
		JButton button = new JButton();
		
		/*** Sem Lambda***/
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello!");
				
			}
		});
		/******************/
		
		
		
		/*** Com Lambda ***/
		button.addActionListener(Event -> {System.out.println("Hello");});
		/******************/
	}

}
