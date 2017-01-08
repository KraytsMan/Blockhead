package com.kraytsman.blockhead;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.kraytsman.blockhead.domain.repositories.elasticsearch")
@EnableJpaRepositories(basePackages = "com.kraytsman.blockhead.domain.repositories.jpa")
public class BlockHeadApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlockHeadApplication.class, args);
    }
}
