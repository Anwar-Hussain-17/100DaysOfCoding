//https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] A =new int[n+1];
        A[0] =0;
        int max =A[0];
        for(int i=0;i<n;i++ ){
         A[i+1]=gain[i]+A[i];
         
         max = Math.max(A[i+1],max);
        }

  return max;
    }
}
