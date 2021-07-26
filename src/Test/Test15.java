package Test;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//소수 (Prime Number)- 1과 자기자신으로 밖에는 나눠지지 않는 수
//		Scanner s=new Scanner(System.in);
//		System.out.println("정수를 입력하세요:");
//		int n=s.nextInt();
		int c=0;
		for (int a=2;a<=100;a++) {
			for(int b=2;b<=100;b++) {
				if(a%b==0) {
					c++;
				}
		}if(c==1) {
			System.out.println(a);
		}
		c=0;
	}
}
}


