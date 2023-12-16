public class Stack {
    Node head=null;
    
    // Insert element to the stack
    void push(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    // return top element from the stack
    int peek(){
        if(head!=null){
            return head.data;
        }

        return -1;
    }

    // pop the last added element 
    int pop(){
        if(head==null){
            return -1;
        }
        Node temp = head;
        head=head.next;
        return temp.data;
    }

    // print stack
    void printStack(){
        if(head==null){
            return; 
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    // check is it empty or not
    boolean isEmpty(){
        if(head==null){
            return true;
        }

        return false;
    }
}