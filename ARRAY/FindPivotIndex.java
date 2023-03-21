//https://leetcode.com/problems/find-pivot-index/

class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
       int total=0;
       int sum =0;
       for(int i:nums){
           total+=i;
       }
       for(int j=0;j<n;sum+=nums[j++])
        {  
            if(sum*2==total-nums[j])
                return j;

        }
     return -1;
    }
}
