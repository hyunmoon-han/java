package Test;

import java.util.ArrayList;

public class Test21 {

	public static void main(String[] args) {
		// TODO ArrayList 사용
		ArrayList<String>a=new ArrayList<String>();
		a.add("zzzz");
		a.add("gg");
		a.add("gg");
		a.add("gg");
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("\n\n");
		a.set(3, "oooo");
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		a.remove(3);
		a.remove("zzzz");
		
		System.out.println(a);
	}

}
