package sec03.ex11;

import sec03.ex06.Car;

public class ClassExample {

	public static void main(String[] args) {
		// 클래스 객체 얻기 getClass(), forName()
		
		// 1.
		Class clazz = Car.class;
		
		//2. 
		//Class clazz = Class.forName("sec03.ex06.Car");
		
		//3.
		//Car car = new Car;
		//Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
