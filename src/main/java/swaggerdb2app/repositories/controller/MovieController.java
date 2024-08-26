package swaggerdb2app.repositories.controller;

import swaggerdb2app.repositories.entities.Movie;
import swaggerdb2app.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @GetMapping("/{title}")
    public Movie getMovieByTitle(@PathVariable String title) {
        return movieRepository.findByTitle(title);
    }

    @DeleteMapping("/{title}")
    public void deleteMovieByTitle(@PathVariable String title) {
        Movie movie = movieRepository.findByTitle(title);
        if (movie != null) {
            movieRepository.delete(movie);
        }
    }
}
