class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i=0;
        int j = arr.length-1;

        int[] ans = new int[2];
        int sum =arr[i] + arr[j];
        while(i<=j){
        sum =arr[i] + arr[j];
            if(sum==target){
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }
            else if(sum>target){
                j--;
            }
            else i++;
        }

        return new int[]{-1, -1}; 
    }

}