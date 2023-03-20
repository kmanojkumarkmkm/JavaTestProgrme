package onesoft.testProgram;

public class P11StringMath {

	public static void main(String[] args) {
		String a = "2-1+3*10/5";
		String[] s = a.split("[-+*/]");
		String[] o = a.split("[0-9]");

		int tot = 0;
		for (int i = 0, j = 1; i < s.length - 1; i++, j++) {
			int x = Integer.parseInt(s[i]);
			int y = Integer.parseInt(s[i + 1]);

			if (o[j] == "") {
				j++;
			}
			String op = o[j];

			int temp = 0;
			switch (op) {
			case "+":
				temp = x + y;
				break;
			case "-":
				temp = x - y;
				break;
			case "/":
				temp = x / y;
				break;
			case "*":
				temp = x * y;
				break;
			default:
				break;
			}

			s[i + 1] = String.valueOf(temp);
			tot = temp;

		}
		System.out.println("Res : " + tot);
	}

}
