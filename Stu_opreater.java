package demo1;

public class Stu_opreater {//操作类
    private Stu_Fzhuang Stu;//表示引用的是哪个类

    //构造器
    public Stu_opreater(Stu_Fzhuang stu){
        this.Stu=stu;
    }//有参构造器
                        //传入的参数类型       赋值后后面直接调用Fzhuang类的成员变量和方法（必须是传入的类所拥有的）；
    public void printPass(){
        if(Stu.getScore()>60){
            System.out.println(Stu.name+"成绩合格");
        }else
            System.out.println(Stu.name+"成绩不及格");
    }
}
