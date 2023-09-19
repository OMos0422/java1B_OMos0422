package course53;

public class BookControll {
	public static void main(String[] args) {

		Book book1 = new Book();

		System.out.println();

		Book book2 = new Book("ITワールド", 1000);

		System.out.println();
		System.out.println(book2.getTitle() + "は");
		System.out.println(book2.getPrice() + "円だぞ！");

	}
}