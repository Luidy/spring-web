package com.luidy.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 build.gradle
 - 버전설정, 라이브러리 가져오는 곳
 - mavenCentral(): 라이브러리를 다운받는 곳


*/

@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}

}
