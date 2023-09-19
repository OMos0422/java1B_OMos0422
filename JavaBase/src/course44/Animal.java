package course44;

public class Animal extends Creatures {
	private String name;
	private String kari;

	void display() {
		System.out.println("その動物の名前は"+this.name);
		System.out.println(this.name + "の体重は" + super.getWeight() + "g");
		System.out.println(this.name + "は" + this.kari);
		System.out.println(super.getJumyou());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKari() {
		return kari;
	}

	public void setKari(String kari) {
		this.kari = kari;
	}

}
