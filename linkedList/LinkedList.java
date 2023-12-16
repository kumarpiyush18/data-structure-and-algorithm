public class LinkedList {
    
    Node head = null;
    void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println();
    }
    
    void insertNodeAtFirst( int data){
        Node newNode  = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next = head;
            head=newNode;
        }
        
    }


    void insertAtLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp=temp.next;
            }

            temp.next=newNode;
        }
    }


    int length(){
        int count=0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        return count;
    }


    

}
