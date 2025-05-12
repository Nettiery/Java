package exercise6;

import java.util.List;


interface BaseIterator <T>{
    T next();
    boolean hasNext();
    void reset();
}

public class AnimalIterator implements BaseIterator <Animal> {
    private final List<Animal> array;
    private int index;

    AnimalIterator(List<Animal> array) {
        this.array = array;
        this.index = 0;
    }

    public Animal next() {
        if (hasNext()) {
            return array.get(index++);
        } else
            return null;
    }

    public boolean hasNext() {
        return index < array.size();
    }

    public void reset() {
        index = 0;
    }

}