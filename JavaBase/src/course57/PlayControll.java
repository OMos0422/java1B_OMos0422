package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		Random rand = new Random();

		int r1 = rand.nextInt(14) + 1;
		int r2 = rand.nextInt(14) + 1;
		int r3 = rand.nextInt(14) + 1;
		int r4 = rand.nextInt(14) + 1;

		int r5 = rand.nextInt(13) + 3;
		int r6 = rand.nextInt(13) + 3;
		int r7 = rand.nextInt(13) + 3;
		int r8 = rand.nextInt(13) + 3;

		Player me = new Player();
		Target koku = new Target();

		System.out.println("トレーニングメニュー");
		System.out.println();
		System.out.println("現在のパラメータ");
		me.setKinryoku(r1);
		me.setGakuryoku(r2);
		me.setMitame(r3);
		me.setOmosiro(r4);

		koku.setHituyouKin(r5);
		koku.setHituyouGaku(r6);
		koku.setHituyouMita(r7);
		koku.setHituyouOmo(r8);
		System.out.println();
		System.out.println("1:筋トレ");
		System.out.println("2:勉強");
		System.out.println("3:整形");
		System.out.println("4:人と喋る(面白さ)");

		for (int i = 0; i < 7; i++) {
			int m = s.nextInt();
			int rr = rand.nextInt(4) + 1;

			if (m == 1) {
				r1 = r1 + 1;
				me.setKinryoku(r1);
				me.setGakuryoku(r2);
				me.setMitame(r3);
				me.setOmosiro(r4);
				System.out.println((i + 1) + "回目");
				if (rr == 1) {
					r5 = r5 - r1;
					System.out.println("筋力は、あと" + r5 + "必要です");
				} else if (rr == 2) {
					r6 = r6 - r2;
					System.out.println("学力は、あと" + r6 + "必要です");
				} else if (rr == 3) {
					r7 = r7 - r3;
					System.out.println("見た目は、あと" + r7 + "必要です");
				} else if (rr == 4) {
					r8 = r8 - r4;
					System.out.println("面白さは、あと" + r8 + "必要です");
				}

			} else if (m == 2) {
				r2 = r2 + 1;
				me.setKinryoku(r1);
				me.setGakuryoku(r2);
				me.setMitame(r3);
				me.setOmosiro(r4);
				System.out.println((i + 1) + "回目");
				if (rr == 1) {
					r5 = r5 - r1;
					System.out.println("筋力は、あと" + r5 + "必要です");
				} else if (rr == 2) {
					r6 = r6 - r2;
					System.out.println("学力は、あと" + r6 + "必要です");
				} else if (rr == 3) {
					r7 = r7 - r3;
					System.out.println("見た目は、あと" + r7 + "必要です");
				} else if (rr == 4) {
					r8 = r8 - r4;
					System.out.println("面白さは、あと" + r8 + "必要です");
				}
			} else if (m == 3) {
				r3 = r3 + 1;
				me.setKinryoku(r1);
				me.setGakuryoku(r2);
				me.setMitame(r3);
				me.setOmosiro(r4);
				System.out.println((i + 1) + "回目");
				if (rr == 3) {

					if (rr == 1) {
						r5 = r5 - r1;
						System.out.println("筋力は、あと" + r5 + "必要です");
					} else if (rr == 2) {
						r6 = r6 - r2;
						System.out.println("学力は、あと" + r6 + "必要です");
					} else if (rr == 3) {
						r7 = r7 - r3;
						System.out.println("見た目は、あと" + r7 + "必要です");
					} else if (rr == 4) {
						r8 = r8 - r4;
						System.out.println("面白さは、あと" + r8 + "必要です");
					}
				} else if (m == 4) {
					r4 = r4 + 1;
					me.setKinryoku(r1);
					me.setGakuryoku(r2);
					me.setMitame(r3);
					me.setOmosiro(r4);
					System.out.println((i + 1) + "回目");
					if (rr == 1) {
						r5 = r5 - r1;
						System.out.println("筋力は、あと" + r5 + "必要です");
					} else if (rr == 2) {
						r6 = r6 - r2;
						System.out.println("学力は、あと" + r6 + "必要です");
					} else if (rr == 3) {
						r7 = r7 - r3;
						System.out.println("見た目は、あと" + r7 + "必要です");
					} else if (rr == 4) {
						r8 = r8 - r4;
						System.out.println("面白さは、あと" + r8 + "必要です");
					}
				} else {
					System.err.println("1～4までの数字にしてください。");
					i = i - 1;
					System.err.println("最初に戻ります");
				}
			}
			System.out.println("さあ告白しましょう");
			for (int i1 = 0; i1 < 2; i1++) {
				int m1 = s.nextInt();
				int win = 0;
				if (m1 == 1) {
					if (r1 < r5) {
						System.out.println("あなたは絶望して目の前が真っ暗になった");
					} else if (r1 > r5) {
						System.out.println("勝ち");
					}
				} else if (m1 == 2) {
					me.setGakuryoku(r2);
					if (r2 < r6) {
						System.out.println("あなたは絶望して目の前が真っ暗になった");
					} else if (r2 > r6) {
						System.out.println("勝ち");
					}
				} else if (m1 == 3) {
					me.setMitame(r3);
					if (r3 < r7) {
						System.out.println("あなたは絶望して目の前が真っ暗になった");
					} else if (r3 > r7) {
						System.out.println("勝ち");
					}
				} else if (m1 == 4)
					me.setOmosiro(r4);
				if (r4 < r8) {
					System.out.println("あなたは絶望して目の前が真っ暗になった");
				} else if (r4 > r8) {
					System.out.println("勝ち");
				}
			}
		}

	}
}
