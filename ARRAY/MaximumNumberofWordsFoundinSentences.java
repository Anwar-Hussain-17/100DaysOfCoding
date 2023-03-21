//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

class Solution {
    public int mostWordsFound(String[] A) {
        int max =0;
         for(int i= 0 ;i<A.length;i++)
         {
           String B[] = A[i].split(" "); 
           if(B.length>max){
               max=B.length;
           }
    
         }return max;
    }

}
