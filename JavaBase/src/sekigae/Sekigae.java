package sekigae;

import java.util.Random;
import java.util.Scanner;

public class Sekigae {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("席替えプログラム");
		System.out.println("1:ランダム");
		System.out.println("2:指定");

		int x = stdIn.nextInt();

		if (x == 1) {

			int[][] se = new int[6][6];
			for (int z1 = 0; z1 < 6; z1++) {
				for (int z2 = 0; z2 < 6; z2++) {
					se[z1][z2] = z1 * 6 + z2 + 1;
				}
			}
			for (int roop = 0; roop < 999; roop++) {
				int s = rand.nextInt(5) + 0;
				int e = rand.nextInt(5) + 0;
				int k = rand.nextInt(5) + 0;
				int i = rand.nextInt(5) + 0;
				int ki = se[s][e];
				se[s][e] = se[k][i];
				se[k][i] = ki;
			}
			for (int a = 0; a < 36; a++) {
				if (se[a / 6][a % 6] < 10) {
					System.out.print(" ");
				}
				System.out.print(" " + se[a / 6][a % 6] + " ");
				if (a % 6 == 5) {
					System.out.println();
				} else {
					System.out.print(",");
					System.out.println("これで確定ですか？");
					System.out.println("1:確定");
					System.out.println("2:変更");
				}
			}
		}
	}

}