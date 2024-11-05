# FilmManagementSystem



## Current Interface

![image](https://github.com/user-attachments/assets/53a218d6-5512-49ca-9c7a-b7ab144de182)


## Language:

- ### FrontEnd:

  &nbsp;&nbsp;&nbsp; vue

- ### BackEnd:

  &nbsp;&nbsp;&nbsp; java (SpringBoot,Mybatis)

- ### DataBase:

  &nbsp;&nbsp;&nbsp; MySQL
  

## Details

### 1./vue-project

> 前端实现。

![image](https://github.com/user-attachments/assets/d52ccf0e-2d63-4e6e-a483-1c3151cbd582)


### ./src/App.vue

#### template:

li v-for 列出movies中的条目

buttons: Add Movie(POST), Refresh(GET)

#### script:

methods: addMovie, fetchMovies从数据库中读取并存到movies列表

---

### 2./BackEnd

> 后端实现。

![image](https://github.com/user-attachments/assets/1840666a-1fdf-495c-a33c-37af94fb9205)

*(Maven构建)*

### ./src/main

代码逻辑

- Application.java
【启动类】
- Movie.java
【JPA实体类】对应数据库中的一个表。

- MovieRepository.java
【MyBatis Mapper 接口】定义了与数据库表进行交互的基本 CRUD操作

- MovieController.java
【RESTful API】处理前端的请求，调用上面MovieRepository接口的方法操作数据库。

- MyBatisConfig.java
【MyBatis 配置类】配置 MyBatis，加载 mapper 接口。(SqlSession对象是 MyBatis 中实际执行数据库操作的核心对象)

- WebConfig.java
【SpringMVC 配置类】配置 SpringMVC的跨域资源共享(CORS)

### ./src/main/resources/application.properties

springboot框架的配置文件

配置了数据库的连接，mapper路径

### ./src/main/resources/mapper/MovieMapper.xml

mybatis操作数据库

### ./pom.xml

依赖

### 3.数据库

![image](https://github.com/user-attachments/assets/a39c0cd0-638b-467e-a8f4-e18772ec088e)


![image](https://github.com/user-attachments/assets/b0a2673e-8313-4c48-a8b2-cd724b915153)


