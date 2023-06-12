package awt;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MFrame2 extends Frame{
	
	
	public MFrame2() {
		this(300,300,new Color(220,220,220),false);
	
	}
	public MFrame2(int w, int h) {
		this(h,w,new Color(220,220,220),false);
	}
	public MFrame2(Color c) {
		this(300,300,c,false);
		
	}

	public MFrame2(int w, int h, Color c, Boolean flag) {
		setSize(w,h);
		
		setBackground(c);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setResizable(flag);
		setVisible(true);
		
	}
	
	public MFrame2(int w, int h, Color c) {
		setSize(w,h);
	
		setBackground(c);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setResizable(false);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new MFrame2(500,500,new Color(100,200,100),true);
	}
}