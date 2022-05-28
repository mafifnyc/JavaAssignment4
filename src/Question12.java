public class Question12 {
    public static void main(String[] args) {
        test(5);
    }
    public static void test(int n) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int specificValue = n;
        int i;
        for(i=0; i<9; i++) {
            int b = arr[i];
            if(b==specificValue) {
                System.out.println("The Specific Value " +specificValue+ " is in the Array");
            }
            else {
                System.out.println("The Specific Value " +specificValue+ " is not in the Array");//Couldn't figure out a way to stop the iteration of output.
            }
        }
    }
}
