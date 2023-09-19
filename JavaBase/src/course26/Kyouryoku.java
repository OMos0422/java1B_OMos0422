package course26;

import java.util.Random;

public class Kyouryoku {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random stdIn = new Random();
		int a = stdIn.nextInt(13) + 1;
		int b = stdIn.nextInt(13) + 1;
		//		dispResult(x,y,z);
		double r = Shouritu(a, b);
	
		System.out.println(r + "%");
	}

	static void dispResult(int x, int y, int z) {
		System.out.println("現在のゲーム数" + x);
		System.out.println("現在の勝利数" + y);
		System.out.println("現在の敗北数" + z);

	}

	static double Shouritu(int u, int t) {
		//勝利数÷勝負数
		System.out.println(u);
		System.out.println(t);
		double f = u / t;
		return f;
	}
}
