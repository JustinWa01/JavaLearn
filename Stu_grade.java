package demo1;

public class Stu_grade {
    String name;
    double chinese;
    double math;

    public void printAll(double chinese,double math){
        System.out.println(this);
        System.out.println(this.math);
        System.out.println(this.name+"的总成绩是"+(chinese+math));
    }
    public void printAverage(double chinese,double math){
        System.out.println(name+"的平均成绩是"+(chinese+math)/2);
    }
}
