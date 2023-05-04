package sec03.ex10;

public class TryCatchEx01 {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e){
			System.out.println("Class Not Found");
			
		}

	}

}
