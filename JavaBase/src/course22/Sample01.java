package course22;
import java.util.Arrays;
class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] arr = new int[3][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;

		System.out.println(arr[1][0]);
		//サンプル問題1
		int[][] x = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		System.out.println(x[1][2]);
		//サンプル問題2
		int[][] y = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		if (y[2][0] > 50) {
			System.out.println("大きいです");
		}
		//サンプル問題3
		int sum = 0;
		int[][] z = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		sum = z[1][1] + z[2][2];
		System.out.println(sum);
		//サンプル問題4
		System.out.println(Arrays.deepToString(arr));

	}

}
