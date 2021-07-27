package Test;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//합계구하기
//		int sum=0;
//		for(int i=1;i<=100;i++) {
//			sum=sum+i;
//		}
//		System.out.println("합계:"+sum);
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int small=0;
		if(m>n)small=n;
		else small=m;
		int least=1;
		int i;
		do {
			for( i=2;i<=small;i++) {
				if(m%i==0&&n%i==0) {
					least=least*i;
					m=m/i;
					n=n/i;
					break;
				}
			}
		}while(i<=small&&m!=1&&n!=1);
		System.out.println("최소공배수["+(m*n)/least+"]");
		System.out.println("최대 공약수"+least);
		
	}

}
