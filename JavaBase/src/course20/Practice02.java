package course20;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;

		for (int i = 0; i < num.length; i++) {
			if (num[i] > 29) {
				System.out.println(i + "番目の要素は30以上です");
			} else {
				System.out.println(i + "番目の要素は" + num[i]);
			}
		}
	}

}
