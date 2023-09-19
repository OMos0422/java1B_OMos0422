package course41;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		mogi();

		int a = 10;
		int b = 11;
		calc(a, b);

		String moji = "ここまで全問正解でしょう";
		String x = mojicon(moji);
		System.out.println(x);

	}

	static void mogi() {
		System.out.println("メソッド問題");
	}

	static void calc(int a, int b) {
		System.out.println(a + b);
	}

	static String mojicon(String moji) {
		String concated = moji + "を受け取りました。";
		return concated;
	}

}
