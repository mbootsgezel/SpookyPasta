package model;

public class CreepyPasta {
	
	private String name;
	private int stage;
	private String message;
	
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
	
	public String getName(){
		return name;
	}
	
	public String getDialogMessage(){
		return message;
	}
	
	public int getDialogStage(){
		return stage;
	}

}
