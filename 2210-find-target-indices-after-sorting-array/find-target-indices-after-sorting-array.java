class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        
       
        ArrayList<Integer> list = new ArrayList<>();

      int n = arr.length;

      int small =0;
      int big =0;
        int targetcount=0;
      for(int i=0;i<n;i++){
        if(arr[i]>target){  // big
        big++;
        }
        else if(arr[i]<target) small++;
        else targetcount++;
      }

        // list size --> n- small+big we dont need but target cout       

        while(list.size()!=targetcount){
            list.add(small);
            small++;
        }

        return list;

    }
}