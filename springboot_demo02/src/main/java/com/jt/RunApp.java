package com.jt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jt.mapper")
//加了包扫描以后 com。jt。mapper里面就不用加@Mapper注解了。但是测试类里面的DI会飘红，没事
public class RunApp {
    public static void main(String[] args) {
        SpringApplication.run(RunApp.class, args);
    }
}
