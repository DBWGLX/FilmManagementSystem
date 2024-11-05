package com.wyx.pojo;

import com.wyx.pojo.Movie;
import com.wyx.pojo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//RESTful API
@RestController//组合注解，等价于 @Controller【处理客户端请求】 和 @ResponseBody【返回数据写入响应体】
@RequestMapping("/api/movies")//
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @PostMapping
    public void addMovie(@RequestBody Movie movie) {
        System.out.println("Inserting movie: "+movie);
        movieRepository.insert(movie);
    }

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable Long id) {
        return movieRepository.findById(id);
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @PutMapping("/{id}")
    public void updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        movieRepository.update(movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) {
        movieRepository.delete(id);
    }
}
