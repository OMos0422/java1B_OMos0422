package sekigae;

import java.util.Random;

public class Sekigae2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Random rnd = new Random();
		int rnd1 = rnd.nextInt(2) + 1;
		System.out.println(rnd1 + "←　乱数");

		int[] kako = new int[4];

		kako[0] = 1;

		//まだ出てない乱数を導出
		for (int i = 0; i < kako.length; i++) {
			if (rnd1 == kako[i]) {
				System.out.println((i + 1) + "番目で重複したよ");
				rnd1 = rnd.nextInt(4) + 1;
				i = -1;
			}
		}

		//すでに乱数配列を更新
		for (int i = 0; i < kako.length; i++) {
			if (kako[i] == 0) {
				kako[i] = rnd1;
				break;
			}
		}

		//座席表の配列に導出した乱数をしまう。

		//表示用
		for (int i = 0; i < kako.length; i++) {
			System.out.println(kako[i]);
		}

	}
}
