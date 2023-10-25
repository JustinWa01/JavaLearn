package Array_prac;

import java.util.Random;
import java.util.Scanner;

public class DiandaoArray {
    public static void main(String[] args) {
        int[] imploee = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < imploee.length; i++) {
            System.out.println("please input 第 " + (i + 1) + "个 imploee number!:");
            imploee[i] = sc.nextInt();
        }
        int temp = 0;
        Random r = new Random();
        for (int i = 0; i < imploee.length; i++) {
            int t = r.nextInt(5);
            temp = imploee[t];
            imploee[t] = imploee[i];
            imploee[i] = temp;
        }
        for (int i = 0; i < imploee.length; i++) {
            System.out.println(imploee[i]);
        }
    }
}
