import java.util.*;

public class ManagePersons {

    public static List<Person> getAllPersonOfMore2Tasks(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getWorkTasks().size() > 2) {
                result.add(person);
            }
        }
        return result;
    }

    public static Set<Person> getAllPersonOfSortWorkExperience(List<Person> persons) {
        return new TreeSet<>(persons);
    }

    public static String getAllUniqNames(List<Person> persons) {
        Set<String> result = new HashSet<>();
        for (Person person : persons) {
            result.add(person.getName());
        }
        return result.toString();
    }

}
