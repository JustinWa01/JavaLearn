package case1;

import java.util.Random;
import java.util.Scanner;

public class SelectNunber {
    public static void main(String[] args) {
        int[] userselect = selectNumber();
        System.out.println("您选择的号码是:");
        geShiHuaOut(userselect);//双色球开发
        int[] luckeyNumber = suiJi();
        System.out.println("中奖号码是:");
        geShiHuaOut(luckeyNumber);
        judge(userselect,luckeyNumber);
    }
    public static int[] selectNumber() {
        int[] numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        //遍历前6个位置输入红球号码
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                System.out.println("请输入第"+(i + 1)+ "位红球抽奖号码(1~33):");
                int number = sc.nextInt();
                if (number < 1 || number > 33) {
                    System.out.println("输入有误！请输入1~33之间的号码！");
                } else//号码为正常号码
                {
                    if (check(numbers, number)) {
                        numbers[i] = number;
                        break;
                    } else
                        System.out.println("您输入的数已经选过了，请重新输入！");
                }
            }
        }
        //蓝球号码
        while (true) {
            System.out.println("输入蓝色球号码（1~16）：");
            int number = sc.nextInt();
            if (number < 1 || number > 16)
                System.out.println("输入号码不对！，请输入1~16之间的数");
            else {
                numbers[6] = number;
                break;
            }
        }
        return numbers;
    }//提示用户输入

    public static boolean check(int[] a, int b) {//判断是否重复(check方法)
        for (int i = 0; i < a.length - 1; i++) {
            if (b == a[i])
                return false;
        }
        return true;
    }//判断是否重复(check方法)

    public static void geShiHuaOut(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(i == a.length - 1 ? a[i] : a[i] + ", ");
        }
        System.out.println("]");
    }//格式化输出

    public static int[] suiJi() {
        int[] luckey = new int[7];//存放抽奖代码
        Random r = new Random();
        for (int i = 0; i < luckey.length - 1; i++) {
            while (true) {
                int number1 = r.nextInt(34);
                if (check(luckey, number1)) {
                    luckey[i] = number1;
                    break;
                } else
                    continue;
            }
        }
        luckey[6] = r.nextInt(16) + 1;
        return luckey;
    }//随机生成中奖号码

    public static void judge(int[]user,int[]luck){
    int red = 0;
    int blue = 0;
        for (int i = 0; i < user.length-1; i++) {
        for (int j = 0; j < luck.length-1; j++) {
            if(user[i]==luck[j]){
                red++;
                break;
            }else
                continue;
        }
        blue=user[6]==luck[6]? 1:0;
    }
        if(blue==0){
            switch (red){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("恭喜您中奖10元！");
                    break;
                case 5:
                    System.out.println("恭喜您中奖200元！");
                    break;
                case 6:
                    System.out.println("恭喜您中奖10000000元！");
                    break;
            }
            System.out.println("感谢您为福利事业做出的巨大贡献！");
        }else
        {
            switch (red){
                case 1:
                    System.out.println("恭喜您中奖5元！");
                case 2:
                    System.out.println("恭喜您中奖10元！");
                case 3:
                    System.out.println("恭喜您中奖20元！");
            }
            System.out.println("感谢您为福利事业做出的巨大贡献！");
        }
}
}