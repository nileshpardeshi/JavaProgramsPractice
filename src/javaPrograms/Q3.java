package javaPrograms;

public class Q3 {
	private static int var1;
	private int var2;

	public Q3(int val1, int val2) {
		var1 = val1;
		var2 = val2;
	}

	public void printVars() {
		System.out.println("Vals");
		System.out.println(var1 + ", " + var2);
	}

	public static void main(String[] args) {
		Q3 test1 = new Q3(1, 2);
		Q3 test2 = new Q3(3, 4);
		test1.printVars();
		test1 = test2;
		test1.printVars();
		test1 = new Q3(1, 2);
		test2.printVars();
	}
}
