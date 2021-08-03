package Test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		while(!str.equals("x")) {
			switch(str) {
			case "A":
				System.out.println("Apple");
				break;
			case "b":
				break;
			case "B":
				System.out.println("Banana");
				break;
			default:
				System.out.println("다시 입력해:");
			}	
		str=s.nextLine();
		}
		
			
	}

}
