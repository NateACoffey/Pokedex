package com.Coffey.Nathan.Struct;

public class Node {
	private Struct struct = new Struct();
	
	public Node(Struct struct) {
		this.struct = struct;
	}
	
	public Node() {
		this.struct = null;
	}
	
	Node head = null;
	Node next = null;
	Node tail = null;
	
	
	public String getName() {
		return struct.name;
	}
	
	public int getNumber() {
		return struct.number;
	}
	
	public String getPicture() {
		return struct.picture;
	}
	
	public String getType1() {
		return struct.type1;
	}
	
	public String getType2() {
		return struct.type2;
	}
	
	public String getAbility1() {
		return struct.ability1;
	}
	
	public String getAbility2() {
		return struct.ability2;
	}
	
	public String getHiddenAbility() {
		return struct.hiddenAbility;
	}
	
	public int getCatchRate() {
		return struct.catchRate;
	}
	
	public String getEggGroup1() {
		return struct.eggGroup1;
	}
	
	public String getEggGroup2() {
		return struct.eggGroup2;
	}
	
	public int getBaseHP() {
		return struct.baseHP;
	}
	
	public int getBaseAttack() {
		return struct.baseAttack;
	}
	
	public int getBaseDefense() {
		return struct.baseDefense;
	}
	
	public int getBaseSpecialAttack() {
		return struct.baseSpecialAttack;
	}
	
	public int getBaseSpecialDefense() {
		return struct.baseSpecialDefense;
	}
	
	public int getBaseSpeed() {
		return struct.baseSpeed;
	}
	
}
