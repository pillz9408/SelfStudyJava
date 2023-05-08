package sec03.ex11;

public class SubStringEx {

	public static void main(String[] args) {
		//주어진 인덱스에서 문자열울 추출하는 substring()
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
				
	}

}
