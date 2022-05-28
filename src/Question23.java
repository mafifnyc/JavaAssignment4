public class Question23 {
    public void isMultiple(int x, int y){
        if(x%y==0) {
            System.out.println(x + " is a multiple of " + y);
        }
        else {
            System.out.println(x + " is not a multiple of " + y);
        }
    }

    public static void main(String[] args) {
        Question23 a = new Question23();
        a.isMultiple(10,3);
    }
}
