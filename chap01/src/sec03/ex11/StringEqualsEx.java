package sec03.ex11;

public class StringEqualsEx {
	public static void main(String[] args) {
		String str1 = new String("name");
		String str2 = "name";
		
		if(str1 == str2) {
			System.out.println("same String instance");
		}else {
			System.out.println("diffrent String instance");
		}
		
		if(str1.equals(str2)) {
			System.out.println("same String");
		}else {
			System.out.println("diffrent String");
		}
	}

}
