package spring.solarsystemconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SolarSystemConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolarSystemConfigApplication.class, args);
    }

}
