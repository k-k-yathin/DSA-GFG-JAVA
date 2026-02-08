
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}


class Solution {
    public Node rotate(Node head, int k) {
        if(head == null || head.next == null){
            return head ; 
        }
        Node tail = head ;
        int length = 1;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }
        k = k%length;
        if(k==0) return head;
        
        tail.next = head ;
        Node newTail = head ;
        
        for(int i =1;i<k;i++){
            newTail = newTail.next;
        }
        
        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
