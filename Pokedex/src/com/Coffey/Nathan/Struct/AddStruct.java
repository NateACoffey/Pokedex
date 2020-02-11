package com.Coffey.Nathan.Struct;

class AddStruct {
	void addStruct(Struct s, int bucket) {
		
		Node node = new Node(s);//inputs struct into the node
		
		Node[] hash = FillStruct.hash;
		
		if(hash[bucket] == null) { //checks first node in bucket
			
			
			node.head = node;
			node.tail = node;
			
			hash[bucket] = node;
			
		}else {
			
			hash[bucket].tail.next = node;	//assigns the current node after the tail node
			hash[bucket].tail = node;		//then moves the tail to the current node
		}
		
		
	}
}
