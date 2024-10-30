# FilmManagementSystem



## Current Interface

![image](https://github.com/user-attachments/assets/53a218d6-5512-49ca-9c7a-b7ab144de182)


## Language:

- ### FrontEnd:

  &nbsp;&nbsp;&nbsp; vue

- ### BackEnd:

  &nbsp;&nbsp;&nbsp; java (SpringBoot,Mybatis)


## Details

### 1./vue-project

前端实现。

#### ./src/App.vue

##### <template>

标记语言

li v-for 列出movies中的条目

buttons: Add Movie, Refresh

##### <script>

js

methods: addMovie, fetchMovies从数据库中读取并存到movies列表

---

### 2./BackEnd

后端实现。

### ./src/main

代码逻辑

#### ./resources

##### application.properties:

springboot框架的配置文件

配置了数据库的连接，mapper路径

##### mapper/MovieMapper.xml

mybatis操作数据库

### ./pom.xml

依赖

