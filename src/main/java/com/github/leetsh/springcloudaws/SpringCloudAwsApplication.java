package com.github.leetsh.springcloudaws;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.SpringProperties;

@SpringBootApplication()
public class SpringCloudAwsApplication {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
            + "classpath:aws.yml";

    public static void main(String[] args) {
        //SpringApplication.run(SpringCloudAwsApplication.class, args);
        new SpringApplicationBuilder(SpringCloudAwsApplication.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }

}
