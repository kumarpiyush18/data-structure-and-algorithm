public class Main {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        for(int i=0;i<10;i++){
            list.insertAtLast(i);
        }

        list.printList();
        
        int len = list.length();
        System.out.println("size of the linked list :" + len);
    }
}
