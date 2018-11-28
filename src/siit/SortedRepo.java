package siit;

import java.util.Set;
import java.util.TreeSet;

public class SortedRepo<T> implements IRepo<T> {

    private Set<T> myList;

    public SortedRepo() {
        this.myList = new TreeSet<>();
    }

    @Override
    public void save(T obj) {
        myList.add(obj);
    }

    @Override
    public void remove(T obj) {
        myList.remove(obj);
    }

    @Override
    public void list() {
        System.out.println(myList);
    }

    @Override
    public void count() {
        System.out.println(myList.size());
    }
}
