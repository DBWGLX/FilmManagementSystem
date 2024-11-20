<template>
  <div>
    <h1>Movies</h1>
    <ul>
      <li>
        <strong>Title</strong>, <strong>Genre</strong>, <strong>Rating</strong>, <strong>Year of Issue</strong>
      </li>
      <li v-for="movie in movies" :key="movie.id">
        {{ movie.title }}, {{ movie.genre }}, {{ movie.rating }}, {{ movie.yearOfIssue }}
        <button @click="deleteMovie(movie.id)">Delete</button>
      </li>
    </ul>
    <input v-model="newMovie.title" placeholder="Title" />
    <input v-model="newMovie.genre" placeholder="Genre" />
    <input v-model="newMovie.rating" placeholder="Rating" />
    <input v-model="newMovie.yearOfIssue" placeholder="Year of Issue" />
    <button @click="addMovie(newMovie)" :disabled="!newMovie.title || !newMovie.genre || !newMovie.rating || !newMovie.yearOfIssue">
      Add Movie
    </button>

    <button @click="fetchMovies">Refresh</button>
  </div>
</template>

<script>
export default {
  data() {//组件中定义响应式数据的固定用法
    return {
      movies: [],
      newMovie: { title: '', genre: '', rating: '', yearOfIssue: '' }
    };
  },
  methods: {
    async addMovie(movie) {
      if (!movie.title || !movie.genre || !movie.rating || !movie.yearOfIssue) {
        alert("All fields are required.");
        return;
      }
      if (isNaN(movie.rating) || movie.rating < 0 || movie.rating > 10) {
        alert("Rating must be a number between 0 and 10.");
        return;
      }
      if (isNaN(movie.yearOfIssue) || movie.yearOfIssue < 1900 || movie.yearOfIssue > new Date().getFullYear()) {
        alert("Year of Issue must be a valid year.");
        return;
      }

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
    async deleteMovie(id) {
      try {
        // 调用后端 API 删除电影
        await this.$http.delete(`/api/movies/${id}`);
        // 删除成功后重新获取电影列表
        this.fetchMovies();
      } catch (error) {
        console.error("Error deleting movie:", error);
        alert("Failed to delete movie. Please try again.");
      }
    },
    async fetchMovies() {
      try {
        const response = await this.$http.get('/api/movies');
        this.movies = response.data;
      } catch (error) {
        console.error("Error fetching movies:", error);
        alert("Failed to fetch movies.");
      }
    }
  },
  mounted() {
    this.fetchMovies();
  }
};
</script>
