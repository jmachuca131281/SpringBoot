package inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "controller", "dao", "service"})
@EntityScan(basePackages = {"model"}) // EntityScan en el atributo basePackages indica los paquetes donde se encuentran definidas las entidades.
@EnableJpaRepositories(basePackages = {"dao"}) // Indica donde se encuentra las subinterfaces de JpaReposotory
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
