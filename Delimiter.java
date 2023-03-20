package onesoft.testProgram;

import java.util.Scanner;

public class Delimiter {

	public static void main(String[] args) {

		String a = "abc,def,ghi ,jkl,ffff";
		Scanner s = new Scanner(a);
		s.useDelimiter(",");

		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}

}
