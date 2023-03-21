//https://leetcode.com/problems/decompress-run-length-encoded-list/

class Solution {
    public int[] decompressRLElist(int[] nums) {
      int  n = nums.length;
      int freq =0,val =0,count =0,len =0;
      for(int i = 0; i < nums.length; i = i+2){
            len = len + nums[i];
        }
      int[] ans =new int[len];
      for(int i =0;i<n;i++){
          freq =nums[i];
          val= nums[i+1];
          for(int j =1;j<=freq;j++){
              ans[count++]=val;
          }
          i++;
      }
      return ans;   
    }
}
