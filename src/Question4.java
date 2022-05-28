public class Question4 {
    static boolean isEven(int n) {
        return n%2==0;
    }

    public static void main(String[] args) {
        if(isEven(11)) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

}
