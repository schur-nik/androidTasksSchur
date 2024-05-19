import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lesson lesson1 = new Lesson("Программирование");
        Lesson lesson2 = new Lesson("Базы данных");
        Lesson lesson3 = new Lesson("Администрирование");
        List<Lesson> level1 = new ArrayList<>();
        level1.add(lesson2);
        List<Lesson> level2 = new ArrayList<>();
        level2.add(lesson1);
        level2.add(lesson2);
        level2.add(lesson3);

        Student student1 = new Student("Person1", Sex.MAN, 18, level1);
        Student student2 = new Student("Person2", Sex.WOMAN, 22, level2);
        Student student3 = new Student("Person3", Sex.MAN, 17, level1);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(ManageStudents.getAllStudentOfMan(students));
        System.out.println(ManageStudents.getAllStudentOf20age(students));
        System.out.println(ManageStudents.getAllStudentOfTeachLess2Lesson(students));
        System.out.println(ManageStudents.getAllStudentOfTeachFindLesson(students, lesson1));
    }
}
