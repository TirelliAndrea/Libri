package it.andrea.libri;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LibriController extends Main {

    @FXML
    private Button btnLibro;

    @FXML
    void suAggiungiLibro(ActionEvent event) {
    	
    	try {
    		Stage stage = new Stage();
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("NuovoLibro.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

    }


