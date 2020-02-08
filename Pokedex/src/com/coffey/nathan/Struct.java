package com.coffey.nathan;

class Struct {
	
	String name = "N/A";
	int number = 0;
	
	String picture = "";
	
	String type1 = "(none)";
	String type2 = "(none)";
	
	String ability1 = "(none)";
	String ability2 = "(none)";
	String hiddenAbility = "(none)";
	
	int catchRate = 0;
	
	String eggGroup1 = "(none)";
	String eggGroup2 = "(none)";
	
	int baseHP = 0;
	int baseAttack = 0;
	int baseDefense = 0;
	int baseSpecialAttack = 0;
	int baseSpecialDefense = 0;
	int baseSpeed = 0;
	
	
	public String toString() {
		return "Name: " + name
				+ "\nNumber: " + number
				+ "\nType: " + type1 + "\t" + type2
				+ "\nAbilities: " + ability1 + "\t" + ability2
				+ "\nHidden Ability: " + hiddenAbility
				+ "\nCatch rate: " + catchRate
				+ " \nEgg groups: " + eggGroup1 + " / " + eggGroup2
				+ " \nBase stats:\n" + baseHP + "\t" + baseAttack + "\t"+ baseDefense + "\t"+ baseSpecialAttack + "\t"+ baseSpecialDefense + "\t" + baseSpeed;
	}
}
