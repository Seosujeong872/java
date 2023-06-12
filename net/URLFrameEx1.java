package net;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class URLFrameEx1 extends MFrame implements ActionListener {

	TextArea ta;
	TextField tf;
	Button connect;
	Button save;

	public URLFrameEx1() {
		super(500, 500);
		setTitle("ViewHost");
		Panel p = new Panel();
		p.add(tf = new TextField("http://", 40));
		p.add(connect = new Button("connect"));
		p.add(save = new Button("save"));
		ta = new TextArea();
		add(p, BorderLayout.NORTH);
		add(ta);
		save.setEnabled(false);
		connect.addActionListener(this);
		save.addActionListener(this);
		tf.addActionListener(this);
		validate();
	}

	@Override 
	public void actionPerformed(ActionEvent e) {
		save.setEnabled(true);
		
		String str = tf.getText();
		URL url=null;
		try {
			url = new URL(str);
		} catch (MalformedURLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		 Object obj = e.getSource();
		 if (obj==connect || obj == tf) {
			 try {
					BufferedReader br = new BufferedReader(
							new InputStreamReader(
									url.openStream(),"UTF-8"));
					String line = "";
					while(true) {
						line = br.readLine();
						if(line==null)
							break;
						ta.append(line + "\n");
					}
					br.close();
							
				} catch (Exception e1) {
					e1.printStackTrace();
				}
		 }else if(obj==save) {
	         saveFile(url);
	         ta.setText("저장되었습니다.");
		 }
		 
	 }
		 public void saveFile(URL url) {
			 
		      try {
		      
		         FileWriter fw = 
		               new FileWriter("net/"+url.getHost()+".txt");
		         fw.write(ta.getText());
		         fw.flush();
		         fw.close();
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
		   }
		 

	// 독립적인 기능은 최대한 세부적으로 구현.
		 
	public static void main(String[] args) {
		new URLFrameEx1();
	}
}








