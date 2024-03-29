package com.franco.disney.api.Repositories;

import com.franco.disney.api.Entities.Celebrity;
import com.franco.disney.api.Entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    Optional<Movie> findMovieByTitle(String title);

    boolean existsByTitle(String title);

    Optional<Set<Movie>> findMovieByGenre_Id(Long genreId);

    Optional<Set<Movie>> findMovieByDateCreation(LocalDate localDate);

    Optional<Set<Movie>> findMovieByRate(Integer rate);
}
