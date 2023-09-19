package course40;

import java.util.Scanner;

public class Pracitce01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int number = 15;
		if (number > 10) {
			System.out.println("でか！！");
		}
		int age = 20;
		if (age >= 18) {
			System.out.println("大人っすね！");
		} else {
			System.out.println("キッズだね");
		}
		int score = 85;
		if (score >= 90) {
			System.out.println("Excellent");
		} else if (score >= 80 && score < 90) {
			System.out.println("Good");
		} else {
			System.out.println("勉強しましょう。");
		}
		boolean isRaining = true;
		if (isRaining) {
			System.out.println("傘を持ってけーーー");
		} else {
			System.out.println("良い1日を！");
		}
		int num = stdIn.nextInt();
		if (num % 2 == 0) {
			System.out.println("偶数でっせ");
		} else {
			System.out.println("奇数だよ");
		}

	}

}
