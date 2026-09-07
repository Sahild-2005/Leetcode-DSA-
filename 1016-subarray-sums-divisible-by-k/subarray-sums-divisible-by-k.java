class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        
        // hashmap + prefix sum 

        int n = arr.length;

        int count =0;
        int sum =0;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        
        for(int i=0;i<n;i++){
            sum = sum+arr[i];

            int rem = sum%k;
            if(rem<0) rem =rem+k;

            int freq = map.getOrDefault(rem, 0);

             count =count+freq;
             map.put(rem,freq+1);

        }
        return count;
    }
}