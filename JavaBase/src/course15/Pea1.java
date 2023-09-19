package course15;

import java.util.Random;
import java.util.Scanner;

public class Pea1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner StdIn = new Scanner(System.in);
		Random rnd = new Random();
		{
			int shojikin = 10000;
			System.out.println(shojikin);
			while (shojikin == 50000 && shojikin > 0) {
				int kakekin = StdIn.nextInt();
				int num1 = rnd.nextInt(6) + 1;
				int num2 = rnd.nextInt(6) + 1;
				int num3 = rnd.nextInt(6) + 1;
				String deme = StdIn.next();
				switch (deme) {
				case "1・1・1":
					System.out.println(kakekin * 10000);
					break;
				case "1・2・1":
				case "1・1・2":
				case "1・2・2":
				case "1・2・3":
				case "2・2・1":
				case "2・2・3":
				case "3・2・1":
				case "3・2・3":
				case "3・1・3":
				case "3・3・1":
				case "1・1・3":
				case "1・3・3":
				case "3・2・2":
				case "3・1・1":
				case "3・1・2":
				case "4・1・4":
				case "1・1・4":
				case "1・4・1":
				case "1・2・4":
				case "1・3・1":
				case "1・3・4":
				case "1・4・4":
				}
			}

		}

	}

}
