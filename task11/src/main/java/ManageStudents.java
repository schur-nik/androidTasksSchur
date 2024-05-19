import java.util.ArrayList;
import java.util.List;

public class ManageStudents {
    //вывести всех юношей
    public static List<Student> getAllStudentOfMan(List<Student> students) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getSex() == Sex.MAN) {
                result.add(student);
            }
        }
        return result;
    }

    //найти всех студентов старше 20 лет
    public static List<Student> getAllStudentOf20age(List<Student> students) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > 20) {
                result.add(student);
            }
        }
        return result;
    }

    //найти всех студентов, которые посещают менее 2 занятий
    public static List<Student> getAllStudentOfTeachLess2Lesson(List<Student> students) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getLessons().size() < 2) {
                result.add(student);
            }
        }
        return result;
    }

    //найти всех студентов, которые посещают занятие - программирование
    public static List<Student> getAllStudentOfTeachFindLesson(List<Student> students, Lesson lesson) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getLessons().contains(lesson)) {
                result.add(student);
            }
        }
        return result;
    }
}
