package event;

import java.awt.Color;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMotionEventEx1 extends MFrame implements MouseMotionListener {
	
	
	Label IDrag, IMove;
	
	public MouseMotionEventEx1() {
		super(500,300,new Color(100,200,100),true);
		setLayout(null);
		IDrag = new Label("Drag", Label.CENTER);
		IMove = new Label("IMove", Label.CENTER);
		IDrag.setBounds(100,100,50,30);
		IMove.setBounds(100,100,50,30);
		IDrag.setBackground(MColor.rColor());
		IMove.setBackground(MColor.rColor());
		add(IDrag);
		add(IMove);
		addMouseMotionListener(this);
		
	}

	public static void main(String[] args) {
		new MouseMotionEventEx1();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Point p = e.getPoint();
		IDrag.setLocation(p);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Point p = e.getPoint();
		IMove.setLocation(p);
	}

}
