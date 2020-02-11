package com.Coffey.Nathan.Application;


import com.Coffey.Nathan.Struct.InitializeStruct;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Launcher extends Application {
	
	private static InitializeStruct data = new InitializeStruct();
	
	
	@Override
    public void start(Stage primaryStage) throws Exception {
		
        Parent root = FXMLLoader.load(getClass().getResource("PokeGUI.fxml"));
		primaryStage.setTitle("Nathan's Pokedex");
		primaryStage.getIcons().add(new Image("file:Pics/icon.png"));
		primaryStage.setScene(new Scene(root, 640, 400));
		primaryStage.show();
        
        
    }
	
	
	public static void main(String[] args) {
		
		System.out.println("Filling data structure from PokemonData.txt");
		
		data.initializeStruct(); //filling data structure
		
		System.out.println("--Successfully retrieved data from PokemonData.txt");
		
		launch(args);
		
		System.out.println("Closing program.");
		
		
	}
	
	
}
