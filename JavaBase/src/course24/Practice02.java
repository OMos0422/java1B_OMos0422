package course24;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 30;
		bai(a);
		String moji = "引数だよー";
		moji(moji);
		int r = 50;
		int t = 40;
		niko(r, t);
		int tensu = 100;
		callMethod(tensu);

	}

	static void bai(int b) {
		System.out.println(b);
	}

	static void moji(String v) {
		System.out.println(v);
	}

	static void niko(int f, int i) {
		System.out.println(f + i);
	}

	static void callMethod(int tensu) {
		System.out.println(tensu);
	}
}
