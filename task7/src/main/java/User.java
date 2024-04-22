public class User {
    private String name;
    private Profession profession;
    private float workExperience;

    public User(String name, Profession profession, float workExperience) {
        this.name = name;
        this.profession = profession;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return 1000 * workExperience * profession.getCoeff();
    }

    public float getSalary(float addCharges) {
        return (1000 * workExperience * profession.getCoeff()) + addCharges;
    }

}
