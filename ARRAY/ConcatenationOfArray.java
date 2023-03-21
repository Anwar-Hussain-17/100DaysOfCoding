//https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums) {
      int A[] = new int[nums.length*2];
      for(int i=0;i<nums.length*2;i++){
          A[i]=nums[i%(nums.length)];
      }
    return A;
    }
}
