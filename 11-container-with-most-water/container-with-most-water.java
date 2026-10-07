class Solution {
    public int maxArea(int[] arr) {
        
        int i=0;
        int j = arr.length-1;
        int maxi = Integer.MIN_VALUE;

        while(i<j){

            int prod = (j-i)*Math.min(arr[i],arr[j]);

            maxi = Math.max(maxi,prod);

            if(arr[i]>arr[j]){
                j--;
            }
            else i++;
        }

        return maxi;
    }
}