package case1;

import java.util.Scanner;

public class Passwordset {
    public static void main(String[] args) {
        int[] iii = process(2748);
        System.out.print("加密后的结果是：");
        for (int i = 0; i < iii.length; i++) {
            System.out.print(iii[i]);
        }
    }
    //输入密码->处理密码（单位数字）得到数组->对获取的数组进行加密处理（调用颠倒函数）->输出加密后的密码
    //加密处理，调用拆分，颠倒方法
    public static int[] process(int n) {
        int[] passWord = password(n);
        for (int i = 0; i < passWord.length; i++) {
            passWord[i] = (passWord[i] + 5) % 10;
        }
        int[] end = reverse(passWord);
        return end;
    }
    //拆分密码，并将其放入数组
    public static int[] password(int num) {
        Scanner sc = new Scanner(System.in);
        int[] passWord = new int[4];
        passWord[0] = num / 1000;
        passWord[1] = (num / 100) % 10;
        passWord[2] = (num / 10) % 10;
        passWord[3] = num % 10;
        return passWord;
    }
    //颠倒方法
    public static int[] reverse(int[] a) {
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
        return a;
    }
}
