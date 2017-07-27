package com.leo.prj.companyreview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableNeo4jRepositories("com.leo.prj.companyreview.model.repository")
@EntityScan("com.leo.prj.companyreview.model.entity")
@EnableTransactionManagement
public class Application {
	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
