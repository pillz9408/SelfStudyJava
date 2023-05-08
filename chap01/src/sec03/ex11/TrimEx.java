package sec03.ex11;

public class TrimEx {

	public static void main(String[] args) {
		// 문자열 앞뒤 공백 잘라내기 trim()
		
		String tel1 = "   010   ";
		String tel2 = "1234    ";
		String tel3 = "    1234";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);

	}

}
