package com.myPacakge;
import java.io.IOException;
//This is my first change in the file to test git branching
public class MyTest {
	

	public class TestException4 {

		public void start() throws IOException{		
		}
		
		public void foo() throws NullPointerException{
			
		}
	}

	class TestException5 extends TestException4{
		
		public void start() throws Exception{
		}
		
		public void foo() throws RuntimeException{
			
		}
	}

}
