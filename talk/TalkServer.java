package talk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;





public class TalkServer {

	public static final int PORT = 8003;
	ServerSocket server;
	Vector<ClientThread1> vc;
	TalkMgr mgr;

	public TalkServer() {
		try {
			server = new ServerSocket(PORT);
			vc = new Vector<ClientThread1>();
			mgr = new TalkMgr();
		} catch (Exception e) {
			// e.printStackTrace();
			System.err.println("Error in Server");
			System.exit(1);// 비정상적인 종료
		}
		System.out.println("*********************************");
		System.out.println("ChatServer1 v1.0 시작되었습니다.");
		System.out.println("*********************************");
		try {
			while (true) {
				Socket sock = server.accept();
				ClientThread1 ct = new ClientThread1(sock);
				ct.start();
				// 접속한 클라이언트 Socket 객체를 Vector 저장
				vc.addElement(ct);
			}
		} catch (Exception e) {
			// e.printStackTrace();
			System.err.println("Error in Socket");
		}

	}

	// 전체 접속자에게 메세지 전달
	public void sendAllMessage(String msg) {
		for (int i = 0; i < vc.size(); i++) {
			ClientThread1 ct = vc.get(i);
			ct.sendMessage(msg);

		}
	}

	// 접속이 끊어진 Client를 Vector에서 제거
	public void removeClient(ClientThread1 ct) {
		vc.remove(ct);
	}

	class ClientThread1 extends Thread {

		Socket sock;
		BufferedReader in;
		PrintWriter out;
		String id;

		public ClientThread1(Socket sock) {
			try {

				this.sock = sock;
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(), true);
				// sock.toString
				sock.toString();
				System.out.println(sock + "접속됨...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			  try {
		            while (true) {
		               String line = in.readLine();
		               if (line == null)
		                  break;
		               else
		                  routine(line);
		            }
		         } catch (Exception e) {
		            removeClient(this);
		            System.err.println(sock + "[" + id + "] 끊어짐...");
		         }
		}

		public void routine(String line) {
			System.out.println("line:" + line);
			int idx = line.indexOf(TalkProtocol.MODE);
			String cmd = line.substring(0, idx);
			String data = line.substring(idx + 1);
			System.out.println(cmd+"/"+data);
			// ID:aaa;1234
			if (cmd.equals(TalkProtocol.ID)) {
				idx = data.indexOf(";");
				cmd = data.substring(0, idx);// aaa
				data = data.substring(idx + 1);// 1234
				System.out.println(cmd+"/"+data);
				if (mgr.loginChk(cmd, data)) {
					// 로그인 성공
					ClientThread1 ct = findClient(cmd);
					if (ct != null && ct.id.equals(cmd)) {
						// 이중접속
						sendMessage(TalkProtocol.ID + TalkProtocol.MODE + "C");
					} else {
		                  id = cmd;
		                  sendMessage(TalkProtocol.ID + TalkProtocol.MODE + "T");
		                  sendAllMessage(TalkProtocol.CHATALL + TalkProtocol.MODE + "[" +id + "]님이 입장하였습니다.");
		                  
		               }
				} else {
					sendMessage(TalkProtocol.ID + TalkProtocol.MODE + "F");
				}
			}

			else if (cmd.equals(TalkProtocol.CHATALL)) {
				sendAllMessage(TalkProtocol.CHATALL + TalkProtocol.MODE + "[" + id + "]" + data);
			}
		}

		// Client 에게 메세지 보내는 메소드
		
		public void sendMessage(String msg) {

			out.println(msg);

		}

	}// ClientThread1

	public static void main(String[] args) {

		new TalkServer();

	}

	public ClientThread1 findClient(String cmd) {
		return null;
	}

}
