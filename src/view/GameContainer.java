package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class GameContainer extends JPanel{
	
	private InputTextField input;
	private GameDialogContent content;
	
	public GameContainer() {
		this.setLayout(null);
		this.setBackground(Color.BLACK);
		
		this.content = GameDialogContent.getInstance();
		this.content.setLocation(10, 31);
		this.add(content);
		
		this.input = InputTextField.getInstance();
		this.input.setLocation(10, 339);
		this.add(input);
	}
	
}
