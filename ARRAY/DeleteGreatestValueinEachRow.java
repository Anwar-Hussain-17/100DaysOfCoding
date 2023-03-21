//https://leetcode.com/problems/delete-greatest-value-in-each-row/

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int i[] : grid){
          Arrays.sort(i);
        }
        int ans =0;
        for(int j=0;j<grid[0].length;j++){
            int m =0;
            for( int x[] : grid){
                m = Math.max(m,x[j]);
            }
            ans+=m;
        }
       return ans; 
    }
}
