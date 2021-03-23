package lab6_2;

import java.util.ArrayList;

public class StackAggregation {
    private int capacity;
    private ArrayList<Object> items;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<Object>();
    }

    public void push(Object obj) {
        if (!isFull()) {
            items.add(obj);
        } else {
            System.out.println("Stack is full!");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            items.remove(items.get(getSize()-1));
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public Object top(){
        if(!isEmpty()){
            return items.get(getSize() - 1);
        }
        else{
            System.out.println("Stack is empty!");
            return null;
        }
    }

    public boolean isFull() {
        return (items.size() == capacity);
    }

    public boolean isEmpty() {
        return (items.size() == 0);
    }

    public int getSize(){
        return items.size();
    }
}
