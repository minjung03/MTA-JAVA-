package Day1;

public class Q02 {

	public static void main(String[] args) {
		int a = 3, b=3, c=3;
		
		a += 3; // 6
		b *= 3; // 9
		c %= 2; // 1 **
		
	    System.out.println("a="+ a +", b="+b +", c="+c);
	    
	    int d = 3;
	    
	    // 이런 문제 많이 나옴**
	    
	    // 틀릴 것 같으니 유의하자 !	    
	    // 뒤에 쓰이는 연산자는 값을 사용한 뒤 변화시킨다*** 헷갈리지 말기!!
	    
	    a = d++; // 3, 4 **a의 값을 먼저 사용한 뒤 변화
	    System.out.println("a="+a+", d="+d);
	    
	    a = ++d; // 5, 5
	    System.out.println("a="+a+", d="+d);
	    
	    a = d--; // 5, 4 **a의 값을 먼저 사용한 뒤 변화
	    System.out.println("a="+a+", d="+d);
	    
	    a = --d; // 3, 3
	    System.out.println("a="+a+", d="+d);
	}
}
