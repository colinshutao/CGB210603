package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController //将该类交给spring管理
//spring负责加载指定的配置文件

//如果注解中只有一个属性名称为value 则可以省略不屑
@PropertySource(value="classpath:/msg.properties",encoding = "utf-8")
@RequestMapping("get")
public class HelloController {
    @Value("${msg.hello}")
    private String msg;

    @Value("${pro.msg}11")
    private String promsg;

    @RequestMapping("hello")
    public String ad() {
        return msg+promsg;
    }
}
