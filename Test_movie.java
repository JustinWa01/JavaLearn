//定义实际数据

package demo2;

public class Test_movie {
    public static void main(String[] args) {
        Movie_data[] movies=new Movie_data[4];
        movies[0]=new Movie_data("周星驰","lizi","lizi0",55,66,1);
        movies[1]=new Movie_data("周星驰","lizi1","lizi1",66,66,2);
        movies[2]=new Movie_data("周星驰","lizi2","lizi2",78,66,3);
        movies[3]=new Movie_data("周星驰","lizi3","lizi3",88,66,4);

        Movie_operater[] movies2 = new Movie_operater[4];
        Movie_operater.printAll(movies);
        Movie_operater.searchMoviesById(movies);
    }
}
