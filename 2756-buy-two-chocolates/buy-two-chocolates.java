class Solution {
    public int buyChoco(int[] arr, int money) {
        
        Arrays.sort(arr);
        int n = arr.length;
        if(n==1) return money;


        int cost =arr[0]+arr[1];

        if(cost<=money) return money-cost;

        return money;
        
    }
}