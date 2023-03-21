//https://leetcode.com/problems/count-subarrays-with-fixed-bounds/

class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int left = -1;
        int Min = -1, Max = -1;
        long count = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] >= minK && nums[i] <= maxK) {
                Min = (nums[i] == minK) ? i : Min;
                Max = (nums[i] == maxK) ? i : Max;
                count += Math.max(0, Math.min(Min, Max) - left);
            } else {
                left= i;
                Min = -1;
                Max = -1;
            }
        }
        
        return count;
    }}
