package awt;

import java.awt.Label;

public class ListEx1 extends MFrame{
	
	Label [] lb = new Label[4];
	int pos[] = {Label.LEFT, Label.CENTER,Label.RIGHT,Label.LEFT};
	
	public ListEx1() {
		super(200,200);
		setTitle("Label Example");
		String str = "오늘은 기분 좋은 수요일";
		for (int i = 0; i < lb.length; i++) {
			lb[i] = new Label(str,pos[i]);
			lb[i].setBackground(MColor.rColor());
			add(lb[i]);
		}
		validate();
	}
	
	
	public static void main(String[] args) {
		new ListEx1();
	}

}
