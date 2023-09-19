package course41;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		for (int i = 1; i < 6; i++) {
			System.out.println(i+"回目のループで。");
		}
		int a = stdIn.nextInt();
		if(a >= 50) {
			System.out.println("50以上です。");
		} else {
			System.out.println("49以下です。");
		}
		boolean isRaining = true;
		if(isRaining) {
			System.out.println("傘持ってけーーー");
		} else {
			System.out.println("良い1日を！");
		}

	}

}
