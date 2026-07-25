class Solution {
    // make count days new function 

  public long fun(int speed, int[] arr) {
    long hours = 0;

    for (int i = 0; i < arr.length; i++) {
        hours =hours + (long) Math.ceil((double) arr[i] / speed);
    }

    return hours;
}
    public int minEatingSpeed(int[] arr, int h) {
        // koko wants what speed he needs to eat till the gaurd comes 
        // so if it should be slowest speed 
        // searching of speed is required so we can make binary search 
        // search space can be 1-max no of bananas 

        int max = arr[0];

        int n = arr.length;

        for(int i=1;i<n;i++){
            if(arr[i]>max) max = arr[i]; 
        }

        // search space is 0 --> max 

        int low = 1;
        int high  = max;

        while(low<=high){
            int mid = low + (high-low)/2;

            // got speed now check 
           long days = fun(mid,arr);

           // check if speed is more or less 
           if(days<=h){
            // can make speed more less 
            high =  mid-1;
           }
           else low = mid+1;

            }
               return low;
        }

     
    }
