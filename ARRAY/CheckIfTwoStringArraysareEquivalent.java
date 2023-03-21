
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String A ="";
        String B= "";
        for(int i= 0;i<word1.length;i++){
            A+=word1[i];
        }
        for(int j =0;j<word2.length;j++){
            B+=word2[j];
        }

        return A.equals(B);
    }
}
