package ch14;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCopyEx1 {
   public static void main(String[] args) {
      try {
         // ��ĳ�� �ҷ��ͼ� ~
         Scanner sc = new Scanner(System.in);
         
         System.out.println("�������� : " );
         String sFile = sc.nextLine();   // ���� ���� : �Է� �ް� ~
         
         System.out.println("�������� : ");
         String cFile = sc.nextLine();    // �������� : �Է� �ް� ~ 
         
         FileReader fr = new FileReader("ch14/"+sFile);   // ch14�� �ִ� sFile���ϸ� ������ �о�ͼ� ~
         
         //���� ����
         FileWriter fw = new FileWriter("ch14/"+cFile);  //ch14�� cFile�����̸����� ���� ����! 
         
         int a; 
         while((a = fr.read()) != -1) {  // 1. fr(�����о���¾�) ���� ~ read�ؿͶ� ~ ��Ŵ !  =>  �о�°� a������     
            // 2. ( ������ ���������� �о����� ! (-1 : ������ �ƴϸ� ! ))
            fw.write(a); //  fw(���ϻ����ϴ¾�)���� write�ض� ~  
            
         }
         fw.close();  // ���Ϸ����� �ݰ� ~
         fr.close();  // ���ϸ��� �ݾƶ� ~~ 
         System.out.println("Copy End~");
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}