//数据
package demo2;

public class Movie_data {
    private String actor;
    private String director;
    private String name;
    private double score;
    private double price;
    private int id;

    public Movie_data() {
    }

    public Movie_data(String actor, String director, String name, double score, double price, int id) {
        this.actor = actor;
        this.director = director;
        this.name = name;
        this.score = score;
        this.price = price;
        this.id = id;
    }
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
