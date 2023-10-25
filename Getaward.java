package case1;

import java.util.Random;
import java.util.Scanner;

public class Getaward {
    public static void main(String[] args) {
      int[]arr1={333,444,555,666,777};
        getAward(arr1);
    }
    public static void getAward(int[]arr){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {//for循环用于决定第几个用户抽奖
            System.out.println("请输入任意键开始抽奖");
            sc.next();
            while (true) {
                int type = r.nextInt(5);
                int money = arr[type];
                if(money!=0){
                    System.out.println("恭喜你抽中："+money);
                    arr[type]=0;
                    break;
                }
            }
        }
        System.out.println("活动结束");
    }

}
