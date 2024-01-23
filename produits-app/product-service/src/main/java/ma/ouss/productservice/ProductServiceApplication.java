package ma.ouss.productservice;

import ma.ouss.productservice.entities.Product;
import ma.ouss.productservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository){
		return args -> {
			productRepository.save(new Product(null,"product 1",Math.random()*9999,"https://guzelhome.ma/cdn/shop/files/modeles-de-miroir-de-decoration-en-bois-casablanca-fes-tanger-agadir-rabat-modeles-de-miroir-casablanca.jpg?v=1697652462"));
			productRepository.save(new Product(null,"product 2",Math.random()*9999,"https://guzelhome.ma/cdn/shop/files/modeles-de-miroir-de-decoration-en-bois-casablanca-fes-tanger-agadir-rabat-modeles-de-miroir-casablanca.jpg?v=1697652462"));
			productRepository.save(new Product(null,"product 3",Math.random()*9999,"https://guzelhome.ma/cdn/shop/files/modeles-de-miroir-de-decoration-en-bois-casablanca-fes-tanger-agadir-rabat-modeles-de-miroir-casablanca.jpg?v=1697652462"));
			System.out.println("helloooo ========================");
		};
	}

}
