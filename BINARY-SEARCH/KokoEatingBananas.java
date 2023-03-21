//https://leetcode.com/problems/koko-eating-bananas/

class Solution {


   private boolean canEatAll(int[] piles, int speed, int h) {
        int time = 0;
        for (int pile : piles) {
            time += (pile - 1) / speed + 1;
            if (time > h) {
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
         int l = 1;
         int r =Arrays.stream(piles).max().getAsInt();
         while(l<r){
             int mid  = l + (r-l)/2;
             if(canEatAll(piles,mid,h)){
               r =mid;
             }
             else{
                l =mid+1;
             }
         }

         return l;
    }
}
