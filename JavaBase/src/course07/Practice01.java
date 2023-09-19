package course07;
import java.util.Scanner;
public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("数値を入力してください");
		
		int x = stdIn.nextInt();
		int y = x%3;
		int z = x%5;
		
		if(y ==0 && z==0 ) {
			System.out.println("Fizz&Buzz");
		} else if(y==0){
			System.out.println("Fizz");
		} else if(z==0) {
			System.out.println("Buzz");
		}
		
		
		
		
		
		

	}

}
