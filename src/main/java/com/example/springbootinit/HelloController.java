package com.example.springbootinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zsz
 * @Description
 * @date 2022/4/12
 */
@RestController
public class HelloController{

    @RequestMapping("/hello")
    public String hello(){
        return "Hello SpringBoot World!";
    }

    //第一种Value方式获取数据
    @Value("${name}")
    private String name;

    @Value("${person.name}")
    private String name2;

    @Value("${person.age}")
    private String age;

    @Value("${address[0]}")
    private String address;

    @Value("${address[1]}")
    private String address2;

    @Value("${msg1}")
    private String msg1;

    @Value("${msg2}")
    private String msg2;

    //第二种获取数据的方式--Environment实例化调方法
    @Autowired
    private Environment env;

    //第三种获取数据的方式--实体类加@ConfigurationProperties注解
    @Autowired
    private Person person;

    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println(name);
        System.out.println(name2);
        System.out.println(age);
        System.out.println(address);
        System.out.println(address2);
        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(".........................");
        System.out.println(env.getProperty("person.name"));
        System.out.println(env.getProperty("person.age"));
        System.out.println(env.getProperty("address[0]"));
        System.out.println(".........................");
        System.out.println(person);
        return "Hello SpringBoot World!";



    }






}
