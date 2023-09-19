package course06;
       //Scannerパーツの取り付け
import java.util.Scanner;

public class Ouyou {
	public static void main(String[] args) {
       //Scanner使用準備
		Scanner stdIn = new Scanner(System.in);

		System.out.println("xの値を入力してください");
       //Scanner使用(キーボード入力が発生する。)
       //変数「x」に入力した内容が格納される。
		int x = stdIn.nextInt();
		
		if(x >= 10) {
			System.out.println("10以上");
		} else { 
			System.out.println("小さい");
		}

		
		
		
		
	}
}
