package ch06;

class Access2{
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0)
			age=0;
		this.age = age;
	}
	private int a = 0;
	private int age = 0;
}
public class AccessEx2 {
	public static void main(String[] args) {
		Access2 ac = new Access2();
		ac.a =10;
	}

}
