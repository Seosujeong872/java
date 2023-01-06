package ch06;

import ch06_1.AccessEx3;

class Access4 extends AccessEx3{
   public Access4() {
      //상속에서 public, protected까지 유산
      //private 제외
      int k = b + c;
      
   }
}
public class AccessEx4 {
   public static void main(String[] args) {
      
      AccessEx3 ac = new AccessEx3();
    
   }

}