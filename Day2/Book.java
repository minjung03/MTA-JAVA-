package Day2;

// Q10
public class Book {

	String title;
	String author;
	void show() {
		System.out.println(title+" "+author);
	}
	
	public Book() {
		this("","");
		System.out.println("������ ȣ���");
	}
	
	public Book(String title) {
		this(title,"�۰��̻�");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("�����","�������丮");
		Book loveStory = new Book("������","�������丮");
		Book emptyBook = new Book();
		loveStory.show();
	}
}
