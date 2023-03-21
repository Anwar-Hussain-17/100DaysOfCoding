
//https://leetcode.com/problems/minimum-time-to-complete-trips/

class Solution {
    public long minimumTime(int[] time, int totalTrips) {;
        long r = (long)Math.pow(10, 14);
        long l = 0;
        while(l < r) {
            long mid = l + (r - l) / 2;
            if (isPossible(time, totalTrips, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    boolean isPossible(int[] time, int totalTrips, long max) {
        long cnt = 0;
        for(int t: time) {
            
            cnt += max / t;

            if (cnt >= totalTrips) return true;
        }

        return false;
    }
}
