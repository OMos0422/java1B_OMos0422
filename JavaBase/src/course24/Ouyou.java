package course24;

import java.util.Scanner;

public class Ouyou {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1:足し算");
		System.out.println("2:引き算");
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		plus(a, b);

	}

	static void plus(int a, int b) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		if (x == 1) {
			System.out.println(a + b);
		} else if (x == 2) {
			System.out.println(a - b);
		}
	}
}
