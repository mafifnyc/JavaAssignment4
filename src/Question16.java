public class Question16 {
    public static void main(String[] args) {
        int number = 5;
        String numString = "Unreognized Number";
        switch (number) {
            case 1:
                numString = "ONE";
                break;
            case 2:
                numString = "TWO";
                break;
            case 3:
                numString = "THREE";
                break;
            case 4:
                numString = "FOUR";
                break;
            case 5:
                numString = "FIVE";
                break;
            case 6:
                numString = "SIX";
                break;
            case 7:
                numString = "SEVEN";
                break;
            case 8:
                numString = "EIGHT";
                break;
            case 9:
                numString = "NINE";
                break;
            case 10:
                numString = "OTHER";
                break;
        }
        System.out.println(numString);
    }
}
