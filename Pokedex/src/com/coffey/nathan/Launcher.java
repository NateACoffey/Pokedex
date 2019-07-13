package com.coffey.nathan;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Launcher extends Application implements EventHandler<ActionEvent>{
	
	private static FillStruct data;
	
	Button button;
	Button button2;
	
	@Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Nathan's Pokedex");//title name
        
        button = new Button("Makuhita"); //new button that sets the text
        button.setOnAction(this);//set button to handle in "this" class
        
        button2 = new Button("Blacephalon"); 
        button2.setOnAction(this);
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        layout.getChildren().add(button2);
        
        
        
        Scene scene = new Scene(layout, 1024, 768);//size of window; width, length
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == button) {
			System.out.println(data.findStruct(button.getText()));
		}
		if(event.getSource() == button2) {
			System.out.println(data.findStruct(button2.getText()));
		}
	}
	
	public static void main(String[] args) {
		
		data = new FillStruct();
		
		data.struct(); //filling data structure
		
		launch(args);
		
		
		
	}

}
