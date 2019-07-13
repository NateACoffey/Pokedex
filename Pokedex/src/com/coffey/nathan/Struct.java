package com.coffey.nathan;

public class Struct {
	
	String name;
	int number = 0;
	
	String picture;
	
	String type1;
	String type2;
	
	String ability1;
	String ability2;
	String hiddenAbility;
	
	int catchRate = 0;
	
	String eggGroup1;
	String eggGroup2;
	
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
