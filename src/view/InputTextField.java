package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class InputTextField extends JTextField{
	
	public InputTextField() {
		super();
		this.setSize(780, 30);
		this.setBackground(Color.BLACK);
		this.setForeground(Color.WHITE);
		
		this.setFont(new Font("Courier", Font.PLAIN, 18));
		this.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 128), 1, true));
		this.setBorder(BorderFactory.createCompoundBorder( this.getBorder(), BorderFactory.createEmptyBorder(5, 10, 5, 5)));
		
		this.requestFocus();
		this.setCaretColor(Color.WHITE);
		this.setCaret(new CustomCaret());
		
		this.setMargin(new Insets(5,5,5,5));
	}

}
