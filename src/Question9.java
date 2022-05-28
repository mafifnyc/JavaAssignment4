public class Question9 {
    public static void compareTwoNumbers(int x, int y) {
        if(x>y){
            System.out.println(x);
        }
        else {
            System.out.println(y);
        }
    }
    public static void compareThreeNumbers(int x, int y, int z) {
        if((x>y)&&(x>z)) {
            System.out.println(x);
        }
        else if((y>x)&&(y>z)) {
            System.out.println(y);
        }
        else {
            System.out.println(z);
        }
    }
    public static void compareFourNumbers(int x, int y, int z, int a) {
        if((x<y)&&(x<z)&&(x<a)) {
            System.out.println(x);
        }
        else if((y<x)&&(y<z)&&(y<a)) {
            System.out.println(y);
        }
        else if((z<x)&&(z<y)&&(z<a)) {
            System.out.println(z);
        }
        else {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Question9 compareNumbers = new Question9();
        compareNumbers.compareTwoNumbers(10,20);
        compareNumbers.compareThreeNumbers(10,20,30);
        compareNumbers.compareFourNumbers(10,20,30,40);
    }
}
