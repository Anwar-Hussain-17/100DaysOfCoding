//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] A) {
        int n = A.length;
        int min =A[0];
        int ans=0;
        for(int i = 0;i<n;i++){
            min=Math.min(min,A[i]);
            ans = Math.max(A[i]-min,ans);
        }
        return ans;
    }
}
