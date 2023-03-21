
//https://leetcode.com/problems/count-the-number-of-consistent-strings/
class Solution {
    public int countConsistentStrings(String allowed, String[] A) {
     HashSet<Character> B = new HashSet<>(); 
     int count  =A.length;
     for(char i : allowed.toCharArray()){
         B.add(i);
     } 
     for(String x:A){
         for(char y : x.toCharArray()){
             if(!B.contains(y)){
                 count--;
                 break;
             }
         }
     }
     return count; 
    }
}
