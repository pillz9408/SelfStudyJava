package sec03.ex11;

public class StringToLowerUpperEx {

	public static void main(String[] args) {
		// Upper, Lower method Ex
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String upperStr1 = str1.toUpperCase();
		String upperStr2 = str2.toUpperCase();
		System.out.println(upperStr1.equals(upperStr2));

	}

}
