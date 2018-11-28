package siit;

public interface IRepo<T> {

    void save(T obj);

    void remove(T obj);

    void list();

    void count();
}
