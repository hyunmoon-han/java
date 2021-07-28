package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList 예제
		// 점수를 입력해서 총합과 평균 구하기!
		Scanner s = new Scanner(System.in);
		System.out.print("수학점수를 입력하세욘:");
		int m = s.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		while (m != -1) {
			a.add(m);
			System.out.print("수학점수를 입력하세욘:");
			m = s.nextInt();
		}
		System.out.println("수학점수목록:" + a);
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i);
		}
		System.out.println("총합계:" + sum);
		System.out.println("평균:"+sum/a.size());
	}

}
