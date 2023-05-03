package sec03.ex02;

import java.util.Scanner;

public class ScannerExQuiz {

	public static void main(String[] args) {
		// Scanner를 이용해서 이름, 주민번호앞 6자리, 전화번호를 키보드에서 입력받고 출력하는 코드를 작성해보시오(p99)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String num = scanner.nextLine();
		
		System.out.print("3. 전화번호: ");
		String tel = scanner.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println("1. 이름: "+name);
		System.out.println("2. 주민번호 앞 6자리: "+num);
		System.out.println("3. 전화번호: "+tel);
		
	}

}
