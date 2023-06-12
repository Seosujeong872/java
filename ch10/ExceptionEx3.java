package ch10;

import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		Scanner s = null;
		try {
			int a,b;
			s = new Scanner(System.in);
			System.out.println("첫번째 숫자 : ");
			a=s.nextInt();
			System.out.println("두번째 숫자 : ");
			b=s.nextInt();
			System.out.println("a + "/" + b + "="");
			
		} catch (Exception e) {
			
		}finally {
			s.close(); //사용후에 반드시 닫아야 한다.
		}

	}

}
