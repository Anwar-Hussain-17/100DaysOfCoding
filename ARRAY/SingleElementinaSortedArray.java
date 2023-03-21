
//https://leetcode.com/problems/single-element-in-a-sorted-array/
class Solution {
    public int singleNonDuplicate(int[] nums) {
     int n= nums.length;  
     int f =0;
     int l= n-1;
    
    if(n==1){
        return nums[0];
    }
    if(nums[0]!=nums[1]){
        return nums[0];
    }
    if(nums[n-1]!=nums[n-2]){
        return nums[n-1];

    }
    while (f<=l){
        int mid = f + (l-f) /2;
        if(mid>0 && mid < n-1){
            if(mid>0 && mid < n-1){
                if(nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1])
                    return nums[mid];
                else if((nums[mid] == nums[mid-1] && mid%2==1) || (nums[mid] == nums[mid+1] && mid%2==0))
                    f = mid+1;
                else 
                    l = mid -1;
        }
    }}
   return 0;
    }
    }
