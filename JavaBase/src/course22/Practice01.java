package course22;

import java.util.Arrays;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[][] s = { { "o", "x", "o" }, { "x", "o", "x" }, { "o", "o", "o" } };
		System.out.println(s[2][1]);

		String[][] m = { { "o", "x", "o" }, { "x", "o", "x" }, { "o", "o", "o" } };
		System.out.println(Arrays.deepToString(m));

		String[][] ss = { { "o", "x", "o" }, { "x", "o", "x" }, { "o", "o", "o" } };
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("現在の要素は" + ss[i][j]);
				if (ss[i][j].equals("o")) {
					cnt = cnt + 1;
				}
			}
			System.out.println(cnt);
		}
	}

}