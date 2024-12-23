import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Student.readStudentsFromFile("C:\\Users\\torti\\OneDrive\\Рабочий стол\\Асик ооп 1\\students.txt");
        for (Student student : students) {
            System.out.println(student);
            System.out.println("GPA: " + student.calculateGPA());
        }
        List<Teacher> teachers = Teacher.readTeachersFromFile("C:\\Users\\torti\\OneDrive\\Рабочий стол\\Асик ооп 1\\teachers.txt");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
