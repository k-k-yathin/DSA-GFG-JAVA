
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}

class Solution {
    public Node cloneLinkedList(Node head) {
        if(head==null) return null ;
        
        HashMap<Node, Node> map = new HashMap<>();
        Node curr = head;
        
        while(curr!= null){
            map.put(curr, new Node(curr.data));
            curr=curr.next;
        }
        
        curr = head;
        while(curr != null){
            Node copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}
