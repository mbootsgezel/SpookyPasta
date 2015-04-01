package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextPane;

public class GameDialog extends JTextPane{
	
	private static final long serialVersionUID = 4176255359861576708L;
	
	private GameDialogContent gdc;
	
	private String fullText = "";
	private String text = "";
	private int position = 0;

	public GameDialog(GameDialogContent gdc, String s) {
		this.setSize(780, 50);
		this.setBackground(Color.BLACK);
		this.setForeground(Color.WHITE);
		this.setFocusable(false);
		this.setFont(new Font("Courier", Font.PLAIN, 16));
		
		this.gdc = gdc;
		this.fullText = s;
	}

	public String getDialog(){
		return this.getText();
	}
	
	public boolean nextDialogChar(){
		if(position != fullText.length()){
			text = text +  fullText.charAt(position++);
			setText(text);
			return true;
		}
		return false;
	}



}
