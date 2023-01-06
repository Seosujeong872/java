package ch04;

public class Ex8 {

	public static void main(String[] args) {
	
		//문제1. 1~30사이의 값중에 3의 배수의 합을 구하시요.
		
//		int sum = 0;
//		for(int i=1 ; i <31 ; i++) {
//			if(i%3==0) {
//			sum = sum + i; 
//		}System.out.println("1~30사이의 값중에 3의 배수의 합 : " +sum);
		//문제2. 1~30사이의 값중에 짝수와 홀수의 합을 각각 구하시오.
		
	
//		int a= 0; int b= 0; 
//		for(int j=1 ; j<31 ; j++) { 
//			if(j%2==0) {
//				a = a + j; }
//			else if(j%2==1) {
//				b= b+j; } }
//		
//		System.out.println("1~30사이의 값중에 짝수의 합 : " +a);
//		System.out.println("1~30사이의 값중에 홀수의 합 : " +b);
	
		/*문제3. 1~50사이의 3,6,9의 합은?
		Hint : %와 /를 사용. 33/10 => 3
		sum : 627*/
		int sum = 0;
		for(int i=1 ; i<51 ; i++) {
			int j = i%10; // 1,~0,1~0,10,11,12
			int n = i/10;
			if(j==3 || j==6 || j==9) {
				System.out.print(i + "\t");
				sum+=i;
				
			}else if(n==3) {
				System.out.println(i + "\t");
				sum+=i;
			}
	 }
		System.out.println("\nsum : " + sum);
	}
 }

