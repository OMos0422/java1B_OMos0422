package course28;

public class Chr {

	public static void main(String[] args) {
	}

	// TODO 自動生成されたメソッド・スタブ
	//「new」があったらインスタンス
	//頭文字が大文字のものはクラス
	static int attack;
	static int def;
	static int spd;
	static int love;
	static int mp;
	static int hp;

	static void naguru(int naguruattack, int naguraredef) {
		System.out.println((naguruattack - naguraredef) + "のダメージを与えた");
	}

	static void mamoru() {
		System.out.println("守りをかためて防御が" + (def * 2) + "になった。");
	}

}
