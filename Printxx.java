package case1;

public class Printxx {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if(i==1)
            {System.out.print("    ");
                System.out.print("*");}
            if(i==5)
            {System.out.print("");
                System.out.print("*********");}
            for (int j = 2; j <= 5-i-1; j++) {//打印空格
                System.out.print(" ");//打印4个空格
            }
            System.out.print("*");
            for (int h = 0; h < (2*i-1); h+=2*i-3) {
                System.out.print("*");
            }
            System.out.println();//换行
        }
    }
}
