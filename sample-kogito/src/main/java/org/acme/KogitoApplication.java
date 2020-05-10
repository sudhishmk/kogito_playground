package org.acme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"org.acme.**", "org.kie.kogito.**"})
public class KogitoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KogitoApplication.class, args);
    }

}