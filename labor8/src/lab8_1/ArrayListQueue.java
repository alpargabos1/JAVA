package lab8_1;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue{

    private final int CAPACITY;
    private ArrayList<Object> items;

    public ArrayListQueue(int CAPACITY) {
        this.items = new ArrayList<>();
        this.CAPACITY = CAPACITY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        return Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean isFull() {
        return items.size() == CAPACITY;
    }

    @Override
    public void enQueue(Object object) {
        if(!isFull()){
            items.add(object);
        }
        else{
            System.out.println("Queue is full!!");
        }
    }

    @Override
    public Object deQueue() {
        if(!isEmpty()){
            return items.remove(0);
        }
        System.out.println("Queue is empty!!");
        return null;
    }

    @Override
    public void printQueue() {
        System.out.println("ArrayListQueue:" + items);
    }
}
