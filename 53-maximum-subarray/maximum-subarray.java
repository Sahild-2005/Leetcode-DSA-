class Solution {
    public int maxSubArray(int[] arr) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;

         if (arr.length == 1)
            return arr[0];

        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
           maxsum = Math.max(maxsum,sum);

            if(sum<0){
                sum =0;
            }
            
        }
       
        return maxsum;
    }
}