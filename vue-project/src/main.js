import { createApp } from 'vue';
import App from './App.vue';
import axios from 'axios';
import router from './router';

const app = createApp(App);
app.config.globalProperties.$http = axios.create({
    baseURL: 'http://localhost:8080',
});
app.use(router);
app.mount('#app');
