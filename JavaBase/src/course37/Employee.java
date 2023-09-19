package course37;

public class Employee {
	private String name;
	static String company;
	private String yakusoku;
	private int salary;

	void display() {
		System.out.println(this.name);
		System.out.println(this.company);
		System.out.println(this.yakusoku);
		System.out.println(this.salary);
	}

	Employee() {
		this.name = "未設定";
		this.company = "未設定会社";
		this.yakusoku = "未設定役職";
		this.salary = 9999;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
	}

	public String getYakusoku() {
		return yakusoku;
	}

	public void setYakusoku(String yakusoku) {
		this.yakusoku = yakusoku;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;

	}

}
