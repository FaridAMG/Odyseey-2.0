package other;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ErrorHandlersK {

	public String createUserError(String Username,String name, String age, String Password, String RepPassword) {
		
		if(Username.equals("")) {
			return "Dont forget to create a Username!";
		}
		if(name.equals("")) {
			return "Dont forget to add youre name!";
		}
		if(age.equals("")) {
			return "Dont forget to add youre age!";
		}
		
		if(Password.equals("")) {
			return "Dont forget to create a Password!";
		}
		
		if(RepPassword.equals("")) {
			return "Dont forget to repeat youre Password!";

		}
		
		if(!Password.equals(RepPassword)) {
			return "Ups! Password doesnt mach with the repeated password";
		}
		
				
		return "good";
	}
	
	
	
public String loadUserError(String Username, String Password) {
		
		if(Username.equals("")) {
			return "Please enter username!";
		}
		
		if(Password.equals("")) {
			return "Please enter password!";
		}
				
		return "good";
	}
	
public String createMusicError(String songName, String songArtist) {
	Alert alert = new Alert(AlertType.ERROR);
	alert.setTitle("Odyssey Help!");
	
	if(songName.equals("")) {
		
		alert.setHeaderText("Error searching music");
		alert.setContentText("Dont forget to add a song");
		alert.show();
		return "bad";
		
	}else if(songArtist.equals("")) {
		
		alert.setHeaderText("Error searching music");
		alert.setContentText("Dont forget to add an artist");
		alert.show();
		return "bad";
		
	}else {
		
		return "good";
		
	}

}
	
	
}
