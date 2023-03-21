//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/

class Solution {
    public int sumOddLengthSubarrays(int[] A) {
        int count = 0;
        int n =A.length;
        for(int i =1;i<=n;i+=2){
            for(int j= 0;j<=n-i;j++){
                for(int k=j;k<j+i;k++){
                    count+=A[k];
                }
            }
        }return count;
    }
}
