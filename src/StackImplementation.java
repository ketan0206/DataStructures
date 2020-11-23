import java.util.EmptyStackException;

public class StackImplementation {

    public static void main(String[] args) {
        StackImplementation st = new StackImplementation(2);
        st.print();
        st.push(66);
        st.push(67);
        st.push(68);
        //st.push(69);
        System.out.println(st.pop());
        st.push(70);
        st.print();


    }

    int max;
    int[] stack;
    int top;

    public StackImplementation (int maxSize) {
        max=maxSize;
        stack=new int[max];
        top=-1;
    }

    public boolean push(int i) {
        if (top+1==max) throw new StackOverflowError();
        stack[++top] = i;
        return true;
    }

    public int pop() {
        if (top<0) throw new EmptyStackException();
        return stack[top--];
    }

    public int peek() {
        if (top<0) throw new EmptyStackException();
        return stack[top];
    }

    public void print() {
        for (int i=0; i<=top;i++) {
            System.out.print(stack[i] + "->");
        }
    }

}
