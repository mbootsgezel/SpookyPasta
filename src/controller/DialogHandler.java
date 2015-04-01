package controller;

public class DialogHandler {
	
	private static DialogHandler instance;
	
	public void getDialogText(String input){
		GameDialogContent.getInstance().newDialog(input);
	}
	
	public static DialogHandler getInstance(){
		if(instance == null){
			instance = new DialogHandler();
		}
		return instance;
	}

}
