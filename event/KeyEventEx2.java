package event;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventEx2 extends MFrame{
	
	
	Button move;
	
	public KeyEventEx2() {
		super(400,500,new Color(100,200,100));
		setLayout(null);
		move = new Button("move");
		move.setBounds(200,250,50,30);
		move.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				String txt = KeyEvent.getKeyText(code);
//				System.out.println(code + " : " + txt);
				int x = move.getX();		
				int y = move.getY();
				switch(txt) {
				case "Up":
					if(y>30) {
						y-=10;
					}
					break;
				case "Left":
					if(x>0) {
						x-=10;
					}
					break;
				case "Right":
					if(x<getWidth()-50) {
					x+=10;
				}break;
				case "Down":
					if(y<getHeight()-30) {
						y+=10;
					}
					break;
				default:
					break;
				}
		
				move.setLocation(x,y);
			
			}
		});
		add(move);
		move.requestFocus();
		validate();
	}

	public static void main(String[] args) {
		new KeyEventEx2();
	}

}
