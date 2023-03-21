//https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        int temp= 0;
        int max =Integer.MIN_VALUE;
      for(int i =0 ;i<nums.length;i++){
           temp += nums[i];
           max= Math.max(temp,max);
           temp =Math.max(temp,0);   
      }
      return max;   
    }
}
