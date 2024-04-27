import java.util.ArrayList;
import java.util.List;

public class Director extends Employee{
    private List<Employee> workers = new ArrayList<>();

    public Director(String name, String surname, float workExperience) {
        super(name, surname, Professions.DIRECTOR, workExperience);
    }

    public void addWorker(Employee worker) {
        workers.add(worker);
    }

    private String getAllWorkers() {
        String result = "\n";
        for (Employee worker : this.workers) {
            result = result + worker.toString() + "\n";
        }
        return result;
    }
    @Override
    public String toString() {
        String result = super.toString().replace("Employee", Professions.DIRECTOR.getNameProfessions());
        if (!workers.isEmpty()) {
            result =  result + "\n" + this.getFullName() + " - список сотрудников в подчинении: " + getAllWorkers();
        }
        return result;
    }

    public List<Employee> getWorkers() {
        return workers;
    }
}
