import React, { useState } from "react";
import ReviewForm from "./ReviewForm";

function MovieItem({ movie }) {
  const [reviews, setReviews] = useState([]);

  const addReview = (review) => {
    setReviews([...reviews, review]);
  };

  return (
    <div className="col-md-4 mb-4">
      <div className="card">
        <img
          src={movie.Poster}
          className="card-img-top"
          alt={movie.Title}
          onError={(e) => (e.target.src = "https://via.placeholder.com/150")}
        />
        <div className="card-body">
          <h5 className="card-title">{movie.Title} ({movie.Year})</h5>
          <ReviewForm addReview={addReview} />
          <ul className="list-group mt-2">
            {reviews.map((review, index) => (
              <li key={index} className="list-group-item">{review}</li>
            ))}
          </ul>
        </div>
      </div>
    </div>
  );
}

export default MovieItem;
