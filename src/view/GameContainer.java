package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class GameContainer extends JPanel{
	
	private InputTextField input;
	
	public GameContainer() {
		this.setLayout(null);
		this.setBackground(Color.BLACK);
		
		this.input = new InputTextField();
		this.input.setLocation(10, 339);
		this.add(input);
	}

}
