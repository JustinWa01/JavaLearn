package demo1;

public class Test_fzhuang {//外部使用类
    public static void main(String[] args) {
        Stu_Fzhuang f=new Stu_Fzhuang("jack");
        System.out.println(f.name);
        f.setScore(11);
        System.out.println(f.getScore());
        Stu_opreater opreater = new Stu_opreater(f);//传入一个Stu_Fzhuang类型的类——f
        opreater.printPass();
    }
}
