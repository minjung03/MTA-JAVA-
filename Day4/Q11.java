package Day4;

// MTA ���� 11
public class Q11 {
	public static void main(String[] args) {
		
		// 1.
		int age = 20;
		double discount;
		
		if(age >= 25) discount = 0.50;
		else if(age >= 21) discount = 0.25;
		else discount = 0.0;
		
		// case�� 3���δ� ���� �Ұ�
		switch(age) {
		 case 25 : discount = 0.50; break;
		 case 24 : case 23 : case 22 :
		 case 21 : discount = 0.25; break;
		 default : discount = 0.0;
		}
		
		
		// 2.		
		String grade = "A";
		String message;
		
		if(grade == "A") message = "ǥ���ʰ�";
		else if(grade == "B") message = "ǥ������";
		else message = "���� �ʿ�";
		
		// case�� 3���� ���� ����
		switch(grade) {
		 case "A" : message = "ǥ���ʰ�"; break;
		 case "B" : message = "ǥ������"; break;
		 default : message = "�����ʿ�"; break;
		}
		
		
		// 3.
		double gpa = 5.0;
		int priority;
		
		if(gpa == 4.0) priority = 1;
		else if(gpa == 3.0) priority = 2;
		else priority = 3;
		
		// ������ �Ǽ��̱� ������ switch-case������ ���� �Ұ���
		/* switch(gpa) { - Cannot switch on a value of type double ���� �߻�
		 case 4.0 : priority = 1; break;
		 case 3.0 : priority = 2; break;
		 default : priority = 3; break;
		}
		*/
	}
}
