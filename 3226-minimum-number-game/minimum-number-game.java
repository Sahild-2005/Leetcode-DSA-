class Solution {
    public int[] numberGame(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;

        int[] alice = new int[n/2];
        int[] bob = new int[n/2];

        int aIndex=0;
        int bIndex=0;

        for(int i=0;i<n;i++){
            if(i%2==0){

            alice[aIndex] = arr[i];
            aIndex++;
            }
            else{
                bob[bIndex] = arr[i];
                bIndex++;
            }
        }

        aIndex=0;
        bIndex=0;


        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i] = bob[bIndex];
                bIndex++;
            }
            else{
                arr[i] = alice[aIndex];
                aIndex++;
            }
        }

        return arr;
    }
}