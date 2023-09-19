package course10;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("xは");
		int c = stdIn.nextInt();
		int x = 2;
		System.out.println("yは");
		int r = stdIn.nextInt();
		int y = 3;
		if (x > y) {
			System.out.println("xがでかい！なぜならxは" + x + "でxは" + y + "だから");
		} else if (y > x) {
			System.out.println("yがでかい！なぜならyは" + y + "でxは" + x + "だから");
		} else {
			System.out.println("おなじー");
		}
		
		System.out.println("数値を入力");
		int b = stdIn.nextInt();
		int num = x % 2;
		if (x == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
		

	}

}
