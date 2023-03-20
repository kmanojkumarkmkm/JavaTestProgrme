package onesoft.testProgram;

import java.util.Iterator;

public class RearrangeString {

	public static void main(String[] args) {
		String a = "abcfed";
		String b = "";
		char[] k = a.toCharArray();

		for (int i = 0; i < k.length - 1; i++) {
			int x = k[i];
			int y = k[i + 1];
			char temp = k[i];
			if (x > y) {
				k[i] = k[i + 1];
				k[i + 1] = temp;
				i = 0;
			}
		}

		for (char c : k) {
			System.out.print(c);
		}

	}

}
