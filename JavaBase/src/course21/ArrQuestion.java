package course21;

public class ArrQuestion {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] typhoon = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };
		System.out.println("7月の台風は" + typhoon[6] + "件です");
		for (int i = 0; i < typhoon.length; i++) {

			System.out.println("2019年" + (i + 1) + "月の台風は" + typhoon[i] + "件です。");
		}

	}

}
