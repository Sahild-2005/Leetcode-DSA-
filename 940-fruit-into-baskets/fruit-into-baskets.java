class Solution {
    public int totalFruit(int[] arr) {
        
        int low = 0;
        int high = 0;

        // varibale size sliding window 

        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;

        for(high =0;high<arr.length;high++){

         map.put(arr[high], map.getOrDefault(arr[high], 0) + 1);

            while(map.size()>2){
                 int freq = map.get(arr[low]); 
                if(freq==1) map.remove(arr[low]);
                else map.put(arr[low],freq-1);
                low++;
                
            }

            max = Math.max(max,high-low+1);
        }
        return max;
    }
}