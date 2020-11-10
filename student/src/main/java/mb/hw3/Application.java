package mb.hw3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 *
 * @author M M BARHOOM
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories(basePackages = "mb.hw3.repository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
