package course40;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = { 10, 20, 30, 40, 50 };
		
		String[] cities = { "東京", "大阪", "千葉", "神奈川", "埼玉笑" };
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
		int sum = 0;
		for (int a = 0; a < numbers.length; a++) {
			sum = numbers[a] + sum;
		}
		System.out.println(sum);
		int max = 0;
		for (int b = 0; b < numbers.length; b++) {
			if (numbers[b] > max) {
				max = numbers[b];
			}
			System.out.println(max);

		}
		int[] numbers2 = { 11, 20, 31, 40, 51 };
		for (int c = 0; c < numbers2.length; c++) {
			if (numbers2[c] % 2 != 0) {
				System.out.println(numbers[c]);
			}

		}

	}

}
