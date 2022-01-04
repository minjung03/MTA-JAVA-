package Day1;

// MTA 기출 2 (Q5)
public class Customer {
	
	private int id = 3; 
	// 한 클래스 안에서 사용하는거니 public로 변경할 필요는 없다

	 public static void main(String [] args) {

	  Customer customer = new Customer();
	  // static 멤버가 먼저 컴파일되기 때문에, static 멤버의 컴파일 시점에서는 static이 아닌 메서드나 필드는 정의되지 않았다.
	  // 모든 메서드나 필드를 static 멤버로 바꾸거나, 클래스의 객체를 직접 생성해서 접근하는 방법으로 우회**
	  
	  customer.id = 5; // customer. 만 붙여주면 가능
	  customer.showId(); // customer. 만 붙여주면 가능
	}
	 
	protected void showId(){
		// 변경하지 않아도 된다
     	System.out.println(id);
	}

}
