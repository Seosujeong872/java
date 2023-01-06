package ch04;

public class GuGuDan {

	public static void main(String[] args) {
		int m = 1;
		for (int i = 2; i < 10; i++) {
			System.out.println(i+"단");
			for (int j = 1; j < 10; j++) {
				m = i*j;
				System.out.println(i+ "*"+j+"="+m);
				
			}
			
		}

	}

}
