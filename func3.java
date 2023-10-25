package Func;

public class func3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 7, 8};
        sort(array);
    }
    public static void sort(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i]);
            if (i != arr.length-1) {
                System.out.print(arr[i]+", ");
            } else {
                System.out.print(arr[i]+"] ");
            }

        }
    }
}
