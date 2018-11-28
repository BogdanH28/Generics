package siit;

import java.util.LinkedHashSet;
import java.util.Set;

public class OrderedRepo<T> implements IRepo<T> {

    private Set<T> myList;


    public OrderedRepo() {
        this.myList = new LinkedHashSet<>();
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
        for (Object object: myList) {
            System.out.print(object + " ");
        }
        System.out.println();
        System.out.println("=================");
    }

    @Override
    public void count() {
        System.out.println(myList.size());
    }
}
