//https://leetcode.com/problems/ipo/

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {



        if(profits==null||profits.length==0){
            return w;
        } 
        int n = profits.length;

         PriorityQueue<Integer> min =new PriorityQueue <Integer> (new Comparator<Integer>(){
             public int  compare(Integer A,Integer B){
                 return capital[A] - capital[B];
             }
         });
          PriorityQueue<Integer> max =new PriorityQueue <Integer> (new Comparator<Integer>(){
             public int compare(Integer A,Integer B){
                 return profits[B] - profits[A];
             }
         });

         for(int i=0;i<n;i++){
             min.add(i);
         }

         for(int i=0;i<k;i++){
             while(!min.isEmpty() && w>= capital[min.peek()]) {
                 max.add(min.poll());
             }
             if(max.isEmpty())
                 break;
             w += profits[max.poll()];
             
         }

       return w;

    }
}
