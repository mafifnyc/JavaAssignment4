public class Student {
    String name;
    int roll_no;

    public Student(String n, int r) {
       name = n;
       roll_no = r;
    }

    public String getName() {
        return name;
    }
    public int getRoll_no() {
        return roll_no;
    }

    public static void main(String[] args) {
        Student s = new Student("John", 2);
        System.out.println(s.getName());
        System.out.println(s.getRoll_no());
    }

}