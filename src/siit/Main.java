package siit;

public class Main {

    public static void main(String[] args) {

//        OrderedRepo<Integer> orderedRepoInteger = new OrderedRepo<>();
//
//        orderedRepoInteger.save(3);
//        orderedRepoInteger.save(2);
//        orderedRepoInteger.save(5);
//        orderedRepoInteger.list();
//
//        OrderedRepo<String> orderedRepoString = new OrderedRepo<>();
//
//        orderedRepoString.save("Hi");
//        orderedRepoString.save("Bye");
//        orderedRepoString.list();

///////////////////////////////////////////////////////////////////////

//        SortedRepo<Integer> sortedRepoInteger = new SortedRepo<>();
//
//        sortedRepoInteger.save(1);
//        sortedRepoInteger.save(5);
//        sortedRepoInteger.save(2);
//        sortedRepoInteger.list();
//
//        SortedRepo<Integer> sortedRepoStrings = new SortedRepo<>();
//
//        sortedRepoStrings.save("Hi");
//        sortedRepoStrings.save("Bye");
//        sortedRepoStrings.list();
//        sortedRepoStrings.count();


 //////////////////////////////////////////////////////////////////////

        SortedRepo<Person> personSortedRepo = new SortedRepo<>();

        Person person1 = new Person("A");
        Person person2 = new Person("C");
        Person person3 = new Person("B");

        personSortedRepo.save(person1);
        personSortedRepo.save(person2);
        personSortedRepo.save(person3);
//        personSortedRepo.remove(person3);
        personSortedRepo.list();
    }
}

