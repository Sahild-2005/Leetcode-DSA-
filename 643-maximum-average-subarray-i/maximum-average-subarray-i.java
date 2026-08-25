class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n = arr.length;

        int low = 0;
        int high = k-1;

        double max = Double.NEGATIVE_INFINITY;

        // fixed value 
        // first window 
        double  avg;
        double sum =0;
        for(int i=low;i<=high;i++){
            sum = sum+arr[i];

        }

        while(high<n){
            avg = sum/k;
            max = Math.max(max,avg);

            sum = sum-arr[low];
            low++;
            high++;
            if(high==n) break;
            sum = sum+arr[high];
        }
        
        return max;
    }
}