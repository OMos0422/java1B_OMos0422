package course13;

import java.util.Scanner;

public class Practice04answer {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数値を入力してね");
		Scanner stdIn = new Scanner(System.in);
		int yy = stdIn.nextInt();
		for (int i = 1; i < yy; i++) {
			int y = i % 2;
			if (y == 0 && yy != 0) {
				System.out.println(i + "偶数");
			}

		}

	}

}