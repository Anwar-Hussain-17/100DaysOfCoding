//https://leetcode.com/problems/shuffle-the-array/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int A [] =new int[nums.length];
        int count=0;
      for(int i =0;i<n;i++){
          A[count] = nums[i];
          A[count+1] = nums[i+n];
          count+=2;

      }
return A;

    }
}
