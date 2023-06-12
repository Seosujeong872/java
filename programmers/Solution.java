package programmers;



//class Solution {
//    public static String solution(String my_string, String letter) {
//        String answer = "";
//      
//        answer = my_string.replaceAll(letter, "");
//      
//        return answer;
//    }
    
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        for (int i = 0; i <= n; i++) {
        	if(i%2==1) {
        		 answer[i] =i;
        	}
			
		}
        return answer;
    }

}
//Â¦¼ö´Â ½È¾î¿ä
//class Solution {
//    public int[] solution(int n) {
//      int idx = 0;
//      if (n%2 ==0)
//         idx = n/2;
//      else
//         idx = n/2+1;
//        int[] answer = new int[idx];
//        int j = 0;
//        for (int i = 0; i <= n; i++) {
//         if (i%2 == 1) {
//            answer[j] = i;
//            j++;
//         }
//      }
//        
//        return answer;
//    }
//}