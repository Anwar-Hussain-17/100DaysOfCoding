
//https://leetcode.com/problems/sqrtx/

class Solution {
    public int mySqrt(int x) {
  long start =1,last =x;
  long mid = (start+last)/2;
  while(start<=last){
       if(mid*mid==x)
       {
           return (int) mid;
          
       }

       else if(mid*mid>x){
           last = mid-1;
       }
       else{
           start= mid+1;
       }

       mid = (start+last)/2;


  }
        return (int)mid;     

    }
}
