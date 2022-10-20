package com.sample.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com"})
@EnableJpaRepositories(basePackages= {"com.sample.insurance.repository"})
@EntityScan("com.sample.insurance.model")
public class InsuranceApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(InsuranceApplication.class, args);
	}
}
