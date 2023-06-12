package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class DesignEx2 extends MFrame2{

	TextField tf;
	TextArea ta;
	Button btn1, btn2;
	Panel p1, p2,p3;
	
	public DesignEx2() {
		super(500,400);
		setTitle("디자인 예제2");
		p1 = new Panel();
		p1.add(tf = new TextField("Hello JUN!",30));
		
		p2 = new Panel();
		p2.add(ta = new TextArea(50,50));
		
		p3 = new Panel();
		p3.add(btn1 = new Button("마우스시험용"));
		p3.add(btn2 = new Button("종료"));
		
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		validate();
		
	}
	
	
	public static void main(String[] args) {
		new DesignEx2();
	}
}

