package course33;

public class Kaden {
	private String name;
	private int price;

	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		if (category.equals("大型")) {
			this.category = "設定NG";
		} else {
			this.category = category;
		}

	}

	public String getName() {
		return name;
	}

	//名前設定用メソッド
	public void setName(String name) {
		if (name.equals("マウス")) {
			//もし設定予定のパラメータが「マウス」なら
			//在庫切れ商品のためNGとする。
			this.name = "設定NG";
		} else {
			//そうでないなら受け取った
			this.name = name;
		}

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
