package onesoft.testProgram;

public class CountOfWord {

	public static void main(String[] args) {
		String a="a1b2c3";
		
		for(int i=0;i<a.length()-1;i=i+2) {
			char x=a.charAt(i);
			String y=String.valueOf(a.charAt(i+1));
			int l=Integer.parseInt(y);
			
			for(int j=0;j<l;j++) {
				System.out.print(x);
			}
		}

	}

}
