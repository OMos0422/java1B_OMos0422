package course10;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("私はJavaを勉強中です。");
		Scanner stdIn = new Scanner(System.in);
		int x = 50;
		int y = 100;
		int z = x * y;
		System.out.println(z);

		System.out.println("数字を打ってね");
		int a = stdIn.nextInt();
		System.out.println(a + 100 + "と入力しました");
		System.out.println("xは");
		int c = stdIn.nextInt();
		System.out.println("yは");
		int h = stdIn.nextInt();
		if (c > h) {
			System.out.println("xがでかい！なぜならxは" + c + "でxは" + h + "だから");
		} else if (c < h) {
			System.out.println("yがでかい！なぜならyは" + h + "でxは" + c + "だから");
		} else {
			System.out.println("おなじー");
		}

		System.out.println("数値を入力");
		int b = stdIn.nextInt();
		int num = b % 2;
		if (num == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}

		int f = stdIn.nextInt();
		switch (f) {
		case 1:
			System.out.println("1番大きい数値です。");
			break;
		case 2:
			System.out.println("2番目に大きい数値です。");
			break;
		default:
			System.out.println("3番目に大きい数値です。");

		}

	}

}
