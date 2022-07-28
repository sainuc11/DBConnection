package sainuc11.example.DBConnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DbConnectionApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DbConnectionApplication.class, args);
		System.out.println("DB Application Started");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DbConnectionApplication.class);
	}
}
