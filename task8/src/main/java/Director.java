import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Director extends Employee{
    private List<Employee> workers = new ArrayList<>();

    public Director(String name, String surname, float workExperience) {
        super(name, surname, Professions.DIRECTOR, workExperience);
    }

    public void addWorker(Employee worker) {
        workers.add(worker);
    }

    private String getAllWorkers() {
        StringBuilder result = new StringBuilder("\n");
        for (Employee worker : this.workers) {
            result.append(worker.toString()).append("\n");
        }
        return result.toString();
    }
    @Override
    public String toString() {
        String result = super.toString().replace("Employee", Professions.DIRECTOR.getNameProfessions());
        if (!workers.isEmpty()) {
            result =  result + "\n" + this.getFullName() + " - список сотрудников в подчинении: " + getAllWorkers();
        }
        return result;
    }

}
