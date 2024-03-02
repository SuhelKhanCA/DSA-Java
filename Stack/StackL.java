package Stack;

// creating a stack on the concept of linked-list
public class StackL<T> {
    JLinkedList<T> top; // header to the linked-list
    int l; // length of the list

    StackL(){
        top = new JLinkedList<T>();
        l = 0;
    }

    // push() method
    void push(T data){
        l++;
        this.top.insertFront(data);
    }
    // pop()
    T pop(){
        T a = null;
        if (!this.top.isEmpty()) {
            l--;
            a = this.top.deleteFront();
        }else{
            System.out.println("Stack underflow....!");
        }
        return a;
    }

    // top()
    T top(){
        if (this.top.isEmpty()) {
            return null;
        }else{
             return this.top.head.next.data;
        }
    }

    // checking stack is empty or not
    boolean isEmpty(){
        if (this.top.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }

    // printing stackL
    void printStack(){
        if (this.top.isEmpty()) {
            System.out.println("Stack is empty...!");
        }else{
            this.top.printList();
        }
    }
}
