package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class GameContainer extends JPanel{
	
	private InputTextField input;
	private GameDialogPane dialog;
	
	public GameContainer() {
		this.setLayout(null);
		this.setBackground(Color.BLACK);
		
		this.dialog = new GameDialogPane();
		this.dialog.setLocation(10, 31);
		this.add(dialog);
		
		this.input = new InputTextField();
		this.input.setLocation(10, 339);
		this.add(input);
	}

}
