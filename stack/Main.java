public class Main{
    public static void main(String[] args) {
        Stack st = new Stack();
        for(int i=0;i<10;i++){
            st.push(i);
        }

    //    int top = st.peek();
    //    System.out.println(top);

       st.printStack();

       if(st.isEmpty()){
        System.out.println("Empty Stack");
       }
       else{
        System.out.println("Not Empty");
       }



       System.out.println("Popped Element: " + st.pop());
       st.printStack();
    }
}