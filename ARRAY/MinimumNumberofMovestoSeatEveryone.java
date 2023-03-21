//https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/

class Solution {
    public int minMovesToSeat(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int count =0;
        for(int i=0;i<A.length;++i){
            count += Math.abs(B[i]-A[i]);
        }

    return count;
        
    }
}

