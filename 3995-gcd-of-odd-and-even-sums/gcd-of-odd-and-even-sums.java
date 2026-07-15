class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int SumOdd =0;
        int SumEven =0;

        for(int i=1;i<=2*n;i++){
            if(i%2==0) SumEven = SumEven+i;
            else  SumOdd = SumOdd+i;
        }

        int len  = Math.min(SumEven,SumOdd);

        int ans = 0;
        for(int i=1;i<len/2;i++){
            if(SumOdd%i==0 && SumEven%i==0){
                ans = Math.max(ans,i);
            }
        }

        return ans;
    }
}