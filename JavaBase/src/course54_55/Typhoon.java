package course54_55;

public class Typhoon {
	private int typhoonbango;
	private String hasseibi;
	private String asiaName;
	private String typhoon;
	
	public Typhoon() {
		
	}
	
	public Typhoon(int Typhoonbango,String Hasseibi,String AsiaName) {
		
		this.typhoonbango = Typhoonbango;
		this.hasseibi = Hasseibi;
		this.asiaName = AsiaName;
		
	}
	
	public Typhoon(String typhoon) {
		this.typhoon = typhoon;
		System.out.println(typhoon);
	}
	//デフォルトコンストラクタ
	//引数有りコンストラクタ
	//getter,setter

	public String getTyphoon() {
		return typhoon;
	}

	public void setTyphoon(String typhoon) {
		this.typhoon = typhoon;
	}

	public int getTyphoonbango() {
		return typhoonbango;
	}

	public void setTyphoonbango(int typhoonbango) {
		this.typhoonbango = typhoonbango;
	}

	public String getHasseibi() {
		return hasseibi;
	}

	public void setHasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}

	public String getAsiaName() {
		return asiaName;
	}

	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}
}