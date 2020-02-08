package com.Coffey.Nathan.Struct;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FillStruct {
	
	private static final int pokeTotal = 890;//---->if changed, need to change Hash5.java % return<----
	public static Node[] hash = new Node[pokeTotal];
	
	Node curr = null;
	
	private void addStruct(Struct s, int bucket) {
		Node node = new Node(s);//inputs struct into the node
		
		if(hash[bucket] == null) { //checks first node in bucket
			
			
			node.head = node;
			node.tail = node;
			
			hash[bucket] = node;
			
		}else {
			
			hash[bucket].tail.next = node;	//assigns the current node after the tail node
			hash[bucket].tail = node;		//then moves the tail to the current node
		}
		
		
	}
	
	public Struct findStruct(String pokeName) {
		
		Hash5 h5 = new Hash5();
		int bucket = h5.hashName(pokeName);
		
		curr = hash[bucket].head;
		
		while(curr != null) {
			if(curr.struct.name.contentEquals(pokeName)) {
				return curr.struct;
			} else{
				curr = curr.next;
			}
		}
		
		curr = null;
		return null;
	}
		
		
	
	public Struct fillStruct(String[] tempArr) {//fills the base struct with values
		
		Struct struct = new Struct();
		
		struct.name = tempArr[0];
		struct.number = Integer.parseInt(tempArr[1]);
		
		struct.picture = tempArr[2];
		
		struct.type1 = tempArr[3];
		struct.type2 = tempArr[4];
		
		struct.ability1 = tempArr[5];
		struct.ability2 = tempArr[6];
		struct.hiddenAbility = tempArr[7];
		
		struct.catchRate = Integer.parseInt(tempArr[8]);
		
		struct.eggGroup1 = tempArr[9];
		struct.eggGroup2 = tempArr[10];
		
		struct.baseHP = Integer.parseInt(tempArr[11]);
		struct.baseAttack = Integer.parseInt(tempArr[12]);
		struct.baseDefense = Integer.parseInt(tempArr[13]);
		struct.baseSpecialAttack = Integer.parseInt(tempArr[14]);
		struct.baseSpecialDefense = Integer.parseInt(tempArr[15]);
		struct.baseSpeed = Integer.parseInt(tempArr[16]);
		
		return struct;
		
	}
	
	public void struct(){
		
		
		
		File file = new File("PokemonData.txt");
	
		try {
			Scanner scnr = new Scanner(file);
			
			scnr.nextLine();
			
			while(scnr.hasNext()) {
				String temp = scnr.nextLine().replace("\t", "");//removes tab spaces
				String[] tempArr = temp.split(";");
				
				Struct struct = new Struct();
				
				struct = fillStruct(tempArr);//fills basic struct to be inserted in the full Node structure
				
				Hash5 h5 = new Hash5();
				
				int buck = h5.hashName(struct.name);
				
				addStruct(struct, buck);//uses the filled struct to insert it into the array
				
				
			}
			
			scnr.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
}