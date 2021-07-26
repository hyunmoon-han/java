package Test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		
		switch(str) {
		case "a":
		case "A":
			System.out.println("Apple");
			break;
		case "b":
		case "B":
			System.out.println("Banana");
			break;
		default:
			System.out.println("프로그램종료");
		}			
			
	}

}
