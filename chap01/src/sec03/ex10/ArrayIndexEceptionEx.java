package sec03.ex10;

public class ArrayIndexEceptionEx {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException 처리방법
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("arg[0]:" +data1);
			System.out.println("arg[1]:" +data2);			
		}else {
			System.out.println("두 개의 실행 매개값이 필요합니다.");
		}

	}

}
