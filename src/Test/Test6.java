package Test;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//값을 입력하여 점수별로 출력하는예
		Scanner s= new Scanner(System.in);
		System.out.print("값을 입력하세요:");
		String str=s.nextLine();//문자열 입력				
		int c=Integer.parseInt(str);//문자열 정수로 변환
		
		if(c>89) {System.out.println("A");}
		else if(c>79) System.out.println("B");
		else if(c>69) System.out.println("C");
		else if(c>59) System.out.println("D");
		else System.out.println("f");
		//스위치문에서 case 는 계산식 불가 -0> switch ()에서 계산식 결과 사용 예제
//		switch(c/10) {	
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("B");
//			break;
//		case 6:
//			System.out.println("B");
//			break;	
//		default:
//			System.out.println("탈락");
			
		}
	}


