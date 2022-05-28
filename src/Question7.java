public class Question7 {
    static String checkAge(int n){
        if(n>=18) {
            return "Eligible";
        }
        else {
            return "Ineligible";
        }
    }

    public static void main(String[] args) {
        int age = 20;
        System.out.println("He/She is " + checkAge(age));

    }
}
