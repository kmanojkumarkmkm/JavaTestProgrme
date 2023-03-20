package onesoft.testProgram;

public class P10ShortAndCheckEqual {

	public static String shortArray(char k[]) {

		for (int i = 0; i < k.length - 1; ) {
			int x = k[i];
			int y = k[i + 1];
		
			if (x > y) {
				char temp = k[i];
				k[i] = k[i + 1];
				k[i + 1] = temp;
				i = 0;
			}else {
				i++;
			}
		}

		String res="";
		for (char c : k) {
			res=res+c;
		}
		
		return res;
	}

	public static void main(String[] args) {
		String a = "heat", b = "thea";

		char x[] = a.toCharArray();
		char y[] = b.toCharArray();

		String val1 = shortArray(x);
		String val2 = shortArray(y);
		
		if(val1.equals(val2)) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Not equal");
		}
		

	}

}
