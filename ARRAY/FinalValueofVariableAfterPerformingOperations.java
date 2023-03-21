//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class Solution {
    public int finalValueAfterOperations(String[] A) {
         int count = 0;
         for(int i=0;i<A.length;i++){
             if(A[i].equals("X++")||A[i].equals("++X")){
                 count++;
             }
             else{
                 count--;
             }

         }
  return count;
    }
}
