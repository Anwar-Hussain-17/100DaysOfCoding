//https://leetcode.com/problems/shuffle-string/
class Solution {
    public String restoreString(String s, int[] indices) {
         StringBuilder x = new StringBuilder();
        int n =s.length();
        char A[]  =new char[n];
        for(int i=0;i<n;i++){
            A[indices[i]]=s.charAt(i);
        }
       for(char b:A){
           x.append(b);
       }
       return x.toString();
    }
}
