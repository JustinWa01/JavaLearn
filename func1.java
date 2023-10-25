package Func;

public class func1 {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 6, 7};
        int[] arr2 = {3, 4, 6};
        System.out.println(equals(arr1, arr2));
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == null && array2 == null) {
            return true;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
