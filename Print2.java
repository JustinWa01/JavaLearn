package case1;

public class Print2 {
    public static void main(String[] args) {
        int n = 5; // 三角形的行数

        for (int i = 1; i <= n; i++) {
            // 打印空格
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // 换行
            System.out.println();
        }
    }
}
