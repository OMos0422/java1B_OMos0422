package sougouensyuu;

import java.util.Random;

public class Trainer {

	String name;
	static int p;

	Pocketon[] myPockes;

	Trainer() {

		name = null;
		myPockes = new Pocketon[6];

	}

	void Capture(Pocketon pocke) {

		Random rand = new Random();

		int x = rand.nextInt(10) + 1;
		if (pocke.difficult < x) {

			System.out.println("捕獲成功!");

			Pocketon pocke1 = new Pocketon(pocke.name, pocke.type, pocke.power, pocke.difficult);

			myPockes[p++] = pocke1;

			pocke.getted = p;

		} else {

			System.out.println("捕獲失敗......");

		}

	}

	void display() {

		try {

			System.out.println(myPockes[0].name);
			System.out.println(myPockes[1].name);
			System.out.println(myPockes[2].name);
			System.out.println(myPockes[3].name);
			System.out.println(myPockes[4].name);
			System.out.println(myPockes[5].name);

		} catch (Exception e) {

		}
	}

}