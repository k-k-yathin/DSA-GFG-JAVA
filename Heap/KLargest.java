class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        ArrayList<Integer> res = new ArrayList<>(pq);
        Collections.sort(res, Collections.reverseOrder());
        
        return res;
    }
}
