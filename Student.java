public class Student {
    public String name;
    public String id;
    public float cgpa;
    public String major;

    public void doStudy(){
         System.out.println("Did not study carefully\uD83D\uDE11");
    }
    public void display(){
        System.out.println( name + " " + id + " " + cgpa + "\n " + major);
    }
}
