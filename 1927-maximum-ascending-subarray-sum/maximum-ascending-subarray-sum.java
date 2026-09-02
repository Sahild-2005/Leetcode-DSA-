class Solution {
    public int maxAscendingSum(int[] arr) {

        int max = arr[0];
        int sum = arr[0];

        
        for(int i = 1; i < arr.length; i++){

            if(arr[i-1] < arr[i]){
                // ascending
                sum = sum + arr[i];
            }
            else{
                sum = arr[i];
            }

            max = Math.max(max, sum);
        }

        return max;
    }
}