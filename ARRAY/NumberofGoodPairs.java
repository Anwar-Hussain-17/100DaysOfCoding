//https://leetcode.com/problems/number-of-good-pairs/

class Solution {
    public int numIdenticalPairs(int[] A) {
        int count = 0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
