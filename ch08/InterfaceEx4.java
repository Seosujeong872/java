package ch08;

abstract class Tv{
	String color;
	boolean power;
	int ch;
	void onOffPower() {
		power =! power;
	}
	
	void upCh() {
		ch++;
	}
	void downCh() {
		ch--;
	}
	
	abstract void setModel();
}
class SMTv extends Tv implements RemoteControl{
	@Override
	void setModel() {}
	
}
class LGTv extends Tv implements RemoteControl{
	@Override
	void setModel() {}
	
}
interface RemoteControl{
	void turnOn();
	void turnOff();
}

public class InterfaceEx4 {

	public static void main(String[] args) {

	}

}
