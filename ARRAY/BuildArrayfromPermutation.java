//https://leetcode.com/problems/build-array-from-permutation/

class Solution {
    public int[] buildArray(int[] nums) {
        int A[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            A[i]=nums[nums[i]];
        }
        return A;
    }
}
