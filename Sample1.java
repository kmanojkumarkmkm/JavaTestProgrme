package onesoft.testProgram;

public class Sample1 {

	public static void main(String[] args) {

		String a="a1b2c3";
		String[] s1 = a.split("[0-9]");
		for (String s : s1) {
			System.out.println(s);
		}
		String[] s2 = a.split("[a-z]");
		for (String s : s2) {
			System.out.println("X"+s.trim());
		}
		
		
	}

}
