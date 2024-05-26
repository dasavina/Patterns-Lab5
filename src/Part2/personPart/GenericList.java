package Part2.personPart;

import java.util.ArrayList;

public class GenericList<T> {
    private ArrayList<T> list;

    public GenericList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public void remove(T element) {
        this.list.remove(element);
    }

    public ArrayList<T> getList() {
        return list;
    }
}

