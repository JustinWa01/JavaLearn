package case1;

public class Foundsusu {
    public static void main(String[] args) {
        String h = foundsusu(20, 30);
        System.out.println(h);
    }
    public static String foundsusu(int a, int b) {
        if (b == 2 || a > b)
            System.out.println("请重新输入");
        String founded = "";
        for (int i = a; i < b; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                founded += i + " ";
            }
        }
        return founded;
    }
}
