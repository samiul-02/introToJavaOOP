//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.name = "Samiul Hoque\n";
        obj1.id = "241-15-452\n";
        obj1.cgpa = 3.00f;
        obj1.major = "Computer Science\n";
        obj1.doStudy();
        obj1.display();

        Teacher obj2 = new Teacher();
        obj2.name = "Shuvro Sarkar\n";
        obj2.designation = "Professor\n";
        obj2.department = "Computer Science\n";
        obj2.teach();
        obj2.display();
    }
}