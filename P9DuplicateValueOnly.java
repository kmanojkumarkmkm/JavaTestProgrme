package onesoft.testProgram;

public class P9DuplicateValueOnly {

	public static void main(String[] args) {
		String para = "i am working as java developer";
		String a = para.replaceAll(" ", "");
		String res = "";

		for (int i = 0; i < a.length(); i++) {
			char temp = a.charAt(i);
			int s = a.indexOf(temp);
			int l = a.lastIndexOf(temp);

			if (s != l) {
				String check = String.valueOf(temp);
				if (!res.contains(check)) {
					res = res + a.charAt(i);
				}
			}
		}

		System.out.print(res);
	}
}
