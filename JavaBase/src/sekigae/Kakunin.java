package sekigae;

import java.util.Random;
import java.util.Scanner;

public class Kakunin {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("1:ランダム");
		int[][] seki = new int[6][6];

		int x = stdIn.nextInt();

		int rnd1 = rand.nextInt(36) + 1;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (rnd1 == seki[i][j]) {
					//乱数再抽選
					rnd1 = rand.nextInt(36) + 1;
				} else {
					//seki[i][j] = rnd1;
				}
			}

		}

	}
}
