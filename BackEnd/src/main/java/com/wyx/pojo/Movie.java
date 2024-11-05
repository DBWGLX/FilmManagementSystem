package com.wyx.pojo;

import jakarta.persistence.*;

@Entity//标识这是一个 JPA 实体类，对应数据库中的一个表。
@Table(name = "movies")//指定映射到数据库中的 movies 表。如果表名与类名相同，@Table 注解可以省略。
public class Movie {
    @Id//指定该字段是实体的主键。
    @GeneratedValue(strategy = GenerationType.IDENTITY)//表示主键由数据库自动生成
    private Long id;

    private String title;
    private String genre;
    private double rating;
    private int yearOfIssue;

    public Movie() {}
    public Movie(Long id, String title, String genre, double rating, int year) {
        System.out.println("Inserting movie.year: " + year);
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating; // 初始化 rating
        this.yearOfIssue = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setYearOfIssue(int yearOfIssue) {
        System.out.println("setingYear: " + yearOfIssue);
        this.yearOfIssue = yearOfIssue;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }
}
