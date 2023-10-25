package Array_prac;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        //数组的三种写法；
        //第一种：数据类型[] 数组名 = new 数据类型[]{数据1，数据2...};
        //int[] ages = new int[]{12, 13, 45};
        //第二种：数据类型[] 数组名 ={数据1，数据2...};(推荐)
        //int[] ages2 = {12, 13, 45};
        //第三种：数据类型 数组名[] ={数据1，数据2...};
        int[] ages = new int[5];

        for (int n = 0; n < ages.length; n++) {
            Scanner sc = new Scanner(System.in);
            ages[n] = sc.nextInt();
        }
        int sun = 0;
        for (int i = 0; i < ages.length; i++) {
            sun = sun + ages[i];
        }
        System.out.println(sun);
        int max = ages[0];
        for (int j = 1; j < ages.length; j++) {
            if (ages[j] > max) {
                max = ages[j];
            }
        }
        System.out.println(max);
    }
}
