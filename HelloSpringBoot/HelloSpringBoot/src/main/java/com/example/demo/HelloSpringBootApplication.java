package com.example.demo;

import com.example.demo.bean.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringBootApplication {


    static HelloWorld helloWorld;

    @Autowired
    public void setHelloWorld(HelloWorld helloWorld){
        this.helloWorld=helloWorld;
    }
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);
        System.out.println(helloWorld.sayHelloWorld());

	}

}
