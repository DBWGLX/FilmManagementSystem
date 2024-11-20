package com.wyx.pojo;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MovieRepository {

    //使用注解的方式非常简洁，不需要额外的 XML 配置。
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
