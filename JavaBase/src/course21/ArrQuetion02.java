package course21;

import java.util.Scanner;

public class ArrQuetion02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		//台風
		int[] typhoon = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };
		//地震
		int[] quake = { 153, 127, 130, 109, 118, 164, 130, 103, 103, 104, 123, 141 };
		//降水量
		int[] rain = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };
		System.out.println("1:台風件数" + "2:地震件数" + "3:降水量");
		int x = stdIn.nextInt();
		System.out.println("年別か月別かを選んでください。");
		System.out.println("1:年別");
		System.out.println("2:月別");
		int m = stdIn.nextInt();
		if (m == 2)
			System.out.println("見たい月を入力してください。");
		int y = stdIn.nextInt();
		int z = stdIn.nextInt();
		if (y == 1) {
			System.out.println("1年間に起こった台風の総合計は29件です。");
			if (x == 1 && y == 2) {

				for (int i = 0; i < typhoon.length; i++) {
					System.out.println("2019年" + (i + 1) + "月の台風は" + typhoon[i] + "件です。");
				}

			}
			if (x == 2 && y == 2) {
				for (int o = 0; o < quake.length; o++) {
					System.out.println((o + 1) + "月の地震件数は" + quake[o] + "件です。");
				}
			}
			if (x == 3 && y == 2) {
				for (int u = 0; u < rain.length; u++) {
					System.out.println((u + 1) + "月の降水量は" + rain[u] + "mmです。");
				}
			}

		}
	}
}
