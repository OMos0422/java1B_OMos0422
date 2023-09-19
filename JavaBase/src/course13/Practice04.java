package course13;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数値を入力してね");
		Scanner stdIn = new Scanner(System.in);
		int yy = stdIn.nextInt();
		for (int i = 0; i < yy; i++) {
			int y = yy % 2;
			if (y == 0) {
				System.out.println("偶数だよ");
			} else if (y == 1) {
				System.out.println("奇数だよ");
			} else if (y == 100) {
				System.out.println("何回引くの");
			}

		}

	}

}