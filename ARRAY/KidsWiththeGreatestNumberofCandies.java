//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ex) {
    int n =candies.length;
    List <Boolean> L =new ArrayList<>();
    int max =Integer.MIN_VALUE;;
    for(int i=0;i<n;i++){
       max = Math.max(candies[i],max);
    }
    for(int i : candies){
        if(i+ex >= max){
            L.add(true);
        }
        else{
            L.add(false);
        }
    }
  return L;
    }
}
