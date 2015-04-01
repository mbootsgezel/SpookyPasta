package model;

public class CreepyPasta {
	
	protected String name;
	protected int stage;
	protected String message;
	protected String input;
	
	public CreepyPasta() {
		this.name = "Unknown";
		this.stage = 1;
		this.message = "";
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setDialogMessage(String message){
		this.message = message;
	}
	
	public void setDialogStage(int i){
		this.stage = i;
	}
	
	public void setInput(String input){
		this.input = input;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDialogMessage(){
		return message;
	}
	
	public int getDialogStage(){
		return stage;
	}
	
	public String getInput(){
		return input;
	}

}
