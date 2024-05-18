import lombok.*;

@Data
@AllArgsConstructor
public abstract class Employee {
    private String name;
    private String surname;
    private Professions professions;
    private float workExperience;

    @Override
    public String toString() {
        return "Employee{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", Опыт работы=" + workExperience +
                '}';
    }

    public String getFullName() {
        return surname + " " + name;
    }
}
