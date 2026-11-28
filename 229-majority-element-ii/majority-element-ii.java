class Solution {
    public List<Integer> majorityElement(int[] arr) {
        
        int n = arr.length;

        ArrayList<Integer> list = new ArrayList<>();

        int times = n/3;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
           int freq = map.getOrDefault(arr[i], 0);

           map.put(arr[i],freq+1);
        }


    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

       int num = entry.getValue();
    if(num>times) list.add(entry.getKey());


    }

    return list;
    }
}