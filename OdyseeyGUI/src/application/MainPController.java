package application;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainPController {
	
	// FXML control
	ChoiceBox cb_options;
	ListView lv_odymusic;
	ListView lv_friends;
	TableView tv_mymusic;
		TableColumn tc_song;
		TableColumn tc_artist;
		TableColumn tc_album;
		TableColumn tc_genre;
		TableColumn tc_year;
		TableColumn tc_lyrics;
	Slider slr_media;
	Label lbl_medtime;
	
	
	// END FXML control
	//
	//
	//FXML initializer
	
	@FXML
	public void initialize() {
		 
	}
	
	
	
	//END FXML initializer
	//
	//
	//
	// FXML Buttons
	
	
	public void btnPlayPause() {
		
	}
	
	// END FXML Buttons
	//
	//
	//
	
	
	
}
