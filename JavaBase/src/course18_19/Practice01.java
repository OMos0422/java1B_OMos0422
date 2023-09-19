package course18_19;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		String[] mygroup = new String[3];
		//慣れよう問題１
		System.out.println("慣れよう問題１");
		mygroup[0] = "藤田";
		mygroup[1] = "鈴木";
		mygroup[2] = "根本";

		for (int i = 0; i < 3; i++) {
			System.out.println("mygroupは" + mygroup[i] + "だ!");
		}
		//慣れよう問題２
		System.out.println("慣れよう問題２");
		int[] mygroupnum = new int[3];
		mygroupnum[0] = 7;
		mygroupnum[1] = 14;
		mygroupnum[2] = 21;
		for (int f = 0; f < 3; f++) {
			System.out.println("mygroupnumは" + mygroupnum[f] + "だ!");
			//慣れよう問題３
			System.out.println("慣れよう問題３");
			int[] myNum = new int[3];
			myNum[0] = 10;
			myNum[1] = 50;
			myNum[2] = myNum[0] + myNum[1];
			for(int g = 0; g <3; g++) {
				System.out.println(myNum[g]);
			}
			//慣れよう問題４
			System.out.println("慣れよう問題４");
			int[] myNumScan = new int[3];
			myNumScan[0] = 10;
			myNumScan[1] = stdIn.nextInt();
			myNumScan[2] = myNumScan[1] + myNumScan[1];

			for (int l = 0; l < 3; l++) {
				System.out.println(myNumScan[2]);
			}

		}

	}

}
