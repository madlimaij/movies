package com.madli.movies.movie;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> { // generic type; lisame, mis tüüpi andmetega tegeleme ja mis tüüpi on id
    Optional<Movie> findMovieByImdbId(String imdbId); //custom päring, Dynamic queries
}
