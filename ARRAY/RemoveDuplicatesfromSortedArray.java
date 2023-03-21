//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int temp =1 ;
        int size = nums.length;
        for (int i=0;i<size ; i++){
            if(nums[i] != nums[temp-1]){
                nums[temp++]=nums[i];
            }
        }
     return temp;   
    }
}
