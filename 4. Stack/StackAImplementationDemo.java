package Stack;

public class StackAImplementationDemo {
    public static void main(String[] args) {
        Integer a [] = new Integer[2];
        StackA<Integer> st = new StackA<>(a);
        System.out.println("Is stack empty? " + st.isEmpty());
        st.push(1);
        st.push(2);
        st.printStack();
        st.pop();
        st.push(3);
        st.printStack();
        st.push(4);
        st.printStack();
        System.out.println("Is stack empty? " + st.isEmpty());
        System.out.println("top element without poping out : "+ st.top());
    }
}
