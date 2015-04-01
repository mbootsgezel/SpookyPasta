package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

import controller.DialogHandler;
import controller.InputController;

public class InputTextField extends JTextField{
	
	private static final long serialVersionUID = -3291468811616663711L;
	
	private static InputTextField instance;
	
	private InputTextField() {
		super();
		this.setSize(780, 30);
		this.setBackground(Color.BLACK);
		this.setForeground(Color.WHITE);
		
		this.setFont(new Font("Courier", Font.PLAIN, 18));
		this.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 128), 1, true));
		this.setBorder(BorderFactory.createCompoundBorder( this.getBorder(), BorderFactory.createEmptyBorder(5, 10, 5, 5)));
		this.setMargin(new Insets(5,5,5,5));
		
		this.requestFocus();
		this.setCaretColor(Color.WHITE);
		this.setCaret(new CustomCaret());
		
		this.addActionListener(new InputController());
	}
	
	public void sendInput(){
		String input = this.getText().toLowerCase();
		this.setText("");
		DialogHandler.getInstance().getDialogText(input);
	}
	
	public static InputTextField getInstance(){
		if(instance == null){
			instance = new InputTextField();
		}
		return instance;
	}

}
