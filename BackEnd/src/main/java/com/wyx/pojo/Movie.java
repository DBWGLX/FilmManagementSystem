package com.wyx.pojo;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;
    private Double rating;
    private int YearOfIssue;

    public Movie() {}
    public Movie(Long id, String title, String genre, double rating, int year) {
        System.out.println("Inserting movie.year: " + year);
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating; // 初始化 rating
        this.YearOfIssue = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", YearOfIssue=" + YearOfIssue +
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
        this.YearOfIssue = yearOfIssue;
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
        return YearOfIssue;
    }
}
