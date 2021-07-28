package JavaTest;

import java.util.ArrayList;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인스턴스 만들기
		Student s1=new Student();
		s1.name="Moon";
		s1.nClass=9;
		s1.nNumber=01000000000;
		s1.birthday="19970000";
		s1.gender="남";
		s1.mobile="010-0000-0000";
		
		System.out.println("이름:"+s1.name);
		System.out.println("학년:"+s1.nClass);
		System.out.println("번호:"+s1.nNumber);
		System.out.println("생년:"+s1.birthday);
		System.out.println("성별:"+s1.gender);
		System.out.println("모바일:"+s1.mobile);
	}

}
