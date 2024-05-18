

public class Worker extends Employee{
    public Worker(String name, String surname, float workExperience) {
        super(name, surname, Professions.WORKER, workExperience);
    }

    @Override
    public String toString() {
        return super.toString().replace("Employee", Professions.WORKER.getNameProfessions());
    }
}
