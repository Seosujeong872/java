package ch06;
/*static :필드, 메소드, 클래스 (부분*)
 * static 필드 및 메소드는 객체를 생성하지 않아도 사용가능.
 * 사용시점 : 클래스 이름으로 접근하기 ㄸㅐ문에 그 때 메뫼리에 로딩./
 */
class Static1{
	static int i = 0;
	
	static void prn1(){}
	void prn2() {}
	
	static class Inner{} //내부클래스 앞에는 static 올 수 있음.
}
public class StaticEx1 {
	public static void main(String[] args) {
		int a = Math.abs(-6);
		int b = (int)Math.round(3.14);
		
		Integer i = new Integer(22);
		i.parseInt("23");
		int c  =  i.parseInt("23");
		//반지름이 5이 ㄴ원의 넓이를 구하시오.
		System.out.println(5*5*Math.PI);

}
}