package course18_19;

public class Ouyouquestion {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] logicArray = new int[5];
		logicArray[0] = 100;
		logicArray[1] = 50;
		logicArray[2] = 75;
		logicArray[3] = 80;
		logicArray[4] = 65;
		int savepoint = 0;
		for (int i = 0; i < 4; i++) {
			if (logicArray[i] > logicArray[i + 1]) {
				savepoint = logicArray[i];
				logicArray[i] = logicArray[i + 1];
				logicArray[i + 1] = savepoint;
			} else if (logicArray[i] > logicArray[i + 2]) {
				savepoint = logicArray[i + 2];
				logicArray[i] = logicArray[i + 2];
				logicArray[i + 2] = savepoint;
			}
		}
		//中身確認用
		for (int i = 0; i < 5; i++) {
			System.out.println(logicArray[i]);
		}

	}

}
