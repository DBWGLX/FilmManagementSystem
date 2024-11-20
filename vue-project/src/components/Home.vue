<template>
  <div>
    <h1>Welcome to the Movie Website</h1>
    <p>Discover and add your favorite movies!</p>
    <div>
      <button @click="goToMovies">Go to Movies</button>
      <button @click="goToAbout">Learn More About Us</button>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    goToMovies() {
      this.$router.push('/movies');
    },
    goToAbout() {
      this.$router.push('/about');
    }
  }
};
</script>

<style>
div {
  text-align: center;
  margin-top: 50px;
}

button {
  margin: 10px;
  padding: 10px 20px;
  font-size: 16px;
  cursor: pointer;
}
</style>
