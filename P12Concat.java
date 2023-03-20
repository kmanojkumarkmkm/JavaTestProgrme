package onesoft.testProgram;

class P12Concat {

	public static void main(String[] args) {

		String a = "JAVA", b = "developer";
		String a1, a2 = "";
		
		int l = a.length();
		if (l % 2 == 0) {
			a1 = a.substring(0, l / 2);
			a2 = a.substring(l / 2);
		} else {
			a1 = a.substring(0, l / 2 + 1);
			a2 = a.substring(l / 2 + 1);
		}

		System.out.println(a1 + b + a2);

	}

}
