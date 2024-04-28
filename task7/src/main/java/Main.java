public class Main {
    public static void main(String[] args) {
        //Task 1
        User user1 = new User("Никита", Profession.WORKER, 3.2f);
        User user2 = new User("Дмитрий", Profession.DIRECTOR, 8f);
        User user3 = new User("Анна", Profession.HR, 2.1f);

        System.out.println(user1.getName() + ": зарплата " + user1.getSalary());
        System.out.println(user2.getName() + ": зарплата " + user2.getSalary());
        System.out.println(user3.getName() + ": зарплата " + user3.getSalary(380.20f));

        //Task 2
        Animals animals = new Animals();
        animals.doVoice(new Cat());
        animals.doVoice(new Dog());
    }
}
