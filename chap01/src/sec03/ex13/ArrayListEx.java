package sec03.ex13;

import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//String 객체 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		int size = list.size(); //저장된 총 객체수얻기
		System.out.println("list size: " +size);
		
		String skill = list.get(2);
		System.out.println("2: " +skill);
		
		for(int i=0; i<list.size(); i++) { //저장된 총 객체 수만큼 루핑
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": " + str);
		}
	}
}
