package onesoft.testProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a = 153, b = a;
		int tot = 0;
		while (a > 0) {
			int x = a % 10;
			tot = tot + (x * x * x);
			a = a / 10;
		}
		System.out.println(tot);
		if (tot == b) {
			System.out.println("It is a Armstrong number");
		} else {
			System.out.println("Not a armstrong");
		}
		
		System.out.println("Done ...........");
	}

}
