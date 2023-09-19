package course47;

import java.util.Scanner;

public class TrayCatch {

	public static void main(String[] args) {
		try {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("数値を入力してね。");
			Scanner stdIn = new Scanner(System.in);
			int x = stdIn.nextInt();

			int[] numArr = new int[3];

			numArr[1] = 10;
			numArr[2] = 20;
			numArr[3] = 30;
			numArr[4] = 40;

		} catch (Exception e) {
			System.out.println("以下のエラーを検出しました！！ぐぐるべし！！！");
			System.out.println(e);
		}

	}
}
