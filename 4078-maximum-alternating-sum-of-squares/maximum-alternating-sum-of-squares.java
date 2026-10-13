class Solution {
    public long maxAlternatingSum(int[] arr) {
        
      int n = arr.length;

      for(int i=0;i<n;i++){
        arr[i] = Math.abs(arr[i]);
      }

      Arrays.sort(arr);

        // even ko square 
        // odd ko minus 
        long sum =0;

       for(int i=n-1;i>=n/2;i--){
        sum = sum+(arr[i]*arr[i]);
       }
         for(int i=0;i<n/2;i++){
        sum = sum-(arr[i]*arr[i]);
       }


        return sum;
    }
}