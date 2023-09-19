package course20;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		int sum = 0;
		//左側に取り出した単品
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum = sum + num[i];
		}
		System.out.println(sum);

	}

}
