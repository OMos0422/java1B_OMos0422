package course54_55;

import java.util.Scanner;

public class TyphoonContoroll {
	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		Typhoon ty = new Typhoon();

		Typhoon t1 = new Typhoon(1, "2020/4/8", "マラカス");
		Typhoon t2 = new Typhoon(2, "2020/4/10", "メーギー");
		Typhoon t3 = new Typhoon(3, "2020/6/30", "チャバ");
		Typhoon t4 = new Typhoon(4, "2020/7/1", "アイレー");
		Typhoon t5 = new Typhoon(5, "2020/7/28", "ソングダー");
		Typhoon t6 = new Typhoon(6, "2020/7/31", "トローセス");
		Typhoon t7 = new Typhoon(7, "2020/8/9", "ムーラン");
		Typhoon t8 = new Typhoon(8, "2020/8/12", "メアリー");
		Typhoon t9 = new Typhoon(9, "2020/8/22", "マーゴン");

		Typhoon[] TyphoonList = new Typhoon[9];

		TyphoonList[0] = t1;
		TyphoonList[1] = t2;
		TyphoonList[2] = t3;
		TyphoonList[3] = t4;
		TyphoonList[4] = t5;
		TyphoonList[5] = t6;
		TyphoonList[6] = t7;
		TyphoonList[7] = t8;
		TyphoonList[8] = t9;

		System.out.println("台風情報！！");
		System.out.println("0:通常通り" + " " + "99:手入力");
		System.out.println("どっちか選んでね！");

		int typhoon = t.nextInt();

		if (typhoon == 0) {
			for (int i = 0; i < 9; i++) {
				System.out.println(TyphoonList[i].getAsiaName());
			}

		} else if (typhoon == 99) {

			Scanner p = new Scanner(System.in);

			for (int u = 0; u < 9; u++) {

				System.out.println("台風番号を入力してね");
				int a = t.nextInt();
				if (a < 9) {
					System.out.println("台風の名前を入力してね");
					String typ = p.next();
					TyphoonList[u].setTyphoon(typ);
				}
			}

			System.out.println(TyphoonList[0].getTyphoon());
			System.out.println(TyphoonList[1].getTyphoon());
			System.out.println(TyphoonList[2].getTyphoon());
			System.out.println(TyphoonList[3].getTyphoon());
			System.out.println(TyphoonList[4].getTyphoon());
			System.out.println(TyphoonList[5].getTyphoon());
			System.out.println(TyphoonList[6].getTyphoon());
			System.out.println(TyphoonList[7].getTyphoon());
			System.out.println(TyphoonList[8].getTyphoon());

		}

	}
}