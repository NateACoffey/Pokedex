package com.Coffey.Nathan.Struct;

public class Node {
	Struct struct = new Struct();
	
	public Node(Struct struct) {
		this.struct = struct;
	}
	
	Node head = null;
	Node next = null;
	Node tail = null;
}