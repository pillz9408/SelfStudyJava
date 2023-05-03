package sec03.ex05;

public class ArrayCopyEx {

	public static void main(String[] args) {
		// ArrayCopy
		String old[] = {"aaa","bbb","ccc"};
		String newArray[] = new String[5];
		
		System.arraycopy(old, 0, newArray, 0, old.length);
		
		for(int i = 0; i<newArray.length; i++) {
			System.out.print(newArray[i]+ ",");
		}

	}

}
