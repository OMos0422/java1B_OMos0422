package course46;

import java.util.Scanner;

public class UseClass2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		Dentaku dentaku = new Dentaku();

		System.out.println("適当な数字を入力してね☆");
		int x = stdIn.nextInt();
		System.out.println("もう一回！");
		int y = stdIn.nextInt();

		dentaku.calc(x, y);

	}

}
