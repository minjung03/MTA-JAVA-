package Day1;

// MTA ���� 2 (Q5)
public class Customer {
	
	private int id = 3; 
	// �� Ŭ���� �ȿ��� ����ϴ°Ŵ� public�� ������ �ʿ�� ����

	 public static void main(String [] args) {

	  Customer customer = new Customer();
	  // static ����� ���� �����ϵǱ� ������, static ����� ������ ���������� static�� �ƴ� �޼��峪 �ʵ�� ���ǵ��� �ʾҴ�.
	  // ��� �޼��峪 �ʵ带 static ����� �ٲٰų�, Ŭ������ ��ü�� ���� �����ؼ� �����ϴ� ������� ��ȸ**
	  
	  customer.id = 5; // customer. �� �ٿ��ָ� ����
	  customer.showId(); // customer. �� �ٿ��ָ� ����
	}
	 
	protected void showId(){
		// �������� �ʾƵ� �ȴ�
     	System.out.println(id);
	}

}
