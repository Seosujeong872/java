package ch14;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class BufferWriterEx1 {

	public static void main(String[] args) {
		String str = "������ ���� ��ſ� �ݿ��� �Դϴ�.";
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(null));
		try {
			bw.write(str,0,str.length());
			bw.newLine();
			bw.write(str);
			bw.newLine();
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			
		}

	}

}