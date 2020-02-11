package com.Coffey.Nathan.Struct;

public class FindStruct {
	
	Node curr = null;
	
	public Node findStruct(String pokeName) {
		
		Node[] hash = FillStruct.hash;
		
		pokeName = pokeName.toLowerCase();
		
		
		Hash5 h5 = new Hash5();
		int bucket = h5.hashName(pokeName);
		
		curr = (hash[bucket] != null) ? hash[bucket].head : null ;	//verifies the bucket is not null
		
		while(curr != null) {
			if(curr.getName().toLowerCase().contentEquals(pokeName)) {
				return curr;
			} else{
				curr = curr.next;
			}
		}
		
		curr = null;
		return null;
	}
}
