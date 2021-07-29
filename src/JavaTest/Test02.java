package JavaTest;

import java.util.ArrayList;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test03 s1=new Test03();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			a.add(i);
		}
		System.out.println(a);
		int result=s1.sum1(a);
		System.out.println(result);
	}

}
