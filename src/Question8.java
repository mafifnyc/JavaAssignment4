public class Question8 {
    static String isPositiveOrNagetive(int n) {
        if(n>0){
            return "Positve";
        }
        else if(n<0) {
            return "Nagetive";
        }
        else {
            return "Zero";
        }
    }

    public static void main(String[] args) {
        int number = -199;
        System.out.println(number + " is " + isPositiveOrNagetive(number));
    }
}
