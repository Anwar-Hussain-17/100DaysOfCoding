//https://leetcode.com/problems/minimize-deviation-in-array/

class Solution {
    public int minimumDeviation(int[] nums) {
       PriorityQueue<Integer> P = new PriorityQueue<>((a,b)-> b-a);
       int min =Integer.MAX_VALUE;
       for(int i : nums){
           if(i%2==1) i*=2;
           min=Math.min(min,i);
           P.add(i);
       }
       int dif = Integer.MAX_VALUE;
       while(P.peek()%2==0){
           int max =P.remove();
           dif =Math.min(dif,max-min);
           min=Math.min(max/2,min);
           P.add(max/2);
       }
return Math.min(dif,P.peek()-min);
    }
}
