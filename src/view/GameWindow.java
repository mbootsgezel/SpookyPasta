package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	
	private GameContainer gc;
	
	public GameWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setSize(800, 400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		this.gc = new GameContainer();
		this.add(gc, BorderLayout.CENTER);
		
		this.setVisible(true);
	}

}
