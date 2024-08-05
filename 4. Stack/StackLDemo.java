package Stack;

public class StackLDemo {
    public static void main(String[] args) {
        StackL<Integer> st = new StackL<>();
        System.out.println("Is stackL empty : " + st.isEmpty());
        st.push(5);
        st.push(6);
        System.out.println("Is stackL empty : " + st.isEmpty());
        System.out.println("StackL size: " + st.l);
        st.printStack();
        st.push(10);
        st.push(12);
        System.out.println("StackL size: " + st.l);
        st.printStack();
        System.out.println("Popped out: " + st.pop());
        System.out.println("Now the stack is:");
        st.printStack();
        st.printStack();
        System.out.println("top element without poping out : "+ st.top());
        st.printStack();
    }
}
