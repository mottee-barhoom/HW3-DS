package mb.hw3.eureka.hw3_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Hw3EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hw3EurekaApplication.class, args);
	}

}
