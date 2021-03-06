package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.TimerTask;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class GameDialogContent extends JPanel{

	private static final long serialVersionUID = 4528267997441937365L;

	private static GameDialogContent instance;

	private ArrayList <GameDialog> dialogs;

	public GameDialogContent() {
		this.setSize(760, 300);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBackground(Color.BLACK);

		this.dialogs = new ArrayList<GameDialog>();
		this.initDialogs();
	}

	public void newDialog(String s){

		GameDialog dialog =  new GameDialog(s);

		this.dialogs.add(dialog);
		this.add(dialog);

		for(int i = 0; i < dialogs.size(); i++){
			if(dialogs.size() == 7){
				this.remove(dialogs.get(i));
				this.dialogs.remove(i);
			}
			dialogs.get(i).setForeground(new Color(255, 255, 255, 255-((dialogs.size()-i-1)*50)));
		}
		
		Thread t = new Thread(dialog);
		t.start();
		
		new java.util.Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				//t.stop();
			}
		}, (s.length()+1)*80);


	}

	private void initDialogs(){
		for(int i = 0; i < 5;i++){
			GameDialog dialog =  new GameDialog("");
			this.dialogs.add(dialog);
			this.add(dialog);
		}
	}

	public static GameDialogContent getInstance(){
		if(instance == null){
			instance = new GameDialogContent();
		}
		return instance;
	}

}
