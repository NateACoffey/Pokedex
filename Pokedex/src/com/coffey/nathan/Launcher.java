package com.coffey.nathan;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Launcher extends Application {
	
	private static FillStruct data;
	
	Stage window;
	Button button, button2, exitProgram;
	
	@Override
    public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		window.setTitle("Nathan's Pokedex");//title name
        
        button = new Button("Dreepy"); //new button that sets the text
        button.setOnAction(e -> System.out.println(data.findStruct(button.getText())));//set button to handle in "this" class
        
        //button2 = new Button("Blacephalon"); 
        //button2.setOnAction(e -> System.out.println(data.findStruct(button2.getText())));
        
        
        exitProgram = new Button("Exit"); //closing the program
        exitProgram.setOnAction(e -> closeProgram());
        window.setOnCloseRequest(e -> { //override auto exit
        	e.consume();
        	closeProgram();
        });
        
        
        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        //layout.getChildren().add(button2);
        
        
        
        Scene scene = new Scene(layout, 1024, 768);//size of window; width, length
        window.setScene(scene);
        window.show();
    }
	
	private void closeProgram() {
		//Boolean exit = ConfirmBox.display("Title", "Are you sure you want to exit?");
		//if(exit)
			window.close();
	}
	
	public static void main(String[] args) {
		
		data = new FillStruct();
		
		data.struct(); //filling data structure
		
		launch(args);
		
		
		
	}

}
