package com.wyx.pojo;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MovieRepository {
    @Insert("INSERT INTO movies(title, genre, rating, yearOfIssue) VALUES(#{title}, #{genre}, #{rating}, #{yearOfIssue})")
    void insert(Movie movie);

    @Select("SELECT * FROM movies WHERE id = #{id}")
    Movie findById(Long id);

    @Select("SELECT * FROM movies")
    List<Movie> findAll();

    @Update("UPDATE movies SET title = #{title}, genre = #{genre}, yearOfIssue = #{yearOfIssue} WHERE id = #{id}")
    void update(Movie movie);

    @Delete("DELETE FROM movies WHERE id = #{id}")
    void delete(Long id);
}
