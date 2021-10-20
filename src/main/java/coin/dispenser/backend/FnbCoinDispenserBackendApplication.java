package coin.dispenser.backend;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FnbCoinDispenserBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FnbCoinDispenserBackendApplication.class, args);
	}

	public static void runMethod(Integer amount){
		System.out.println(amount);
	}

}
