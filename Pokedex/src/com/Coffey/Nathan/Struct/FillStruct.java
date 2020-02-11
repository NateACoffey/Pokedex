package com.Coffey.Nathan.Struct;


class FillStruct {
	
	static final int pokeTotal = 890;
	static Node[] hash = new Node[pokeTotal];
		
	
	Struct fillStruct(String[] tempArr) {//fills the base struct with values
		
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
	
}
