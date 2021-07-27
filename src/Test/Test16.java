package Test;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 최소 공배수 (두수의 공통 배수중 가장 작은 수), 최대 공약수(두수의 약수중 가장 큰수)구하기
		//
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int a=sc.nextInt();
		System.out.print("숫자를 입력하세요:");
		int b=sc.nextInt();
		int s=0;
		for(int c=2;c<=a;c++) {
			for(int d=2;d<=b;d++) {
				if(a%c==0&&b%d==0) {
					if(c==d) {
						System.out.println(c+"-"+d);
						s=c;
						
					}
				}
			}
			
		}System.out.println("최대공약수:"+s);
		System.out.println("최소 공배수 :"+(a*b)/s);
	}
}
