package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class RunnableFrameEx1 extends MFrame {
	
	Random r = new Random();
	int x,y;
	Color c;
	
	public RunnableFrameEx1(Color cl) {
		super(300,300);
		this.c = c;
	}
	
	public void run() {
		for (int i = 0; i < 20; i++) {
			x = r.nextInt(300);
			y = r.nextInt(300);
			try {
				Thread.sleep(500);
				repaint();
			} catch (InterruptedException e) {}
		
		}//--for
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(x, y, 10, 10);
		
	}
	@Override
	public void update(Graphics g) {
		g.clearRect(x,y,10,10);
		paint(g);
		
	}
	
	

	public static void main(String[] args) {
		RunnableFrameEx1 r1 = new RunnableFrameEx1(Color.pink);
		RunnableFrameEx1 r2 = new RunnableFrameEx1(Color.green);
		r1.run();
		r2.run();
		}

}
