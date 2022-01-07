package Day4;

// MTA 기출 11
public class Q11 {
	public static void main(String[] args) {
		
		// 1.
		int age = 20;
		double discount;
		
		if(age >= 25) discount = 0.50;
		else if(age >= 21) discount = 0.25;
		else discount = 0.0;
		
		// case문 3개로는 변경 불가
		switch(age) {
		 case 25 : discount = 0.50; break;
		 case 24 : case 23 : case 22 :
		 case 21 : discount = 0.25; break;
		 default : discount = 0.0;
		}
		
		
		// 2.		
		String grade = "A";
		String message;
		
		if(grade == "A") message = "표준초과";
		else if(grade == "B") message = "표준충족";
		else message = "개선 필요";
		
		// case문 3개로 변경 가능
		switch(grade) {
		 case "A" : message = "표준초과"; break;
		 case "B" : message = "표준충족"; break;
		 default : message = "개선필요"; break;
		}
		
		
		// 3.
		double gpa = 5.0;
		int priority;
		
		if(gpa == 4.0) priority = 1;
		else if(gpa == 3.0) priority = 2;
		else priority = 3;
		
		// 조건이 실수이기 때문에 switch-case문으로 변경 불가능
		/* switch(gpa) { - Cannot switch on a value of type double 오류 발생
		 case 4.0 : priority = 1; break;
		 case 3.0 : priority = 2; break;
		 default : priority = 3; break;
		}
		*/
	}
}
