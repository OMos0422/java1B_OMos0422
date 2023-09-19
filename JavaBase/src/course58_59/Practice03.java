package course58_59;

public class Practice03 {
	public static void main(String[] args) {
		JavaMaker jm = new JavaMaker();
		String startCode = "public class HelloWorld { public static void main(String[] args){"
				+ " System.out.println(\"Hello\");"
				+ ""
				+ "}}";
		jm.javaCodeStart(startCode);
	}
}