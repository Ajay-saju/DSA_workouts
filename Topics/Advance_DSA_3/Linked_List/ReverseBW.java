package Advance_DSA_3.Linked_List;

public class ReverseBW{

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
      Node A=  obj.create();
      reverse(A,2,4);
    //   obj.printList();

        
    }

    // @SuppressWarnings("null")
    public static void reverse(Node head , int b , int c){

        Node first = head ;
        Node last = null ;
        Node start = null ;
        Node end = null ;
        Node temp = head ;

        if( temp.data == b){
            start = temp;
        }
        
        while( temp != null){

            if( temp.data == b){
                start = temp.next;

            }
            if( head.next.data == b){
                first = head;
                break;
                
            }
            if( temp.data == c){
                end = temp;
                last = temp.next;
            }
            
            temp = temp.next;
            head =temp;
        }
    Node rhead=    reverseLL(start,last);
    first.next = rhead;
    start.next = last;
    LinkedList.printList();

       

    }
    public static Node reverseLL( Node head, Node end){

        Node preNode = null ;
        Node currNode = head ;
        while( currNode != end){
            Node nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode= nextNode;
            
        }
        return preNode;
        
       } 

}