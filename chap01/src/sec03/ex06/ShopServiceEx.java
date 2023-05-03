package sec03.ex06;

public class ShopServiceEx {

	public static void main(String[] args) {
		// p.285 실행결과: 같은 ShopService 객체입니다. 출력
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}

}
