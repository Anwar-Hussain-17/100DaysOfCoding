//https://leetcode.com/problems/sort-an-array/

class Solution {
    public int[] sortArray(int[] A) {
        int j=0;
        PriorityQueue<Integer> P = new PriorityQueue<>();
        for(int i =0;i<A.length;i++){
         P.offer(A[i]);       
        }
        while(!P.isEmpty()){
            A[j++]=P.poll();
        }
        return A;
    }
}
