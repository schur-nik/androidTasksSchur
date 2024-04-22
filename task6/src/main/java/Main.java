public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Валера", 22, 4000.5f, new Cat());

        //Вариант клона 1 (через Cloneable)
        Person person2 = (Person) person1.clone();
        person2.setName("Никита");

        //Вариант клона 2 (через создание своего метода клон, который создает новый объект Person)
//        Person person2 = person1.clone("Никита");

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.equals(person2));

    }
}
