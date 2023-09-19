package course54_55;

public class StudentControll {
	public static void main(String[] args) {
		
		Student tonari = new Student(12,"清水祥太");
		System.out.println();
		Student me = new Student(7,"大野将邦");
		
		Student [] mymen = new Student[2];
		
		mymen [0] = tonari;
		mymen [1] = me;
		
		System.out.println();
		System.out.println("私の名前は"+mymen[1].getName());
		
		mymen[0].setName("湊 あくあ");
		System.out.println("あてぃしはマリンメイドの"+mymen[0].getName()+"だよ！");

	}
}