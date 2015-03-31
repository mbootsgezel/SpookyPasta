package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JTextPane;

public class GameDialogPane extends JTextPane{
	
	public GameDialogPane() {
		super();
		this.setSize(780, 300);
		this.setBackground(Color.BLACK);
		this.setForeground(Color.WHITE);
		
		this.setFont(new Font("Courier", Font.PLAIN, 18));
		this.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 0), 1, true));
		this.setBorder(BorderFactory.createCompoundBorder( this.getBorder(), BorderFactory.createEmptyBorder(5, 10, 5, 5)));
		this.setMargin(new Insets(5,5,5,5));
		
		this.setEditable(false);
		this.setFocusable(false);
		
		this.setText("This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.This is a test document.");
	}

}
