package course54_55;

public class BookControll {
	public static void main(String[] args) {

		int[] arr = { 10, 11, 12, 13, 14 };
		System.out.println(arr[3]);

		Book book = new Book();
		System.out.println();
		Book book1 = new Book("明解Java", 1500);

		System.out.println(book1.getPrice());

		System.out.println();

		Book book2 = new Book("ITパスポート試験", 2500);
		System.out.println();
		Book book3 = new Book("30時間でマスターVisual Basic", 1200);
		System.out.println();
		Book book4 = new Book("確かな力が身につくC言語", 2800);
		
		Book [] hondana = new Book [5];
		
		hondana [0] = book;
		hondana [1] = book1;
		hondana [2] = book2;
		hondana [3] = book3;
		hondana [4] = book4;

	}
}