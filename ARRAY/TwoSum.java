//https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        int rem[] = new int [2];
       for(int i=0 ;i<nums.length;i++){
           for(int j=i+1 ;j<nums.length;j++){
        int temp = nums[i] + nums[j];
           if(temp==target){
             rem[0]=i;
             rem[1]=j ;
             
       }
    }}
    return rem;
    }
}
