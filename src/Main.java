import com.figures.Circle;
import com.figures.Rectangle;
import com.figures.Shape;
import com.students.Aspirant;
import com.students.Student;

public class Main {
    public static void useStudent() {
        Student[] students = new Student[5];
        students[0] = new Student("Иван", "Иванов", "4-44", 3.5);
        students[1] = new Student("Андрей", "Андреев", "3-41", 4.9);
        students[2] = new Aspirant("Игорь", "Игорев", "2-44А", 5, "Работа по нейросетям");
        students[3] = new Aspirant("Мария", "Иголкина", "1-44А", 5, "Работа по квантовой физике");
        students[4] = new Student("Павел", "Павлов", "2-42", 5);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getScholarship());
        }
    }

    public static void useFigures() {
        Circle circle = new Circle(4, 5, 3);
        Rectangle rectangle = new Rectangle(new int[]{3, 6}, new int[]{10, 1});
        Shape[] shapes = {circle, rectangle};

        for (Shape shape: shapes) {
            shape.draw();
        }
    }
    public static void main(String[] args) {
        System.out.println("====================Класс Student====================");
        useStudent();

        System.out.println("====================Класс Shape======================");
        useFigures();

    }
}
