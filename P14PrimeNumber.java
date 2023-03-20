package onesoft.testProgram;

public class P14PrimeNumber {

	public static void main(String[] args) {
		int a[] = new int[1000];
		int count = 0;
		for (int i = 1; i < 1000; i++) {
			a[i] = i;
		}

		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			boolean prime = true;
			for (int j = 1; j < x; j++) {
				if (x % j == 0) {
					prime = false;break;
				}
			}

			if (prime) {
				count++;
				System.out.println(count + " " + x);
			}

		}

	}

}
