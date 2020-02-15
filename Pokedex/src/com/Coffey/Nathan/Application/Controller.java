package com.Coffey.Nathan.Application;


import com.Coffey.Nathan.Struct.FindStruct;
import com.Coffey.Nathan.Struct.Node;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class Controller implements Initializable {
	FindStruct findPokemon = new FindStruct();
	Node node = new Node();
	
	public ScrollPane scroll;
	public AnchorPane anchor;
	
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
		
		if(!name.equals(""))
			node = findPokemon.findStruct(name);
		else
			node = null;
		
		
		image = null;
		
		if(node != null) {
			textboxName.setText(node.getName());
			textboxNumber.setText(String.format("%03d", node.getNumber()));
			
			image = new Image("file:Pics/240px-" 
									+ String.format("%03d", node.getNumber()) 
									+ node.getName().replaceAll("[ :]", "_") 
										+ ".png");
			
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
			
			
			//set scroll based on pokedex number
			if(node.getNumber() < 7) {
				scroll.setVvalue(0.0);
			} else if (node.getNumber() > 884) {
				scroll.setVvalue(1.0);
			} else {
				scroll.setVvalue(node.getNumber() / 878.4 - 0.00674157303);	// 878.4 = 890 - 6 - 6 + arbitrary .4	//0.00674157303 = 6/890
			}
			
			
			
		}else {
			image = new Image("file:Pics/default.png");
			imagePath.setImage(image);
		}
	}
	
	public void appendText(ActionEvent e) {
		
		//appends search box with symbols
		search.appendText(((Button) e.getSource()).getText());
		
		search.requestFocus();
		search.selectEnd();
		
	}
	
	public void textSearch(ActionEvent e) {
		
		setTextboxData(search.getText());
		
		search.selectAll();
		
	}
	
	public void buttonSearch(ActionEvent e) {
		
		setTextboxData(((Button) e.getSource()).getText());	//grabs the actual text of the button pressed
		
		search.setText("");
		
	}
	
	public void genScroll(ActionEvent e) {
		
		String gen = ((Button) e.getSource()).getText();
		
		gen = gen.substring(gen.length() - 1);	//grabs last char in string = gen number
		
		
		switch(Integer.parseInt(gen)) {
			case 1:
				setTextboxData("Bulbasaur");
				break;
			case 2:
				setTextboxData("Chikorita");
				break;
			case 3:
				setTextboxData("Treecko");
				break;
			case 4:
				setTextboxData("Turtwig");
				break;
			case 5:
				setTextboxData("Victini");
				break;
			case 6:
				setTextboxData("Chespin");
				break;
			case 7:
				setTextboxData("Rowlet");
				break;
			default:
				setTextboxData("Grookey");
				
		}
		
		search.requestFocus();
		search.selectEnd();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("Loading GUI");
		
		setTextboxData("Bulbasaur");
		
		anchor.setFocusTraversable(true); //makes sure we can auto scroll to the searched pokemon
		
	}
	
	
	
	
	
}
