package course56;

public class StudentControll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Student stu1 = new Student();
		stu1.setSyussekibango(7);
		stu1.study();

		System.out.println();

		PoPocke p = new PoPocke();

		p.setName("ピカチュウ");
		p.setZukanNo(25);
		p.setType("電気");
		p.setKotaichi(6);
		p.setNickname("ピカピカ");
		p.battle();
		p.recover();

	}

}
