package course54_55;

public class Student {

	private int syussekibango;
	private String name;

	public Student() {
		System.out.println("コンストラクタが動いたよ。");
	}

	public Student(int userInputSyusseki, String userInputName) {
		this.syussekibango = userInputSyusseki;
		this.name = userInputName;
		System.out.println("出席番号"+" "+userInputSyusseki+"番");
		System.out.println("氏名"+" "+userInputName);
	}

	public int getSyussekibango() {
		return syussekibango;
	}

	public void setSyussekibango(int syussekibango) {
		this.syussekibango = syussekibango;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}