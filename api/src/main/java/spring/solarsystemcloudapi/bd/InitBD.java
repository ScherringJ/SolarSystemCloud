package spring.solarsystemcloudapi.bd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class InitBD implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Initialisation de la BDD");

        String sqlStatements[] = {
                "drop table planete if exists",
                "create table planete (id serial, name varchar(255), discovery varchar(255), type varchar(255))",
                "INSERT INTO planete (name, discovery, type) VALUES ('Mercury', 'Antiquity', 'Terrestrial');" +
                        "INSERT INTO planete (name, discovery, type) VALUES ('Venus', 'Antiquity', 'Terrestrial');" +
                        "INSERT INTO planete (name, discovery, type) VALUES ('Earth', 'Antiquity', 'Terrestrial');" +
                        "INSERT INTO planete (name, discovery, type) VALUES ('Mars', 'Antiquity', 'Terrestrial');" +
                        "INSERT INTO planete (name, discovery, type) VALUES ('Jupiter', 'Antiquity', 'Gas');" +
                        "INSERT INTO planete (name, discovery, type) VALUES ('Saturn', 'Antiquity', 'Gas');" +
                        "INSERT INTO planete (name, discovery, type) VALUES ('Uranus', '1781', 'Gas');" +
                        "INSERT INTO planete (name, discovery, type) VALUES ('Neptune', '1846', 'Gas');"
        };

        Arrays.asList(sqlStatements).stream().forEach(sql -> {
            System.out.println(sql);
            jdbcTemplate.execute(sql);
        });


    }
}
