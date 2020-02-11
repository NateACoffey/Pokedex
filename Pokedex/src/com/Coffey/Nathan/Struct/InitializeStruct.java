package com.Coffey.Nathan.Struct;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InitializeStruct {
	public void initializeStruct(){
		
		FillStruct fillStruct = new FillStruct();
		AddStruct addStruct = new AddStruct();
		
		File file = new File("PokemonData.txt");
	
		try {
			Scanner scnr = new Scanner(file);
			
			scnr.nextLine();
			
			while(scnr.hasNext()) {
				String row = scnr.nextLine().replace("\t", "");//removes tab spaces
				String[] columnArr = row.split(";");
				
				Struct struct = new Struct();
				
				struct = fillStruct.fillStruct(columnArr);//fills basic struct to be inserted in the full Node structure
				
				Hash5 h5 = new Hash5();
				
				int buck = h5.hashName(struct.name.toLowerCase());
				
				addStruct.addStruct(struct, buck);//uses the filled struct to insert it into the array
				
				
			}
			
			scnr.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
