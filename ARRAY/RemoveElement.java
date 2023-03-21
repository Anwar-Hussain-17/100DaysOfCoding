//https://leetcode.com/problems/remove-element/


class Solution {
    public int removeElement(int[] A, int val) {
        int j=0;
        for(int i=0;i<A.length;i++){
           if(A[i]!=val){
               A[j]=A[i]; 
               j++;
           }
        }  
     return j;
        
    }
}
