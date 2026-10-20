class Solution {
    public long pickGifts(int[] arr, int k) {
        
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // default we get min heap

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        while(k>0){
            int max = pq.poll();
            int num = (int) Math.sqrt(max);
            pq.add(num);
            k--;
        }

        long sum =0;

        while(!pq.isEmpty()){
            sum = sum+pq.poll();
        }

        return sum;
    }
}