class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count =0;

        int i=0;
        int j=0;

        int n = arr1.length;

        int m = arr2.length;

        while(i<n){
            int num = Math.abs(arr1[i]-arr2[j]);
            if(num<=d) {
                i++;
                j=0;
            }

            else{
               j++;
               if (j == m) {
                    count++;
                    i++;  
                    j = 0; 
                }
            }
             
        }
        return count;
    }
}