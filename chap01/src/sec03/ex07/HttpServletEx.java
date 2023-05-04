package sec03.ex07;

public class HttpServletEx {

	public static void main(String[] args) {
		method(new LoginServlet()); //로그인 합니다.
		method(new FileDownServlet()); //파일 다운로드합니다.
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
