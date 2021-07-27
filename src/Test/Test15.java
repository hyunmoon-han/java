package Test;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//소수 (Prime Number)- 1과 자기자신으로 밖에는 나눠지지 않는 수
		//소~~~~~수  구하기
//		Scanner s=new Scanner(System.in);
//		System.out.println("정수를 입력하세요:");
//		int a=s.nextInt();
//		int c=0;
//		for (int a=2;a<=1000;a++) {
//			for(int b=2;b<=a;b++) {
//				if(a%b==0) {
//					c++;    // 갯수
//				}
//		}
//		if(c==1) {
//			System.out.print("요놈이 소수.");
//			System.out.println(a);
//		}
//		c=0;
//	}
		
		for(int a=2;a<=1000;a++) {
			int b;
			for(b=2;b<a;b++) {
				if(a%b==0) {
					break;
				}
			}if(a==b) {
				System.out.println(a);
			}
		}
			
		
		
		
}
}


