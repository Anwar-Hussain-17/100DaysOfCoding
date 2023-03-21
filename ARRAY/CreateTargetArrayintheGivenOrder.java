//https://leetcode.com/problems/create-target-array-in-the-given-order/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n= nums.length;
        int[] ans = new int[n];
        ArrayList<Integer> A = new ArrayList<>();

        for(int i=0;i<n;i++){
           A.add(index[i],nums[i]);
        }
       for(int j=0;j<A.size();j++){
          ans[j]=A.get(j);
       }
       return ans;
    }

}
