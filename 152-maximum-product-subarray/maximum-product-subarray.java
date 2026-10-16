class Solution {
    public int maxProduct(int[] arr) {
        
        // so we have to do maximum product subarray 
        // 3 edge cases (-)(-) --> + 
        // 0 edge case 
        // fromm left one and from right one for 3 negative 

        int prod = 1;
        int maxprod = 0;
        int n = arr.length;
        if(n==1) return arr[0];

        // we have to do 2 iterations left to right and right to left because 3 negative can effect our prod 


        for(int i=0;i<n;i++){
            prod = prod * arr[i];
            if(prod ==0) prod =1;
            else  maxprod = Math.max(prod,maxprod);
        }

            prod =1;
           for(int i=n-1;i>=0;i--){
            prod = prod * arr[i];

            if(prod ==0) prod =1;
           else maxprod = Math.max(prod,maxprod);
        }
        return maxprod;
        
    }
}