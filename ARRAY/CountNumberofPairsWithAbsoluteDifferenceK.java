//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/


class Solution {
    public int countKDifference(int[] nums, int k) {
     int n = nums.length;
     int count =0;
     for(int i=0;i<n;i++){
         for(int j=i;j<n;j++){
             
             if(i!=j &&  Math.abs(nums[i]-nums[j])==k){
                 count++;
             }
         }
     }
     return count;
    }
}
