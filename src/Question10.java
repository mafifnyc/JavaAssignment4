public class Question10 {
    public static void equalDifferent(int x, int y, int z) {
        if((x==y)&&(y==z)&&(x==z)) {
            System.out.println("All Numbers Are Equal");
        }
        else if ((x!=y)&&(y!=z)&&(x!=z)) {
            System.out.println("All Numbers Are Different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void main(String[] args) {
        Question10 numbers = new Question10();
        numbers.equalDifferent(1,1,1);
    }
}
