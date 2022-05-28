public class Question11 {
    static String  positveOrNagetive(int n) {
        if(n>0) {
            return "Positive";
        }
        else if(n<0) {
            return "Nagetive";
        }
        else if(Math.abs(n)<1) {
            return "Small";
        }
        else if(Math.abs(n)>1000000) {
            return "Large";
        }
        else {
            return "Zero";
        }
    }

    public static void main(String[] args) {
        int number = 1000001;
        System.out.println(number + " is " + positveOrNagetive(number));
    }
}
