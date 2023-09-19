package course18_19;
import java.util.Scanner;
public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int[] numArray = new int[3];
		numArray[0] = 10;
		numArray[1] = 11;
		numArray[2] = 12;
		for (int i = 0; i < 3; i++) {
			System.out.println("numArrayは"+numArray[i]);
		}
		//ちなみに、こうも書ける。
		int[] array = new int[3];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		//慣れよう問題５
		System.out.println("慣れよう問題５");
		int[]numArray2 = new int[stdIn.nextInt()];
		System.out.println(numArray[stdIn.nextInt()]);
	}

}
