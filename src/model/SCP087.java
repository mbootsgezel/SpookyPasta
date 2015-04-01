package model;

public class SCP087 extends CreepyPasta{
	
	public SCP087() {
		this.setName("SCP-087");
		this.setDialogStage(1);
	}

	public String getDialog(String input){
		switch(input){
		
		default:
			this.setDialogMessage("I don't think I should do that.");
			break;
		case "k": case "ok": case "oke": case "okee": case "okay": case "okey": case "oki":
			this.setDialogMessage("Lets do that.");
			break;
		case "1":
			this.setDialogMessage("SCP-087 is located on the campus of [REDACTED]. The doorway leading to SCP-087 is constructed of reinforced steel with an electro-release lock mechanism. It has been disguised to resemble a janitorial closet consistent with the design of the building.");
			break;
		case "2":
			this.setDialogMessage("The lock mechanism on the doorknob will not release unless ██ volts are applied in conjunction with counter-clockwise rotation of the key. The inside of the door is lined with 6 centimeters of industrial foam padding.");
			break;
		case "3":
			this.setDialogMessage("");
			break;
		case "4":
			this.setDialogMessage("");
			break;
		case "5":
			this.setDialogMessage("");
			break;
		}
		
		
		return message;
	}

}
