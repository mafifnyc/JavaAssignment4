public class Question12 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(test(arr, 5));
    }
    public static boolean test(int[] arr,int a) {




        for(int n : arr) {
            if(n==a) {
                return true;
            }
            }
        return false;
        }
    }

