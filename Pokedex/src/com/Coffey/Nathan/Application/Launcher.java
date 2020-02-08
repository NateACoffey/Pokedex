package com.Coffey.Nathan.Application;


import com.Coffey.Nathan.Struct.FillStruct;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Launcher extends Application {
	
	private static FillStruct data = new FillStruct();;
	
	
	@Override
    public void start(Stage primaryStage) throws Exception {
		/*
		
		Button exitProgram;
		
        exitProgram = new Button("Exit"); //closing the program
        exitProgram.setOnAction(e -> closeProgram());
        window.setOnCloseRequest(e -> { //override auto exit
        	e.consume();
        	closeProgram();
        });
        
        */
		
        Parent root = FXMLLoader.load(getClass().getResource("PokeGUI.fxml"));
		primaryStage.setTitle("Nathan's Pokedex");
		primaryStage.setScene(new Scene(root, 640, 400));
		primaryStage.show();
        
        
    }
	
//	private void closeProgram() {
//		//Boolean exit = ConfirmBox.display("Title", "Are you sure you want to exit?");
//		//if(exit)
//			window.close();
//	}
	
	public static void main(String[] args) {
		
		//data = new FillStruct();
		
		data.struct(); //filling data structure
		
		System.out.println("Succesfully retreieve data from PokemonData.txt");
		
		launch(args);
		
	}

}
