public class Question14 {
    public static String passOrFail(int n) {
        if(n>=50) {
            return "Pass";
        }
        else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        int mark = 45;
        System.out.println(passOrFail(mark));
    }
}
