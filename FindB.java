package onesoft.testProgram;

public class FindB {

	public static void main(String[] args) {

		int a = 1;
		// System.out.println(" "+(a++) +""+ ( ++a) +""+ (--a));
		int b = (a++) + (++a) + (--a);
		System.out.println(b);
	}

}
