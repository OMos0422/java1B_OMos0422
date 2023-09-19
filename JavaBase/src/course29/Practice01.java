package course29;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Character me = new Character();

		System.out.println("プレイヤー1の名前とステータスを設定してください。");
		me.name = stdIn.next();
		me.hp = stdIn.nextInt();
		me.str = stdIn.nextInt();
		me.dex = stdIn.nextInt();
		me.def = stdIn.nextInt();
		me.agi = stdIn.nextInt();

		System.out.println("プレイヤー2の名前とステータスを設定してください。");
		Character tonari = new Character();
		tonari.name = stdIn.next();
		tonari.hp = stdIn.nextInt();
		tonari.str = stdIn.nextInt();
		tonari.dex = stdIn.nextInt();
		tonari.def = stdIn.nextInt();
		tonari.agi = stdIn.nextInt();
		
		me.viewStatus();
		tonari.viewStatus();

		me.battle(me, tonari);

	}

}