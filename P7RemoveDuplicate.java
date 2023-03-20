package onesoft.testProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class P7RemoveDuplicate {

	public static void main(String[] args) {

		String a = "1,2,3,1,2,3,1,2,3";
		String b[] = a.split(",");

		// Remove duplicate using Set
		LinkedHashSet<Integer> se = new LinkedHashSet<>();
		for (String s : b) {
			se.add(Integer.parseInt(s));
		}
		int res[] = new int[se.size()];
		Iterator<Integer> itr = se.iterator();
		int j = 0;
		while (itr.hasNext()) {
			res[j] = itr.next();
			j++;
		}

		// Descending order
		for (int i = 0; i < res.length - 1;) {
			if (res[i] < res[i + 1]) {
				int t = res[i + 1];
				res[i + 1] = res[i];
				res[i] = t;
				i = 0;
			} else {
				i++;
			}
		}

		for (int temp : res) {
			System.out.println(temp);
		}
	}

}
