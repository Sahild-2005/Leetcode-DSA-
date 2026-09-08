class Solution {
    public int findMaxLength(int[] arr) {
        int sum =0;

      HashMap<Integer,Integer> map = new HashMap<>();
      int len =0;


      map.put(0,-1);

      // sum and index 
      // 0 ke jagah pe -1 karo 

      for(int i=0;i<arr.length;i++){

        if(arr[i]==0) sum = sum+(-1);
        else sum = sum+1;

        if(map.containsKey(sum)){
            len = Math.max(len,i-map.get(sum));
        }
        else
        map.put(sum,i);
      }
      return len;
    }
}