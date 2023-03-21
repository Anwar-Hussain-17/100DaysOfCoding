//https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] A) {
        int r = A.length;
        int c = A[0].length;
        int sum,max=0;
        for(int i=0;i<r;i++){
       sum =0;
       for(int j =0;j<c;j++){
           sum+=A[i][j];
       }
      if(sum>max){
          max =sum;
      }

        }
 return max;   }
}
