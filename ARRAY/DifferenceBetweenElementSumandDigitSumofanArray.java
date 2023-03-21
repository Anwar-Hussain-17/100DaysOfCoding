//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/

class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int esum=0,dsum=0;
        for(int i =0;i<n;i++){
            int k =nums[i];
            esum+=k;
            while(k>0){
                int rem = k%10;
                 dsum+=rem;
                 k=k/10;
            }
        }

        return Math.abs(esum-dsum) ;
    }
}
