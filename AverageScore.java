package case1;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        double b = getAveragescore(4);//评委打分
        System.out.println(b);
    }
    public static double getAveragescore(int n) {
        Scanner sc = new Scanner(System.in);
        int[] allscore = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分");
            allscore[i] = sc.nextInt();
        }
        for (int i = 1; i < allscore.length; i++) {
            if (allscore[i] < allscore[i - 1]) {
                int temp = allscore[i];
                allscore[i] = allscore[i - 1];
                allscore[i - 1] = temp;
            } else continue;
        }
        double sum = 0;
        for (int i = 1; i < allscore.length - 1; i++) {
            sum += allscore[i];
        }
        return (sum / (n - 2));
    }
}
