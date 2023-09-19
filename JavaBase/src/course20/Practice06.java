package course20;

public class Practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] S = new String[5];
		S[0] = "x";
		S[1] = "y";
		S[2] = "x";
		S[3] = "y";
		S[4] = "x";
		
		int cnt = 0;
		for (String moji : S)
		if("x".equals(moji)) {
			cnt = cnt + 1;
		}  
		
		System.out.println(cnt);

	}

}
