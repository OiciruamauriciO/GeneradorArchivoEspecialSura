package cl.salcobrand.archivo.sura.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"cl.salcobrand.archivo.sura"})
public class MsSbPhbArchivoSuraApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSbPhbArchivoSuraApplication.class, args);
		System.out.println("TEST");
	}

}
