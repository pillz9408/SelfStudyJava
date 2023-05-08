package sec03.ex11;

public class IndexOfEx {

	public static void main(String[] args) {
		// indexOf()
		String str = "java programing";
		
		int location = str.indexOf("programing");
		System.out.println(location);
		
		if(str.indexOf("java") != -1) {
			System.out.println("it's java program");
		}else {
			System.out.println("no java program");
		}
	}

}
