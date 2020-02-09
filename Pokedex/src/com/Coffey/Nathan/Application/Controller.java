package com.Coffey.Nathan.Application;


import com.Coffey.Nathan.Struct.FillStruct;
import com.Coffey.Nathan.Struct.Node;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller implements Initializable {
	FillStruct findPokemon = new FillStruct();
	Node node = new Node();
	
	public Button button;
	
	public TextField search;
	
	public TextField textboxName;
	public TextField textboxNumber;
	
	public ImageView imagePath;
	
	public TextField textboxType1;
	public TextField textboxType2;
	
	public TextField textboxCatchRate;
	
	public TextField textboxEggGroup1;
	public TextField textboxEggGroup2;
	
	public TextField textboxAbilityHA;
	public TextField textboxAbility1;
	public TextField textboxAbility2;
	
	public TextField textboxHP;
	public TextField textboxAtk;
	public TextField textboxSpAtk;
	public TextField textboxDef;
	public TextField textboxSpDef;
	public TextField textboxSpd;
	
	public File file;
	
	Image image;
	
	
	
	private void setTextboxData(String name) {
		node = findPokemon.findStruct(name);
		
		image = null;
		
		if(node != null) {
			textboxName.setText(node.getName());
			textboxNumber.setText(String.format("%03d", node.getNumber()));
			
			image = new Image("file:Pics/"+ node.getName() +".png");
			imagePath.setImage(image);
			
			textboxType1.setText(node.getType1());
			textboxType2.setText(node.getType2());
			
			textboxCatchRate.setText(String.valueOf(node.getCatchRate()));
			
			textboxEggGroup1.setText(node.getEggGroup1());
			textboxEggGroup2.setText(node.getEggGroup2());
			
			textboxAbilityHA.setText(node.getHiddenAbility());
			textboxAbility1.setText(node.getAbility1());
			textboxAbility2.setText(node.getAbility2());
			
			textboxHP.setText(String.valueOf(node.getBaseHP()));
			textboxAtk.setText(String.valueOf(node.getBaseAttack()));
			textboxSpAtk.setText(String.valueOf(node.getBaseSpecialAttack()));
			textboxDef.setText(String.valueOf(node.getBaseDefense()));
			textboxSpDef.setText(String.valueOf(node.getBaseSpecialDefense()));
			textboxSpd.setText(String.valueOf(node.getBaseSpeed()));
		}else {
			image = new Image("file:Pics/default.png");
			imagePath.setImage(image);
		}
	}
	
	public void textSearch(ActionEvent e) {
		
		setTextboxData(search.getText());
		
	}
	
	public void buttonSearch(ActionEvent e) {
		
		setTextboxData(button.getText());		//TODO: fix text only showing the last button's text
		
		search.setText("");
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("Loading GUI");
		
		setTextboxData("Bulbasaur");
		
	}
	
	
	
	
	
}
