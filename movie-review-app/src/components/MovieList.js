import React, { useState, useEffect } from "react";
import MovieItem from "./MovieItem";

function MovieList() {
  const [movies, setMovies] = useState([]);

  useEffect(() => {
    fetch("/movies.json") // Fetch JSON file from the public folder
      .then((response) => response.json())
      .then((data) => setMovies(data))
      .catch((error) => console.error("Error loading movie data:", error));
  }, []);

  return (
    <div className="container mt-4">
      <h2 className="text-primary">Movie Reviews</h2>
      <div className="row">
        {movies.map((movie) => (
          <MovieItem key={movie.imdbID} movie={movie} />
        ))}
      </div>
    </div>
  );
}

export default MovieList;
