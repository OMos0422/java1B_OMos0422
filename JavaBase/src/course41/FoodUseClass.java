package course41;

import java.util.Scanner;

public class FoodUseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		//模擬テスト16
		Food food = new Food();
		System.out.println("食べ物の名前を設定");
		food.name = stdIn.next();
		System.out.println("値段を設定");
		food.price = stdIn.nextInt();

		food.display();

		Food food1 = new Food();
		System.out.println("食べ物の名前を設定");
		food1.name = stdIn.next();
		System.out.println("値段を設定");
		food1.price = stdIn.nextInt();
		Food food2 = new Food();
		System.out.println("食べ物の名前を設定");
		food2.name = stdIn.next();
		System.out.println("値段を設定");
		food2.price = stdIn.nextInt();
		Food food3 = new Food();
		System.out.println("食べ物の名前を設定");
		food3.name = stdIn.next();
		System.out.println("値段を設定");
		food3.price = stdIn.nextInt();
		Food food4 = new Food();
		System.out.println("食べ物の名前を設定");
		food4.name = stdIn.next();
		System.out.println("値段を設定");
		food4.price = stdIn.nextInt();

		Food[] menu = new Food[4];
		menu[0] = food1;
		menu[1] = food2;
		menu[2] = food3;
		menu[3] = food4;

		System.out.println(menu[0].name);
		System.out.println(menu[1].name);
		System.out.println(menu[2].name);
		System.out.println(menu[3].name);

	}

}
