package course40;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		printHello();
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		//最初
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		//次
		int number = stdIn.nextInt();
		String name = stdIn.next();
		multiply(a, b);

		int x = multiplymodori(c, d);
		System.out.println(x);

		boolean tf = isEven(number);
		System.out.println(tf);

		String moji = getGreeting(name);
		System.out.println(moji);

	}

	static void printHello() {
		System.out.println("Hello,World");
	}

	static void multiply(int a, int b) {
		System.out.println(a + b);
	}

	static int multiplymodori(int o, int e) {
		return o * e;

	}

	static boolean isEven(int t) {
		if (t % 2 == 0) {
			return true;
		} else {
			return false;

		}
	}

	static String getGreeting(String name) {
		return "こんにちは、" + name;
	}

}
