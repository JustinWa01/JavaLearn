package demo1;

public class Stu_Fzhuang {//数据类
    //合理隐藏，合理暴露
    //主要是用public，private等来修饰
    //如果一个成员变量需要隐藏，外界又要访问，那么就可以调用方法
    private int score;
    String name;
    public int getScore() {
            if(this.score>100||this.score<0)
            {
                System.out.println("非法输入！");
            }
        return score;
    }
    //赋值分数
    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    //构造器：在创建类时赋值
    public Stu_Fzhuang(String name){
        this.name=name;
    }
    //无参构造器
    public Stu_Fzhuang() {
    }
}
