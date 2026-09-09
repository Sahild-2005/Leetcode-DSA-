class Solution {
    public long countCommas(long n) {

        if (n < 999)
            return 0;

       long result =0;
       long start = 1000;


       while(start<=n){
        result = result+ (n-start+1);
        start = start* 1000;
       }

       return result;

    }
}