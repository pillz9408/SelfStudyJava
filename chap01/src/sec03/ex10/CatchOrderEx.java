package sec03.ex10;

public class CatchOrderEx {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println("result: "+result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array 부족");			
		}catch(Exception e){
			System.out.println("there's Error");
		}finally {
			System.out.println("please Rerun");
		}

	}

}
