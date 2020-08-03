package com.myPacakge;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
public static void main(String [] args) {

	try {
		testExceptions();
	} catch ( FileNotFoundException e) {
		e.printStackTrace();
	} catch( IOException f ) {
		
	}
}

public static void testExceptions() throws FileNotFoundException, IOException{
	
}
}
