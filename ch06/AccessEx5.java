package ch06;

import java.awt.Frame;

//java.awt.Frame에 paramString의 결과값을 출력하시오.

 class Access5 extends Frame{
	 Access5() {
		System.out.println("*** 1");
		System.out.println(paramString());
	}
}








public class AccessEx5 extends Frame {
	public static void main(String[] args) {
		Access5 ad = new Access5();

	}

}
