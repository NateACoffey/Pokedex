package com.coffey.nathan;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		
		FillStruct data = new FillStruct();
		
		data.struct();
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println(data.findStruct("Butterfree"));
		
		scnr.close();
		
	}

}
