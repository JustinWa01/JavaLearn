package demo1;

public class Test_stu {
    public static void main(String[] args) {
        Stu_grade s1 = new Stu_grade();
        s1.name="jack";
        s1.math=99;
        s1.chinese=100;
        System.out.println();
        s1.printAll(s1.chinese, s1.math);

        Stu_grade s3 = new Stu_grade();
        s3.chinese=33;
        s3.name="lucy";
        s3.printAll(s3.chinese, 0);
    }
}
