package lab5;

import java.util.Scanner;

public class TrafficLight {
	
  public static void main(String[] args) { 
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Select 'red' or 'green' or 'yellow' : ");
	  String str =sc.nextLine();
	  if(str.equals("red")) {
		  System.out.println("stop");
		  
	  }
	  else if(str.equals("yellow")){
		  System.out.println("ready");
	  }
	  else if(str.equals("green")) {
		  System.out.println("go");
	  }
	  
	  else {
		  System.out.println("Invalid Input");
	  }
	  
     }
}
