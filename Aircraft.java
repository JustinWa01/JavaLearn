package case1;

public class Aircraft {
    public static void main(String[] args) {
        double price = calculate(1000, 10, "经济舱");
        System.out.println(price);
    }

    public static double calculate(double price, int mouth, String type) {
        if (mouth > 4 && mouth < 11)
            return ((type.equals("头等舱")) ? price * 0.85 : price * 0.7);
        else
            return ((type.equals("头等舱")) ? price * 0.9 : price * 0.65);
    }

}

