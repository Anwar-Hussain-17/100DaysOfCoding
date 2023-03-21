//https://leetcode.com/problems/left-and-right-sum-differences/

class Solution {
    public int[] leftRightDifference(int[] nums) {
    
    int n= nums.length;
    int left[] =new  int[n+1];

    int ans[] =new int[n];
     left[0]=0;
    for(int i=0;i<n;i++){
       
        left[i+1]=nums[i]+left[i];
   
    }
    for(int i=1;i<n+1;i++)
    { ans[i-1]=Math.abs(left[n]-left[i]-left[i-1]);}
return ans;

    }
}
