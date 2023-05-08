package sec03.ex13;

import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("JAVA");
		set.add("JDBC");
		set.add("JSP");
		set.add("SERVLET");
		set.add("iBATIS");
		set.add("JAVA"); // set에는 중복 불가. 따라서 하나의 JAVA만 저장

		int size = set.size();

		System.out.println("총 객체수: " + size);

		Iterator<String> iterator = set.iterator(); // 반복자 얻기
		while (iterator.hasNext()) { // 객체 수만큼 루핑
			String element = iterator.next(); // 1개의 객체를 가져옴
			System.out.println("\t" + element);

		}

		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("총 객체수: " + set.size());

		iterator = set.iterator();
		for (String element : set) {
			System.out.println("\t" + element);
		}

		set.clear(); // 모든 객체를 제거하고 비움
		if (set.isEmpty()) {
			System.out.println("Empty");

		}
	}
}