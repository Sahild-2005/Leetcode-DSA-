class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        
        int prod =1;

        int left = 0;
        int right = 0;
        int count =0;

        for(right=0;right<arr.length;right++){
            
                prod = prod*arr[right];
                if(prod<k) count = count+(right-left)+1;
                else{
                while(prod>=k){
                    // shrink window 
                    prod = prod/arr[left];
                    left++;
                }
            count = count+(right-left)+1;
                }
        }
        return count;
    }
}