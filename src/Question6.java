public class Question6 {
    static int salary;
    public static void printInfo(String name, int age, String phoneNumber, int salary) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Salary: " + salary);
    }
    public void bonus() {
        int salaryWithBonus = salary + salary*5/100 ;
        System.out.println("Monthly Salary with 5% Bonus: " +salaryWithBonus);
    }

    public static void main(String[] args) {
        salary = 10000;
        Question6 employeeInfo = new Question6();
        employeeInfo.printInfo("John Smith", 25, "+13471234567", 10000);
        employeeInfo.bonus();

    }
}
