import React from "react";
import MovieList from "./components/MovieList";
import "./styles.css"; // Import the custom CSS


function App() {
  return (
    <div className="container">
      <h1 className="text-center text-danger mt-4">Movie Review App</h1>
      <MovieList />
    </div>
  );
}

export default App;
