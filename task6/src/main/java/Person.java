import java.util.Objects;

public class Person implements Cloneable{
    private String name;
    private int age;
    private float salary;
    private Cat cat;

    public Person(String name, int age, float salary, Cat cat) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cat = cat;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return 99 * this.age * this.name.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "Имя = " + name  +
                ", возраст(лет) = " + age +
                ", зарплата(в рублях) = " + salary +
                ", наличие кота = " + (cat.isExist() ? "есть" : "нет") +
                '}';
    }

    //Вариант клона 1 (через Cloneable)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Вариант клона 2 (через создание своего метода клон, который создает новый объект Person)
    public Person clone(String name) {
        return new Person (name, this.age, this.salary, this.cat);
    }

}
