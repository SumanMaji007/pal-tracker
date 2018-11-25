package io.pivotal.pal.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ="io.pivotal.pal.tracker")
public class PalTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }
}
