package Stack;

// defining a Stack using array i.e a static size stack/ static stack
public class StackA<T> {
    T[] data;
    int length;
    int top;
    StackA(T[] a){
        data = a;
        length = a.length;
        top = -1;
    }
    // defining the push() operation
    void push(T a){
        if (top < length -1) {
            top++;
            data[top] = a;
        }else{
            System.out.println("Stack overflow");
        }
    }

    // defining pop() method
    T pop(){
        T a = null;
        if (top == -1) {
            System.out.println("Stack undeerflow");
        }else{
            a = data[top];
            top--;
        }
        return a;
    }
    
    // checking stack is empty
    boolean isEmpty(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }

    // top() method --will not pop out the element
    T top(){
        T a = null;
        if (top == -1) {
            return null;
        }else{
            a = data[top];
            return a;
        }
    }

    // printing stack
    void printStack(){
        if (top == -1) {
            System.out.println("Stack is empty...!");
        }else{
            for (int i = top; i>=0; i--) {
                System.out.println(data[i]);
            }
            System.out.println();
        }
    }
}
