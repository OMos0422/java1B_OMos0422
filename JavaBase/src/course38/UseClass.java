package course38;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		int arr[] = { 50, 70, 90 };
		String arr2[] = { "あ", "か", "さ" };

		Pocketon poke1 = new Pocketon();
		poke1.name = "銭カメ";
		poke1.power = 100;
		poke1.difficult = 1;
		poke1.display();

		Pocketon poke2 = new Pocketon();
		poke2.name = "不思議ループ";
		poke2.power = 200;
		poke2.difficult = 3;

		Pocketon poke3 = new Pocketon();
		System.out.println("名前を設定");
		poke3.name = stdIn.next();
		System.out.println("強さを設定");
		poke3.power = stdIn.nextInt();
		System.out.println("難易度を設定");
		poke3.difficult = stdIn.nextInt();

		Pocketon myPokes[] = new Pocketon[3];
		myPokes[0] = poke1;
		myPokes[1] = poke2;
		myPokes[2] = poke3;

		System.out.println("↓配列の表示");
		System.out.println(myPokes[1].power);
		System.out.println(myPokes[1].difficult);
		System.out.println(myPokes[2].name);
		System.out.println(myPokes[2].power);
		System.out.println(myPokes[2].difficult);

		for (int i = 0; i < 3; i++) {
			System.out.println(myPokes[i].name);
		}

		myPokes[1].display();
	}

}
