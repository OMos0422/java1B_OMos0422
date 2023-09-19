package course05;

//Scannerパーツの取り付け
import java.util.Scanner;

public class Sample01 {
	public static void main(String[] args) {
		//Scanner使用準備
		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyを加算します");

		System.out.println("xの値を入力してください");
		//Scanner使用(キーボード入力が発生する。)
		//変数「x」に入力した内容が格納される。
		double x = stdIn.nextDouble();

		System.out.println("yの値を入力してください");

		double y = stdIn.nextDouble();

		//int z を作成し、キーボードから入力した値を格納する。
		System.out.println("zの値を入力してください");

		int z = stdIn.nextInt();

		System.out.println("x + y =" + (x + y));
	}
}
