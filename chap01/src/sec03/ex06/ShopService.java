package sec03.ex06;

public class ShopService {
	/*ShopService 객체를 싱글톤을로 만들고 싶습니다. ShopServiceExample 클래스에서 
	 ShopService의 getInstance() 메소드로 싱글톤을 얻을 수 있도록 클래스를 작성해보시오
	*/
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return singleton;
	}
}
