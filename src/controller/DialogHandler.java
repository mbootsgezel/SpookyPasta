package controller;

import model.SCP087;
import view.GameDialogContent;

public class DialogHandler {
	
	private static DialogHandler instance;
	
	private SCP087 scp = new SCP087();
	
	public void getDialogText(String input){
		GameDialogContent.getInstance().newDialog(scp.getDialog(input));
	}
	
	public static DialogHandler getInstance(){
		if(instance == null){
			instance = new DialogHandler();
		}
		return instance;
	}

}
