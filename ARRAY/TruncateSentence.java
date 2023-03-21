//https://leetcode.com/problems/truncate-sentence/

class Solution {
    public String truncateSentence(String s, int k) {
     String[] A =s.split(" ");
     int n = A.length;
     String B ="";
     for(int i =0;i<k;i++){
         if(i!=k-1)
         B+=A[i]+" ";
         else
          B+=A[i];

     }  

     return B; 
    }
}
