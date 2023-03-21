//https://leetcode.com/problems/unique-morse-code-words/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       int n = words.length; 
       String x ="";
       StringBuilder S =new StringBuilder();
       String A[] = new String[]
       {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       Map<Character,String> H = new HashMap<>();
       for(int i =97,j=0 ;i<123;i++,j++){
           H.put((char)i ,A[j]);
       }
       for(int i =0;i<n;i++){
           x =words[i];
           for(int j =0;j<x.length();j++){
               S.append(H.get(x.charAt(j)));
           }
           words[i] = S.toString();
           S.setLength(0);
       }

       Set <String> ans = new HashSet<String>(Arrays.asList(words));
       return ans.size();

    }
}
