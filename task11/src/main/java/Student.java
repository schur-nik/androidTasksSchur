import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private Sex sex;
    private int age;
    private List<Lesson> lessons;
}
