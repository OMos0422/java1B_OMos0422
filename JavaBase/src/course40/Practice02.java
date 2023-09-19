package course40;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		for (int a = 1; a < 101; a++) {
			if (a % 2 == 0) {
				System.out.println("現在" + a + "回目のループです。" + "偶数です");
			} else {
				System.out.println("現在回" + a + "目のループです。");
			}
		}
		for (int b = 10; b > 0; b--) {
			System.out.println(b);
		}
		int sum = 0;
		for (int x = 1; x < 101; x++) {
			sum = x + sum;
		}
		System.out.println(sum);
		

	}

}
