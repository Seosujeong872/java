package awt;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx3 extends MFrame implements ItemListener {

	Choice name, star;
	String ms[] = { "�� ��", "�� ��", "�̹�ȣ", "�����", "����", "������" };
	String fs[] = { "��ƶ�", "�̿���", "���ϴ�", "��ä��", "�� ��", "�迬��" };

	public ChoiceEx3() {
		name = new Choice();
		name.add("���ڿ�����");
		name.add("���ڿ�����");
		star = new Choice();
//		for (int i = 0; i < ms.length; i++) {
//			star.add(ms[i]);
//		}
		inputItem(star, ms);
		add(name);
		add(star);
		name.addItemListener(this);
	}

	public void inputItem(Choice c, String item[]) {
		c.removeAll(); // ������ ������ ����
		for (int i = 0; i < item.length; i++) {
			c.add(item[i]);
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		star.removeAll();
		if (name.getSelectedItem() == "���ڿ�����") {
			for (int i = 0; i < ms.length; i++) {
				star.add(ms[i]);
			}

		} else {
			for (int i = 0; i < fs.length; i++) {
				star.add(fs[i]);

			}

		}

	}

	public static void main(String[] args) {
		new ChoiceEx3();
	}



}
