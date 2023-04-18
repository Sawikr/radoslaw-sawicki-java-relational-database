package com.kodilla.oneToMany;

import com.kodilla.oneToMany.model.Cart;
import com.kodilla.oneToMany.model.Item;
import com.kodilla.oneToMany.repository.CartRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.*;

@SpringBootApplication
public class OneToManyApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(OneToManyApplication.class, args);

		CartRepository cartRepository = configurableApplicationContext.getBean(CartRepository.class);

		Cart cart = new Cart("Card125");
		Item item1 = new Item("12345", cart);
		Item item2 = new Item("54321", cart);
		List<Item> listItem = Arrays.asList(item1, item2);
		cart.setItemList(listItem);
		cartRepository.save(cart);

	}
}
