package com.Coffey.Nathan.Struct;

public class Hash5 {
	
	public int hashName(String name) { //hashes names of pokemon for array insertion
		int numb = 0;
        
        for(int i = 0; i < name.length(); i++){ 
            
            int temp = name.charAt(i);
            
            numb += temp * (int)Math.pow(7, i);
        }
        
        return Math.abs(numb % 890);
		
	}
}
