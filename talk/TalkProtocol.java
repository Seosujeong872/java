package talk;

public class TalkProtocol {
	
	// ID, CHAT, CHATALL, MESSAGE, CHATLIST
	
	// ( C -> S ) ID:aaa
	// ( S -> C ) CHATLIST : aaa;bbb;ccc;ȫ�浿;
	
	public static final String ID = "ID";
	
	// ( C -> S ) CHAT:�޴� ���̵�;�޼��� ex) CHAT:bbb;�����
	// ( S -> C ) CHAT:������ ���̵�;�޼��� ex) CHAT:aaa;�����
	public static final String CHAT = "CHAT";
	
	// ( C -> S ) CHATALL:�޼���
	// ( S -> C ) CHATALL:[�����¾��̵�]�޼���
	public static final String CHATALL = "CHATALL";
	
	// ( C -> S ) MESSAGE:�޴� ���̵�;�������� ex) MESSAGE:bbb;�����
	// ( S -> C ) MESSAGE:������ ���̵�;�������� ex) MESSAGE:aaa;�����
	public static final String MESSAGE = "MESSAGE";
	
	// ( S -> C ) CHATLIST:aaa;bbb;ccc;ȫ�浿;
	public static final String CHATLIST = "CHATLIST";
	
	public static final String MODE = ":";

	public static void main(String[] args) {

	}

}