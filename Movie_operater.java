//操作
//由Test_movie调用
package demo2;

import java.util.Scanner;

public class Movie_operater {

    //声明Movie_data类
    private Movie_data[] movies;
    //有参构造器

    public Movie_operater(Movie_data[] movies) {
        this.movies = movies;
    }
    //无参构造器

    public Movie_operater() {
    }
    //开始操作
    //1、显示全部电影信息——先传入电影信息(数组形式)，每传入一部，然后通过调用get方法，显示每部电影的属性
    public static void printAll(Movie_data[] movies){
        System.out.println("===ALLMOVIES===");
        for (int i = 0; i < movies.length; i++) {
            System.out.println("ID:"+movies[i].getId());
            System.out.println("主演："+movies[i].getActor());
            System.out.println("导演："+movies[i].getDirector());
            System.out.println("评分："+movies[i].getScore());
            System.out.println("名称："+movies[i].getName());
            System.out.println("价格："+movies[i].getPrice());
        }
    }
    //根据ID查询电影
    public static void searchMoviesById(Movie_data[] movies){
        int shuru= 0;
        while (true) {
            System.out.println("请输入ID：");
            Scanner sc =new Scanner(System.in);
            shuru = sc.nextInt();
            if(shuru>4||shuru<1){
                System.out.println("您输入的ID不存在，请重新输入！");
            }else break;
        }
            for (int i = 0; i < movies.length; i++) {
                if(shuru==movies[i].getId()){
                    System.out.println("ID："+movies[i].getId());
                    System.out.println("电影名："+movies[i].getName());
                    System.out.println("主演："+movies[i].getActor());
                    System.out.println("导演："+movies[i].getDirector());
                    System.out.println("价格："+movies[i].getPrice());
                    System.out.println("评分："+movies[i].getScore());
                }
            }

    }
}


