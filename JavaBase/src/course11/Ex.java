package course11;

public class Ex {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 0;
		String d = "*";
		String e = "**";
		String f = "***";
		String g = "****";

		while (i <= 100) {
			System.out.println(i);
			int h = i % 10;
			if (h == 0 && i!= 0) {
				System.out.println("10の倍数です");
			}
			i++;

		}

	}

}
