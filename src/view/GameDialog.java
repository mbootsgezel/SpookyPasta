package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextPane;

public class GameDialog extends JTextPane implements Runnable{

	private static final long serialVersionUID = 4176255359861576708L;

	private String text = "";
	private int opacity = 0;

	private boolean running;

	public GameDialog(String s) {
		this.setSize(780, 100);
		this.setBackground(Color.BLACK);
		this.setForeground(Color.WHITE);
		this.setFocusable(false);
		this.setEditable(false);
		this.setFont(new Font("Courier", Font.PLAIN, 16));

		this.running = false;
		this.text = s;
	}

	public String getDialog(){
		return this.getText();
	}

	@Override
	public void run() {
		this.running = true;
		try {
			setText(text);
			setForeground(new Color(255, 255, 255, opacity));
			while(running){
				if(opacity != 255){
					setForeground(new Color(255, 255, 255, ++opacity));
					Thread.sleep(10);
				} else {
					running = false;
				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		if(!running){
			Thread.currentThread().interrupt();
		}
	}



}
