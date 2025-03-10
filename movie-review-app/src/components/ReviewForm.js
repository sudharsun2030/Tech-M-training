import React, { useState } from "react";

function ReviewForm({ addReview }) {
  const [review, setReview] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    if (review.trim() === "") return;
    addReview(review);
    setReview("");
  };

  return (
    <form onSubmit={handleSubmit} className="mt-2">
      <input
        type="text"
        className="form-control"
        placeholder="Write a review..."
        value={review}
        onChange={(e) => setReview(e.target.value)}
      />
      <button type="submit" className="btn btn-primary mt-2">
        Submit Review
      </button>
    </form>
  );
}

export default ReviewForm;
