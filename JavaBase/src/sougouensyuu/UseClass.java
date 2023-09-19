package sougouensyuu;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Trainer trainer = new Trainer();
		Pocketon pocketon = new Pocketon("", "", 0, 0);
		Battle ba = new Battle();

		while (true) {

			System.out.println("メニュー");
			System.out.println("1:捕獲");
			System.out.println("2:図鑑を見る");
			System.out.println("3:バトル");

			int k1 = stdIn.nextInt();

			if (k1 == 1) {

				System.out.println("ポケ〇ンの名前を設定");
				pocketon.name = stdIn.next();

				System.out.println("ポケ〇ンのタイプを設定");
				System.out.println("炎、水、地面、草から選ぶ");
				pocketon.type = stdIn.next();

				System.out.println("戦闘力を設定!!");
				pocketon.power = stdIn.nextInt();

				System.out.println("捕獲難易度を設定してね！");
				pocketon.difficult = stdIn.nextInt();

				trainer.Capture(pocketon);

				pocketon.display();

			} else if (k1 == 2) {

				trainer.display();

			} else if (k1 == 3) {

				try {

					System.out.println("手持ちのポケ〇ン2体を入力");
					String b = stdIn.next();
					int i = 0;
					for (i = 0; (!(trainer.myPockes[i].name.equals(b))) && i < 6; i++) {
					}
					Pocketon d1 = trainer.myPockes[i];

					String b2 = stdIn.next();
					int i2 = 0;
					for (i2 = 0; (!(trainer.myPockes[i2].name.equals(b2))) && i2 < 6; i2++) {
					}
					Pocketon d2 = trainer.myPockes[i2];

					String name = ba.doBattle(d1, d2);
					System.out.println("勝者は" + name);

				} catch (Exception e) {

					System.out.println("その名前のポケ〇ンは存在しません");
				}

			} else if (k1 == 99) {
				System.err.println("GGです！");
				break;
			}
		}

	}

}