import { createRouter, createWebHistory } from 'vue-router';
import Home from '../components/Home.vue';
import Movies from '../components/Movies.vue';
import About from '../components/About.vue';

const routes = [
  { path: '/', component: Home, name: 'Home' },
  { path: '/movies', component: Movies, name: 'Movies' },
  { path: '/about', component: About, name: 'About' },
  { path: '/:pathMatch(.*)*', component: () => import('../components/NotFound.vue'), name: 'NotFound' }
];

const router = createRouter({
  history: createWebHistory(),
  routes
});

export default router;
