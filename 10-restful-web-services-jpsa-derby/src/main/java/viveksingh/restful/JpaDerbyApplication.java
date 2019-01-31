package viveksingh.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JpaDerbyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDerbyApplication.class, args);
	}

}
