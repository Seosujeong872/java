package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch06.MFrame;

public class MyFrame extends MFrame 
implements ActionListener{
	Button btn;
	boolean flag = false;
	public MyFrame() {
		btn = new Button("Button");
		add(btn,BorderLayout.SOUTH);
		setBackground(Color.orange);
// actionPercormed 연결메서드
// 내자신이 ActionListener 타입이므로 this 가 가능
// 버튼을 클릭을 하면 ActionEvent 객체내가 내부적 생성됨.
		btn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(flag)
			setBackground(Color.orange);
		else
			setBackground(Color.pink);
		flag=!flag;
		
	}
	public static void main(String[] args) {
		new MyFrame();

	}

}
