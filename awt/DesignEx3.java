package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;

public class DesignEx3 extends MFrame2{

	List list;
	Button b[] = new Button[4];
	String lab[] = {"추가","지우기","전체지우기","종료"};
	TextField tf;
	String food[] ={"짜장면","짬뽕","우동"};
	Panel p1,p2,p3;
	
	public DesignEx3() {
		super(200,300);
		setTitle("디자인 예제3");
		p1 = new Panel();
		p1.setLayout(new BorderLayout());
		p1.add(list = new List(3,false));
		for (int i = 0; i < food.length; i++) {
			list.add(food [i]);
		}
		
		p2 = new Panel();
		p2.setLayout(new GridLayout(4,1));
		for (int j = 0; j < b.length; j++) {
			p2.add(b[j] = new Button(lab[j]));
		}
		
		p3 = new Panel();
		p3.setLayout(new BorderLayout());
		p3.add(tf = new TextField(22));
		
	
		
	
		add(p1,BorderLayout.CENTER);
		add(p2, BorderLayout.EAST);
		add(p3,BorderLayout.SOUTH);
		tf.requestFocus();
		list.select(0);
		validate();
	}

	public static void main(String[] args) {
		new DesignEx3();
	}
}









