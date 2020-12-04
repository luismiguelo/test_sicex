package cl.losheroes.cargasfamiliares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:/spring-camel-context.xml"})
public class SpringBootRestProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestProxyApplication.class, args);
	}
}