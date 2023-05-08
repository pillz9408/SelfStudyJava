package sec03.ex11;

import sec03.ex06.Car;

public class ResourcePathEx {

	public static void main(String[] args) {
		// 리소스 절대경로 얻기 예제
		Class clazz = Car.class;
		
		String photoPath1 = clazz.getResource("photo1.jpg").getPath();
		String photoPath2 = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photoPath1);
		System.out.println(photoPath2);
	}

}
