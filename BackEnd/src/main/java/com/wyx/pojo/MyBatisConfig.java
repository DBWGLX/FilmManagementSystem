package com.wyx.pojo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration//表示该类是一个配置类，类似于 Spring XML 配置文件。
public class MyBatisConfig {

    //SqlSession 对象是 MyBatis 中实际执行数据库操作的核心对象

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();//一个工厂 Bean,创建 SqlSessionFactory 实例
        sessionFactory.setDataSource(dataSource);//设置 数据库连接的来源，Spring 会自动注入它。
        return sessionFactory.getObject();
    }

    //上面的注入到下面，下面管理会话的生命周期

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {//SqlSession 的实现类，线程安全
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
