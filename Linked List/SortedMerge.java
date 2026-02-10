
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
class Solution {
    Node sortedMerge(Node head1, Node head2) {
          Node tail = head1;
          while(tail.next!=null){
              tail=tail.next;
          }
        tail.next = head2;
        Node curr = head1;
        while(curr!=null){
            Node index = curr.next;
            Node min = curr;
            
            while(index!=null){
                if(index.data<min.data){
                    min=index;
                }
                index=index.next;
            }
            
            int temp=curr.data;
            curr.data=min.data;
            min.data=temp;
            
            curr=curr.next;
        }
        return head1;
    }
}
