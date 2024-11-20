<template>
  <div>
    <nav>
      <router-link to="/">Home</router-link>
      <router-link to="/movies">Movies</router-link>
      <router-link to="/about">About</router-link>
    </nav>
    <router-view />
  </div>
</template>
<style>
nav {
  display: flex;
  gap: 10px;
  margin-bottom: 20px;
}
</style>
