//https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> H =new HashSet<>();
        for(int i =0 ;i<nums.length;i++){
          if (H.contains(nums[i])) {
              return true;
          }
          H.add(nums[i]);
        
        }
      return false;
        
    
    }
}
