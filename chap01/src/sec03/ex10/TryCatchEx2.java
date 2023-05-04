package sec03.ex10;

public class TryCatchEx2 {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Out of Bounds");
			return;
		}

		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("result: " + result);
		} catch (NumberFormatException e) {
			System.out.println("Number format Exception");
		} finally {
			System.out.println("please Rerun");
		}

	}

}
