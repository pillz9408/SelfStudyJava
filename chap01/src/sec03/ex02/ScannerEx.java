package sec03.ex02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) throws Exception{
		// Scanner 예제
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" +inputData + "\"");
			if(inputData.equals("q")) { //q를 입력하면 while문 종료
				break;
			}
		}
		System.out.println("quit");

	}

}
