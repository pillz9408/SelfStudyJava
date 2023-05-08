package sec03.ex11;

public class StrLengthEx {

	public static void main(String[] args) {
		//Lenght Example
		String ssn = "7306241230123";
		int len = ssn.length();
		if(len == 13) {
			System.out.println("Ok");
		}else {
			System.out.println("Wrong SSN number");
		}

	}

}
