package com.user.math.opr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.user.math")
@SpringBootApplication
public class SampleWebAppApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SampleWebAppApplication.class, args);
	}

}
