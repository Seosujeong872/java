package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyEx2 extends MFrame 
implements ActionListener{
	
	Button open, save;
	TextArea ta;
	FileDialog openDialog, saveDialog;
	String sourceDir;
	String sourceFile;
	
	public FileCopyEx2() {
		super(400,500);
		setTitle("FileCopyEx2");
		add(ta = new TextArea());
		Panel p = new Panel();
		p.add(open = new Button("OPEN"));
		p.add(save = new Button("SAVE"));
		ta.setEditable(false);
		open.addActionListener(this);
		save.addActionListener(this);
		add(p,BorderLayout.SOUTH);
		validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==open) {
			FileDialog openDialog = new FileDialog(this, "파일열기",0);
			openDialog.setVisible(true);
			String filepath = openDialog.getDirectory() + openDialog.getFile();
			try {
				fileReader(filepath);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}else if(obj==save) {
			FileDialog saveDialog = new FileDialog(this, "파일저장",1);
			saveDialog.setVisible(true);
			String filepath = saveDialog.getDirectory() + saveDialog.getFile();
			try {
				fileWriter(filepath);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			 try {
		            for (int i = 5; i > 0; i--) {
		               ta.setText("저장 하였습니다. - "+ i
		                     +"초후에 사라집니다.");
		               Thread.sleep(1000);
		            }
		         } catch (InterruptedException e1) {
		            e1.printStackTrace();
		         }
			 ta.setText("");
			 
	      
		}
	}
	
	//선택된 파일의 내용이 ta에 append 해야함
	public void fileReader(String file) throws Exception{
		ta.setText("");
		BufferedReader br = new BufferedReader(new FileReader(file));
		while(true) {
			String line = br.readLine();
			if(line ==null)
				break;
		ta.append(line);
		}
		br.close();
	}
	
	//ta에 오픈된 텍스트를 지정한 파일로 저장 해야함
	public void fileWriter(String file) throws Exception{
		FileWriter fw = 
	               new FileWriter(file);
	         fw.write(ta.getText());
	         fw.flush();
	         fw.close();
	}
	
	public static void main(String[] args) {
		new FileCopyEx2();
	}
}










