<template>
  <div>
    <h1>Movies</h1>
    <ul>
      <li>
        <strong>Title</strong>, <strong>Genre</strong>, <strong>Rating</strong>, <strong>Year of Issue</strong>
      </li>
      <li v-for="movie in movies" :key="movie.id">
        {{ movie.title }}, {{ movie.genre }}, {{ movie.rating }}, {{ movie.yearOfIssue }}
      </li>
    </ul>
    <input v-model="newMovie.title" placeholder="Title" />
    <input v-model="newMovie.genre" placeholder="Genre" />
    <input v-model="newMovie.rating" placeholder="Rating" />
    <input v-model="newMovie.yearOfIssue" placeholder="Year of Issue" />
    <button @click="addMovie(newMovie)">Add Movie</button>

    <button @click="fetchMovies">Refresh</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      movies: [],
      newMovie: { title: '', genre: '', rating: '', yearOfIssue: '' }
    };
  },
  methods: {
    async addMovie(movie) {
      try {
        movie.yearOfIssue = parseInt(movie.yearOfIssue, 10);
        movie.rating = parseFloat(movie.rating);

        console.log("YearofIssue:", movie.yearOfIssue);
        console.log("Rating:", movie.rating);

        await this.$http.post('/api/movies', movie);
        this.fetchMovies();
      } catch (error) {
        console.error("Error adding movie:", error);
      }
    },
    async fetchMovies() {
      const response = await this.$http.get('/api/movies');
      this.movies = response.data;
    }
  },
  mounted() {
    this.fetchMovies();
  }
};
</script>
