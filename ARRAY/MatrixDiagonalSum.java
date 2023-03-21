//https://leetcode.com/problems/matrix-diagonal-sum/


class Solution {
    public int diagonalSum(int[][] mat) {
        int count =0;
        for(int i=0;i<mat.length;i++){
            int j =mat.length-i-1;
                    if(i==j)
                    count+=mat[i][i];
                  else{
                   count+=mat[i][j];
                   count+=mat[i][i];}


                }
                
         return count;
    }
}
