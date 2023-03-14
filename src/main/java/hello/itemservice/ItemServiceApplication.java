package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	// 글로벌 Validator 추가 방법 (모든곳에 적용됨) // implements WebMvcConfigurer
//	@Override
//	public Validator getValidator() {
//		return new ItemValidator();
//	}
}
