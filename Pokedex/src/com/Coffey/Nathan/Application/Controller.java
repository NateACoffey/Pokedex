package com.Coffey.Nathan.Application;


import com.Coffey.Nathan.Struct.FillStruct;
import com.Coffey.Nathan.Struct.Node;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


public class Controller implements Initializable {
	FillStruct findPokemon = new FillStruct();
	Node node = new Node();
	
	public TextField search;
	
	public TextField textboxName;
	public TextField textboxNumber;
	
	public ImageView imagePicturePath;
	
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
	
	
	
	private void setTextboxData(String name) {
		node = findPokemon.findStruct(name);
		
		if(node != null) {
			textboxName.setText(node.getName());
			textboxNumber.setText(String.valueOf(node.getNumber()));
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
		}
	}
	
	public void handleSearch(ActionEvent e) {
		
		setTextboxData(search.getText());
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("Loading GUI");
		
		setTextboxData("Bulbasaur");
		
	}
	
	
	
	
	
}
