//https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] A) {
           int last =A.length-1;
            for(int i= last;i>=0;i--){
                if(A[i]<9){
                    A[i]++;
                    return A;
                }
                A[i]=0;
            }
      int[]  B= new int[last+2];
      B[0]=1;
         return B;
    }
}
