package rocks.zipcodewilmington.week5;

import java.util.Stack;

/**
 * @author leon on 7/10/18.
 */
public class ProperStack<E> {
    private Stack<E> stack;
    public ProperStack(Stack<E> stack){
        this.stack = stack;
    }

    public E pop() {
        return stack.pop();
    }

    public void push(E element) {
        stack.push(element);
    }

    public E peek() {
        return stack.peek();
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }

    public Integer size() {
        return stack.size();
    }
}

