package course25;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = modoOne(134);
		System.out.println(i);
		String t = modoriTwo("文字！");
		System.out.println(t);
		int z = modoPraThree(333, 555);
		System.out.println(z);

	}

	static int modoOne(int x) {
		int num = x + 100;
		return num;
	}

	static String modoriTwo(String c) {
		String moji = c + "を受け取りました";
		return moji;
	}

	static int modoPraThree(int r, int w) {

		int sum = r + w;
		return sum;
	}

}
