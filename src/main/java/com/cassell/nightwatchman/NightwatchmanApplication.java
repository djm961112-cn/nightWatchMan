package com.cassell.nightwatchman;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class NightwatchmanApplication {

    public static void main(String[] args) {
        SpringApplication.run(NightwatchmanApplication.class, args);
        log.info("...start!");
    }

}
