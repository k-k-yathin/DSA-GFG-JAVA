class Solution {
    public static void removeLoop(Node head) {
        // code here
        if(head == null || head.next==null){
            return ;
        }
        Node slow = head;
        Node fast = head;
        
        while(fast !=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) {
                break;
            }
        }
        
        if(slow != fast) {
            return ;
        }
        
        slow = head ;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        Node ptr = fast;
        while(ptr.next != slow) {
            ptr = ptr.next;
        }
        ptr.next = null ;
    }
}
