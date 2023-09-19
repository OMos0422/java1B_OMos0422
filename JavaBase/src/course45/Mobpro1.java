package course45;

public class Mobpro1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numExArr = { 10, 50, 30, 20, 40 };
		int x = numExArr[0];

		numExArr[0] = numExArr[4];

		numExArr[4] = x;

		System.out.println(numExArr[0]);
		System.out.println(numExArr[4]);

	}

}
