package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloGitApplication.class, args);
	}

	
	private void use4git() {
		System.out.println("更新1");
		System.out.println("更新2");
		System.out.println("创建分支");
		System.out.println("主线添加");
		System.out.println("分支添加");
		System.out.println("线下添加");
		System.out.println("在线添加");
		// 提交之前先pull一下
	}
}
