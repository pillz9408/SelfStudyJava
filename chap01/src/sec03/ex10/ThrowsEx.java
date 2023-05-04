package sec03.ex10;

public class ThrowsEx {

	public static void main(String[] args) {
		// throws 예제
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("Class doesn't exist");
		}

	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}

}
