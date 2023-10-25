package case1;

public class Foundsusu_2 {
    public static void main(String[] args) {
        for (int i = 100; i < 200; i++) {
            if(foundsusu(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean foundsusu(int a) {
        for (int j = 2; j < a/2; j++) {
                if (a % j == 0) {
                    return false;
                }
            }
        return true;
    }
}
