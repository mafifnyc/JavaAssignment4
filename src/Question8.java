public class Question8 {
    static String isPositiveOrNegative(int n) {
        if(n>0){
            return "Positive";
        }
        else if(n<0) {
            return "Negative";
        }
        else {
            return "Zero";
        }
    }

    public static void main(String[] args) {
        int number = -199;
        System.out.println(number + " is " + isPositiveOrNegative(number));
    }
}
