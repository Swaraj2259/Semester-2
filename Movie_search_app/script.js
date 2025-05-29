const apiKey = 'ee9d8ab2'; // Replace with your actual API key

document.getElementById('search-btn').addEventListener('click', () => {
  const query = document.getElementById('search-input').value;
  searchMovie(query);
});

async function searchMovie(title) {
  const response = await fetch(`https://www.omdbapi.com/?t=${title}&apikey=${apiKey}`);
  const data = await response.json();

  if (data.Response === "True") {
    document.getElementById('movie-container').innerHTML = `
      <h2>${data.Title} (${data.Year})</h2>
      <img src="${data.Poster}" alt="${data.Title}" height="300"/>
      <p><strong>Genre:</strong> ${data.Genre}</p>
      <p><strong>Director:</strong> ${data.Director}</p>
      <p><strong>Plot:</strong> ${data.Plot}</p>
      <p><strong>IMDB Rating:</strong> ${data.imdbRating}</p>
    `;
  } else {
    document.getElementById('movie-container').innerHTML = `<p>Movie not found! Try another title.</p>`;
  }
}