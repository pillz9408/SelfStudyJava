package sec03.ex02;

public class VariableUseEx {

	public static void main(String[] args) {
		int hour = 3;
		int min = 5;
		System.out.println(hour + "시간" + min + "분");
		
		int totalMin = (hour*60) + min;
		System.out.println("총 "+ totalMin + "분");
	}

}
