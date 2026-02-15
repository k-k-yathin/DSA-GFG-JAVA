class Solution {
    public int cycleStart(Node head) {
        
        if(head == null || head.next == null){
            return -1;
        }
        Node slow = head;
        Node fast = head;
        int pos = 1;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast){
                slow = head;
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow.data;
            }
        }
        return -1;
    }
}
