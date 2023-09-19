package course39;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Student student = new Student();
		student.name = "大野将邦";
		student.no = 7;
		
		Student student2 = new Student();
		student2.name = "大澤聡";
		student2.no = 5;
		
		Student myfriend []  = new Student[2];
		myfriend[0]= student;
		myfriend[1]= student2;
		
		for(int i = 0; i < 2; i++) {
			System.out.println(myfriend[i].name);
		}

	}

}
