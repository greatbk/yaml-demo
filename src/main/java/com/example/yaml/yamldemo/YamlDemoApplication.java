package com.example.yaml.yamldemo;

import com.example.yaml.yamldemo.entity.MciRemoteEntities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YamlDemoApplication {

	@Autowired
	MciRemoteEntities mciRemoteEntities;

	public static void main(String[] args) {
		SpringApplication.run(YamlDemoApplication.class, args);
	}

}
