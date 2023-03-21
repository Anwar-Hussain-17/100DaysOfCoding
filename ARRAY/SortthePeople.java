//https://leetcode.com/problems/sort-the-people/

class Solution {
    public String[] sortPeople(String[] A, int[] B) {
       HashMap<Integer,String>  H = new HashMap<>();
       for(int i=0;i<A.length;i++){
           H.put(B[i],A[i]);
       }
       Arrays.sort(B);
       String[] C = new String[B.length];
       int j =0;
       for(int i =B.length-1;i>=0;i--){
           C[j] =H.get(B[i]);
           j++;
       }
 return C;
    }
}
