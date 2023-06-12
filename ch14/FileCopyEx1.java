package ch14;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCopyEx1 {
   public static void main(String[] args) {
      try {
         // 스캐너 불러와서 ~
         Scanner sc = new Scanner(System.in);
         
         System.out.println("원본파일 : " );
         String sFile = sc.nextLine();   // 원본 파일 : 입력 받고 ~
         
         System.out.println("복사파일 : ");
         String cFile = sc.nextLine();    // 복사파일 : 입력 받고 ~ 
         
         FileReader fr = new FileReader("ch14/"+sFile);   // ch14에 있는 sFile파일명 파일을 읽어와서 ~
         
         //파일 생성
         FileWriter fw = new FileWriter("ch14/"+cFile);  //ch14에 cFile파일이름으로 파일 생성! 
         
         int a; 
         while((a = fr.read()) != -1) {  // 1. fr(파일읽어오는애) 에게 ~ read해와라 ~ 시킴 !  =>  읽어온걸 a에저장     
            // 2. ( 파일이 정상적으로 읽어지면 ! (-1 : 오류가 아니면 ! ))
            fw.write(a); //  fw(파일생성하는애)에게 write해라 ~  
            
         }
         fw.close();  // 파일롸이터 닫고 ~
         fr.close();  // 파일리더 닫아라 ~~ 
         System.out.println("Copy End~");
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}