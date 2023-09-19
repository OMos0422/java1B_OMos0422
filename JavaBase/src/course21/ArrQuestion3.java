package course21;

import java.util.Scanner;

public class ArrQuestion3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		//台風
		int[] typhoon = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };
		//地震
		int[] quake = { 153, 127, 130, 109, 118, 164, 130, 103, 103, 104, 123, 141 };
		//降水量
		int[] rain = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };
		System.out.println("見たい情報を選んでください");
		System.out.println("1:台風件数" + "2:地震件数" + "3:降水量");
		int x = stdIn.nextInt();
		System.out.println("年別か月別かを選んでください。");
		System.out.println("1:年別");
		System.out.println("2:月別");
		int y = stdIn.nextInt();
		if (x == 1) {
			if ( y == 2) {
				int sum = 0;
				for (int i = 0; i < typhoon.length; i++) {
					sum = sum+typhoon[i];
					System.out.println("1年間に起こった台風の件数は"+ sum + "件です。");
					System.out.println("見たい月を入力してください。");
				}
			}
		}
	}
}
	

