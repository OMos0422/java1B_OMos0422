package course41;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int [] numArr = {10,50,30,20,40};
		
		int max = 0;
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] > max)
				max = numArr[1];
		}
		System.out.println(max);
		
		//模擬テスト9
		
		int x = stdIn.nextInt();
		int [] variable = new int[x];
		//模擬テストEx

	}

}
