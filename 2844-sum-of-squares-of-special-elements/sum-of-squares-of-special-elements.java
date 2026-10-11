class Solution {
    public int sumOfSquares(int[] arr) {
        int n = arr.length;
        int sq;
        int prod = 0;
        
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
                sq = (arr[i]*arr[i]);
                prod = prod +sq;
            }
        }

        return prod;
    }
}