package course06;

//Scannerパーツの取り付け
import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		//Scanner使用準備
		Scanner stdIn = new Scanner(System.in);

		System.out.println("文字を入力してね");
		String moji = stdIn.next();
		String a = "国際理工";
		
		if (a.equals("国際理工")) {
			System.out.println("あなたが打ったのは国際理工だ");
		} else {
			System.out.println("国際理工じゃないなんて・・・");
		}
		
		
		
	}
}
