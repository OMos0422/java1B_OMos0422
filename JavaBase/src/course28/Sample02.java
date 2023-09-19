package course28;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Chrクラスのインスタンス「numata」を生成。
		//attack def spd love mp hpに好きなパラメータを設定してみよう。
		Chr numata = new Chr();
		numata.attack = 150;
		numata.def = 1;
		numata.spd = 70;
		numata.love = -500;
		numata.mp = 700;
		numata.hp = 100;

		//Chrクラスのインスタンス「Kajima」を生成
		//パラメータを設定してみよう。
		Chr Kajima = new Chr();
		Kajima.attack = 50;
		Kajima.def = 50;
		Kajima.spd = 40;
		Kajima.love = 40;
		Kajima.mp = 200;
		Kajima.hp = 310;

		Kajima.naguru(Kajima.attack, numata.def);

	}

}
