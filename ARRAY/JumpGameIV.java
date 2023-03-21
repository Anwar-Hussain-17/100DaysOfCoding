//https://leetcode.com/problems/jump-game-iv/

class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        Map<Integer,List<Integer>> index = new HashMap();
        for(int i =0;i<n;i++){
        index.computeIfAbsent(arr[i],l -> new ArrayList()).add(i);
        }
        Queue<Integer> q = new LinkedList();
        Set<Integer> visit = new HashSet();
        q.add(0);
        visit.add(0);
        int step =0;
        while(!q.isEmpty()){
            int size =q.size();
            while(size-->0){
                int i =q.poll();
                if(n-1==i)
                return step;
                List<Integer> adj =index.get(arr[i]);
                adj.add(i-1);
                adj.add(i+1);
                for(int j :adj){
                    if(j>=0 && j<n && !visit.contains(j)){
                        q.add(j);
                        visit.add(j); 
                    }
                }
                adj.clear();

            }
            step++;
        }
        return -1;
        
    }
}
