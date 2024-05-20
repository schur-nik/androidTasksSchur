import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task 1
        ArrayList<Person> persons = getPeople();

        System.out.println(ManagePersons.getAllPersonOfMore2Tasks(persons));
        //не совсем понял, что значит используйте подходящие коллекции - поэтому как вышло
        System.out.println(ManagePersons.getAllPersonOfSortWorkExperience(persons));
        System.out.println(ManagePersons.getAllUniqNames(persons));

        //Task 2
        String[] strings = {"a", "b", "a", "c", "b"};
        System.out.println(MapService.uniqStringMap(strings));

        String[] strings1 = {"c", "b", "a"};
        System.out.println(MapService.uniqStringMap(strings1));

        String[] strings2 = {"c", "c", "c", "c"};
        System.out.println(MapService.uniqStringMap(strings2));
    }

    private static ArrayList<Person> getPeople() {
        List<String> workTasksDir = new ArrayList<>();
        workTasksDir.add("Кофе");
        workTasksDir.add("Спать");

        List<String> workTasksPer = new ArrayList<>();
        workTasksPer.add("Кофе");
        workTasksPer.add("Работа");
        workTasksPer.add("Дейлик");

        Person person1 = new Person("Person1", 2.1f, workTasksDir);
        Person person2 = new Person("Person1", 2.9f, workTasksPer);
        Person person3 = new Person("Person2", 3.2f, workTasksPer);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        return persons;
    }

}
