package com.kodilla.oneToMany;

import com.kodilla.oneToMany.model.Cart;
import com.kodilla.oneToMany.model.Item;
import com.kodilla.oneToMany.model.Producent;
import com.kodilla.oneToMany.repository.CartRepository;
import com.kodilla.oneToMany.repository.ProducentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class OneToManyApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(OneToManyApplication.class, args);

		CartRepository cartRepository = configurableApplicationContext.getBean(CartRepository.class);
		ProducentRepository producentRepository = configurableApplicationContext.getBean(ProducentRepository.class);

		Producent producent = new Producent("Samsung");
		producentRepository.save(producent);
		Cart cart = new Cart("Card125", producent);
		Item item1 = new Item("12345", cart);
		Item item2 = new Item("54321", cart);
		List<Item> listItem = Arrays.asList(item1, item2);
		cart.setItemList(listItem);
		cartRepository.save(cart);

	}
}
