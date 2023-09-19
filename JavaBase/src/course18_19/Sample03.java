package course18_19;

public class Sample03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String a = "大野";
		String b = "谷口";
		String c = "根本";
		String d = "藤田";
		String e = "鈴木";
		//隣の島
		String f = "坂本";
		String g = "伊藤";
		String h = "安田";
		String i = "藤平";
		
		//配列の鉄板文法
		//[]の事を要素と呼ぶ。要素は0から始まる。

		String[] nameList = new String[10];
		nameList[0] = "やすだ";
		nameList[1] = "ねもと";
		nameList[2] = "ながなわ";
		nameList[3] = "ながなわ";
		nameList[4] = "ながなわ";
		nameList[5] = "ながなわ";
		nameList[6] = "ながなわ";
		nameList[7] = "ながなわ";

		for (int l = 0; l < 3; l++) {
			System.out.println("俺の友達の名前は" + nameList[l] + "だ。");
		}

	}

}
