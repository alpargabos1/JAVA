package lab6_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList {

    private int capacity;

    public StackInheritance(int capacity) {
        this.capacity = capacity;
    }

    public int getSize()
    {
        return this.size();
    }

    public boolean isFull() {
        return (capacity == size());
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public Object top() {
        if (!isEmpty())
            return this.get(this.size() - 1);
        System.out.println("Stack is empty!\n");
        return null;
    }

    public void push(Object obj) {
        if (this.size() < capacity) {
            this.add(obj);
            return;
        }

        System.out.println("Stack is full!\n");
    }

    public void pop() {
        if (!isEmpty()) {
            this.remove(this.size() - 1);
            return;
        }

        System.out.println("Stack is empty!\n");
    }
}