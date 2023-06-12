package ch11;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "Java Programming";
		
		int len = str.length();
		System.out.println("len : "+len);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String str2 = str.substring(5);
		String str3 = str.substring(5,10);
		
		
		//8번째 문자
		char c1 = str.charAt(8);
		System.out.println("8번째 문자 : "+c1);
		//짝수 자리 문자만 출력하세요.
		for(int i = 0; i<str.length(); i++) {
			if(i%2==0)
				System.out.print(str.charAt(i));
			
		}
		//a문자는 몇번째 자리에 있는가?
		//Java Programming
		int idx1 = str.indexOf('a');
		System.out.println("\n"+"idx1"+idx1);
		int idx2 = str.indexOf('a');
		System.out.println("\n"+"idx2"+idx2);
		
		//a를 q로 변환 출력하시오.
		String str4 = str.replace('a', 'q');
		System.out.println(str4);
		for (int i = 0; i < str.length; i++) {
			if(str.charAt(i)=='a') {
				System.out.print('q');
			}else {
				System.out.print(str.charAt(i));
			}
			
		}


	}

}
