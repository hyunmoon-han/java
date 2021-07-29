package JavaTest;

import java.util.ArrayList;

public class Test03 {
	int a1=0;
	ArrayList<Integer> v=new ArrayList<Integer>();
	int sum1(ArrayList<Integer> v) {
		for(int i=0;i<v.size();i++) {
			a1=a1+v.get(i);
		}
		return a1;
		
	}
}
