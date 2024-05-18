import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private String name;
    private float workExperience;
    private List<String> workTasks;

    @Override
    public int compareTo(Person o) {
        if (workExperience - o.getWorkExperience() > 0) {
            return -1;
        } else if (workExperience - o.getWorkExperience() < 0)  {
            return 1;
        } else {
            return 0;
        }
    }
}
