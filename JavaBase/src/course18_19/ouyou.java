package course18_19;

public class ouyou {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] logicArray = new int[5];
		logicArray[0] = 100;
		logicArray[1] = 50;
		logicArray[2] = 75;
		logicArray[3] = 80;
		logicArray[4] = 65;
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				System.out.println(logicArray[1]);
			} else if (i == 1) {
				System.out.println(logicArray[4]);
			} else if (i == 2) {
				System.out.println(logicArray[2]);
			} else if (i == 3) {
				System.out.println(logicArray[3]);
			} else if (i == 4) {
				System.out.println(logicArray[0]);
			}
		}

	}

}
