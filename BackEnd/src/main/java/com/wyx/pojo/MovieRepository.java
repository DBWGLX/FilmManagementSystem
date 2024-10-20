package com.wyx.pojo;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MovieRepository {
    @Insert("INSERT INTO movies(title, genre, rating, YearOfIssue) VALUES(#{title}, #{genre}, #{rating}, #{YearOfIssue})")
    void insert(Movie movie);

    @Select("SELECT * FROM movies WHERE id = #{id}")
    Movie findById(Long id);

    @Select("SELECT * FROM movies")
    List<Movie> findAll();

    @Update("UPDATE movies SET title = #{title}, genre = #{genre}, YearOfIssue = #{YearOfIssue} WHERE id = #{id}")
    void update(Movie movie);

    @Delete("DELETE FROM movies WHERE id = #{id}")
    void delete(Long id);
}
