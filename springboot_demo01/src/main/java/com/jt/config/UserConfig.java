package com.jt.config;

import com.jt.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//注解组合: @configuration + @Bean
@Configuration//标识这是一个配置类
public class UserConfig {
    //spring 容器->大写的map<key,value>集合
    //@Bean:是把被注解的对象交给spring来处理
    //Map<方法名称key,方法返回值value>
    @Bean
    public User user111() {
        return new User(111, "xiaoming");
    }
}
